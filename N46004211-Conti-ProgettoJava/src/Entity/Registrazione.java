package Entity;



import java.util.*;

public class Registrazione {

	private ArrayList<Acquisto> acquisti;
	private Rimborso rimborso;
	private String id;
	private String password;

	public void setRimborso(float importo) {
		this.rimborso.setRimborso(importo);
	}
	public ArrayList<Acquisto> getAcquisti() {
		return acquisti;
	}

	public void setAcquisti(ArrayList<Acquisto> acquisti) {
		this.acquisti = acquisti;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public int ContaNumeroAcquisti() {
		return this.acquisti.size();
	}


	public int CalcolaImporto() {
		int totale=0;
		for(int i=0;i<acquisti.size();i++) {
			totale += (acquisti.get(i).getImporto());
		}
		return totale;
	}
	
	Registrazione(){
		acquisti = new ArrayList<Acquisto>();
		rimborso = new Rimborso ();
	}
	/*Registrazione(String id, String psw){
		StubRegistrazione StR = new StubRegistrazione(id, psw);
		this.id=StR.getId();
		this.password=StR.getPassword();
		acquisti = new ArrayList<Acquisto>();
		for(int i=0;i<StR.getAcquisti().size();i++) {
			Acquisto A = new Acquisto();
			A.setData(StR.getAcquisti().get(i).getData());
			A.setImporto(StR.getAcquisti().get(i).getImporto());
			acquisti.add(A);
		}
		rimborso = new Rimborso();
		
	}
	*/
}