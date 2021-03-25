package Entity;

import java.util.*;

public class ApplicazioneCashBack {

	static ArrayList<ProgrammaCashBack> programmi;
	private static ApplicazioneCashBack istanza=null;
	public static void init() {
		if(istanza==null) istanza=new ApplicazioneCashBack();
	}

	static public ProgrammaCashBack VerificaProgramma(int codice) {
			int i=0;
			boolean trovato=false;
			while((i<programmi.size()) && (!trovato)){
				if (programmi.get(i).getCodice() == codice) {
					trovato=true;
				} else {
					i++;
				}
			}
			if (trovato) {
				return programmi.get(i);
			} else {
				return null;
			}
		}

	static public float RichiediRimborso(int codice, String id, String psw) {
		ProgrammaCashBack prog=VerificaProgramma(codice);
		Registrazione reg = prog.VerificaRegistrazione(id, psw);
		float rimb = prog.CalcolaRimborso(reg);
		return rimb;
	}

	
	static public String VerificaRimborso(int codice, String id, String psw) {
		ProgrammaCashBack prog=VerificaProgramma(codice);
		if(prog==null) return "Programma di CashBack non esistente";
		else {
			Registrazione reg = prog.VerificaRegistrazione(id, psw);
			if(reg==null) return "Registrazione non esistente";
			else {
				if(prog.VerificaData()==false) return "Il programma non è ancora finito";
				else {
					boolean numeroMin=prog.VerificaAcquisti(reg);
					if(numeroMin==false) return "Non hai fatto abbastanza acquisti";
					else {
						return "Inserimento dei dati valido, richiesta in corso";
					}
				}
			}
		}
	}
	private ApplicazioneCashBack(){
		programmi = new ArrayList<ProgrammaCashBack>();
		ProgrammaCashBack PCB1 = new ProgrammaCashBack(100000);
		ProgrammaCashBack PCB2 = new ProgrammaCashBack(100001);
		ProgrammaCashBack PCB3 = new ProgrammaCashBack(100002);
		ApplicazioneCashBack.programmi.add(PCB1);
		ApplicazioneCashBack.programmi.add(PCB2);
		ApplicazioneCashBack.programmi.add(PCB3);
	}
}