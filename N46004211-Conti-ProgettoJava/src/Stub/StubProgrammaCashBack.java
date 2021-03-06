package Stub;

import java.util.ArrayList;



public class StubProgrammaCashBack{
	private ArrayList<StubRegistrazione> registrazioni;
	
	private int codice;
	private String dataInizio;
	private String dataFine;
	private int numeroMinimo;
	private int percentuale;
	private int tetto;
	public ArrayList<StubRegistrazione> getRegistrazioni() {
		return registrazioni;
	}
	public void setRegistrazioni(ArrayList<StubRegistrazione> registrazioni) {
		this.registrazioni = registrazioni;
	}
	
	public int getCodice() {
		return codice;
	}
	public String getDataInizio() {
		return dataInizio;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}
	public String getDataFine() {
		return dataFine;
	}
	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}
	public int getNumeroMinimo() {
		return numeroMinimo;
	}
	public void setNumeroMinimo(int numeroMinimo) {
		this.numeroMinimo = numeroMinimo;
	}
	public int getPercentuale() {
		return percentuale;
	}
	public void setPercentuale(int percentuale) {
		this.percentuale = percentuale;
	}
	public int getTetto() {
		return tetto;
	}
	public void setTetto(int tetto) {
		this.tetto = tetto;
	}
	public StubProgrammaCashBack(int cod){
		if(cod==100000) {
			this.setCodice(100000);
			this.setDataInizio("01/01/2019");
			this.setDataFine("31/12/2019");
			this.setNumeroMinimo(1);
			this.setPercentuale(10);
			this.setTetto(1000);
			registrazioni = new ArrayList<StubRegistrazione>();
			StubRegistrazione RE1 = new StubRegistrazione("matteo.conti000", "maradona10");
			this.registrazioni.add(RE1);
			
		}
		if(cod==100001) {
			this.setCodice(100001);
			this.setDataInizio("01/01/2020");
			this.setDataFine("31/12/2020");
			this.setNumeroMinimo(2);
			this.setPercentuale(5);
			this.setTetto(50);
			registrazioni = new ArrayList<StubRegistrazione>();
			StubRegistrazione RE1 = new StubRegistrazione("franknapoli.123", "ciaociao99");
			StubRegistrazione RE2 = new StubRegistrazione("antonio.guarino", "osimhen100");
			this.registrazioni.add(RE1);
			this.registrazioni.add(RE2);
		}
		if(cod==100002) {
			this.setCodice(100002);
			this.setDataInizio("01/01/2021");
			this.setDataFine("31/12/2021");
			this.setNumeroMinimo(5);
			this.setPercentuale(25);
			this.setTetto(1500);
			registrazioni = new ArrayList<StubRegistrazione>();
			StubRegistrazione RE1 = new StubRegistrazione("eduard.conti123", "lavezzi000");
			this.registrazioni.add(RE1);
		}
	}
}