package Entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


import Stub.StubProgrammaCashBack;
public class ProgrammaCashBack {

	private ArrayList<Registrazione> registrazioni;
	private int codice;
	private String dataFine;
	private int numeroMinimo;
	private int percentuale;
	private int tetto;


	public Registrazione VerificaRegistrazione(String id, String psw) {
		int i=0;
		while(i<registrazioni.size()){
			if ((registrazioni.get(i).getId().equals(id)) && (registrazioni.get(i).getPassword().equals(psw))) {
				return registrazioni.get(i);
			} else {
				i++;
			}
		}
		return null;
	}

	public float CalcolaRimborso(Registrazione reg) {
		int importotale = reg.CalcolaImporto();
		float rimb = (importotale*this.percentuale)/100;
		if(rimb>=tetto) rimb=tetto;
		reg.setRimborso(rimb);
		return rimb;
	}

	public boolean VerificaData() {
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Calendar cal  = Calendar.getInstance();
			try {
				cal.setTime(df.parse(this.dataFine));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			Calendar today = Calendar.getInstance();
			if(today.compareTo(cal)>0) return true;
			
		    else return false;	
	}
	public boolean VerificaAcquisti(Registrazione reg) {
		int cont = reg.ContaNumeroAcquisti();
		if(cont>=numeroMinimo) return true;
		else return false;
	}
	ProgrammaCashBack(int codice){
		StubProgrammaCashBack StPB = new StubProgrammaCashBack(codice);
		this.codice=StPB.getCodice();
		this.dataFine=StPB.getDataFine();
		this.numeroMinimo=StPB.getNumeroMinimo();
		this.percentuale=StPB.getPercentuale();
		this.tetto=StPB.getTetto();
		registrazioni = new ArrayList<Registrazione>();
		
		for(int i=0;i<StPB.getRegistrazioni().size();i++) {
			Registrazione R = new Registrazione();
			for(int j=0;j<StPB.getRegistrazioni().get(i).getAcquisti().size();j++) {
				Acquisto A = new Acquisto();
				A.setData(StPB.getRegistrazioni().get(i).getAcquisti().get(j).getData());
				A.setImporto(StPB.getRegistrazioni().get(i).getAcquisti().get(j).getImporto());
				R.getAcquisti().add(A);
			}
			R.setId(StPB.getRegistrazioni().get(i).getId());
			R.setPassword(StPB.getRegistrazioni().get(i).getPassword());
			registrazioni.add(R);
		}
		
	}

	public int getCodice() {
		return codice;
	}

}