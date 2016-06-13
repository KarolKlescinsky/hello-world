
public class Tea implements Bevarage {

	private Flavour flavour;

	public Tea() {
		this.flavour = (Flavour.pure_green);
	}

	public Tea(Flavour flavour) {
		this.flavour = flavour;
	}

	public Flavour getFlavour() {
		return flavour;
	}

	public void setFlavour(Flavour flavour) {
		this.flavour = flavour;
	}
	
	private String getFlavourString(Flavour flavour){
		
		String flavourString;
		
		switch (flavour){
		case black: return "nigga";
		case lemon: return "sour lemon";
		case mint: return "fresh mint";
		case orange: return "orange orange";
		case pure_green: return "pure green";
		case strawberry: return "forest strawberry";
		default : flavourString= "tasteless";
		}
		return flavourString;
	}

	public void drink() {
		System.out.println("Mmmm, this " + getFlavourString(flavour) + " tea is delicious!");
	}
}
