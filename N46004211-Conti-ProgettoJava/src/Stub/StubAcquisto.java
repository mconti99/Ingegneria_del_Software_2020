package Stub;

public class StubAcquisto {

	private String data;
	private int importo;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getImporto() {
		return importo;
	}
	public void setImporto(int importo) {
		this.importo = importo;
	}

	StubAcquisto(String dat, int imp){
		this.setData(dat);
		this.setImporto(imp);
	}

}