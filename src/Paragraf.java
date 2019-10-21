
public class Paragraf extends Element {
	private String nume;

	public Paragraf(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	
	public void print() {
		System.out.println("Paragraph: " + nume);
	}
	
	
	
}
