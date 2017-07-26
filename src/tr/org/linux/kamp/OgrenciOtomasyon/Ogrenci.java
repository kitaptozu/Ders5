package tr.org.linux.kamp.OgrenciOtomasyon;

public class Ogrenci {

	private String adi;
	private String tc;
	private int not;

	public String getAdi() {

		return adi;
	}

	public void setAdi(String adi) throws OgrenciException{
		if(adi.length()>=2) {
		this.adi = adi;
		}else {
			throw new OgrenciException(); 
		}
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) throws OgrenciException {
		if (tc.length() == 11) {
			this.tc = tc;
		} else {
			
			throw new OgrenciException();
		}

	}

	public int getNot() {
		return not;
	}

	public void setNot(int not) {

		if (not >= 0 && not <= 100) {
			this.not = not;
		} else {
			try {
				
				throw new OgrenciException();
				
			} catch (OgrenciException e) {
				System.out.println(e);
			}
		}

	}

}
