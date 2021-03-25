package Control;

public class RichiestaRimborsoController {
	static public String RichiestaRimborsoHandler(int codice, String id, String psw) {
		String stringa = VerificaRimborso(codice, id, psw);
		if(stringa.equals("Inserimento dei dati valido, richiesta in corso")) {
			stringa = "Il rimborso che riceverai sul conto corrente è di " + Float.toString(RichiestaRimborso(codice, id, psw)) + " euro";
		}
		return stringa;
	}

	
	static private float RichiestaRimborso(int codice, String id, String psw) {
		float imp=Entity.ApplicazioneCashBack.RichiediRimborso(codice, id, psw);
		return imp;
	}

	
	static private String VerificaRimborso(int codice, String id, String psw) {
		Entity.ApplicazioneCashBack.init();
		String stringa=Entity.ApplicazioneCashBack.VerificaRimborso(codice, id, psw);
		return stringa;
	}

}