
public class Wine implements Bevarage {
	private int year;
	private String vineyard;
	
	public Wine(int year, String vineyard) {
		this.year = year;
		this.vineyard = vineyard;
	}
	
	public Wine() {
		this(2016, "Tokaj");
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {

		this.year = year;
	}
	public String getVineyard() {
		return vineyard;
	}
	public void setVineyard(String vineyard) {
		this.vineyard = vineyard;
	}
	public boolean isValidYear(int year){
		return this.year>=1500 && year<=2016;	
	}

	@Override
	public void drink() {
		System.out.println("Year= " + year + " & vineyard= " + vineyard);
	}
}
