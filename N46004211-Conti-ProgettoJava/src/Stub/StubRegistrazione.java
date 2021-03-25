package Stub;

import java.util.ArrayList;

public class StubRegistrazione {

	private ArrayList<StubAcquisto> acquisti;
	private StubRimborso rimborso;
	private String id;
	private String password;
	
	public ArrayList<StubAcquisto> getAcquisti() {
		return acquisti;
	}

	public StubRimborso getRimborso() {
		return rimborso;
	}

	public void setRimborso(StubRimborso rimborso) {
		this.rimborso = rimborso;
	}

	public void setAcquisti(ArrayList<StubAcquisto> acquisti) {
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

	public StubRegistrazione(String id, String psw) {
		if(id.equals("matteo.conti000") && psw.equals("maradona10")) {
			this.setId("matteo.conti000");
			this.setPassword("maradona10");
			acquisti = new ArrayList<StubAcquisto>();
			StubAcquisto ACQ1 = new StubAcquisto("12/01/2019", 100);
			StubAcquisto ACQ2 = new StubAcquisto("14/01/2019", 150);
			StubAcquisto ACQ3 = new StubAcquisto("15/04/2019", 20);
			this.acquisti.add(ACQ1);
			this.acquisti.add(ACQ2);
			this.acquisti.add(ACQ3);
			rimborso = new StubRimborso(0);
		}
		if(id.equals("franknapoli.123") && psw.equals("ciaociao99")) {
			this.setId("franknapoli.123");
			this.setPassword("ciaociao99");
			acquisti = new ArrayList<StubAcquisto>();
			StubAcquisto ACQ1 = new StubAcquisto("12/02/2020", 700);
			StubAcquisto ACQ2 = new StubAcquisto("14/01/2020", 210);
			StubAcquisto ACQ3 = new StubAcquisto("01/04/2020", 110);
			StubAcquisto ACQ4 = new StubAcquisto("13/12/2020", 10);
			this.acquisti.add(ACQ1);
			this.acquisti.add(ACQ2);
			this.acquisti.add(ACQ3);
			this.acquisti.add(ACQ4);
			rimborso = new StubRimborso(0);

		}
		if(id.equals("eduard.conti123") && psw.equals("lavezzi000")) {
			this.setId("eduard.conti123");
			this.setPassword("lavezzi000");
			acquisti = new ArrayList<StubAcquisto>();
			StubAcquisto ACQ1 = new StubAcquisto("02/01/2021", 5);
			StubAcquisto ACQ2 = new StubAcquisto("03/01/2021", 15);
			StubAcquisto ACQ3 = new StubAcquisto("10/01/2021", 500);
			this.acquisti.add(ACQ1);
			this.acquisti.add(ACQ2);
			this.acquisti.add(ACQ3);
			rimborso = new StubRimborso(0);

		}
		if(id.equals("antonio.guarino") && psw.equals("osimhen100")) {
			this.setId("antonio.guarino");
			this.setPassword("osimhen100");
			acquisti = new ArrayList<StubAcquisto>();
			StubAcquisto ACQ1 = new StubAcquisto("16/11/2020", 15);
			this.acquisti.add(ACQ1);
			rimborso = new StubRimborso(0);

		}
	}

}