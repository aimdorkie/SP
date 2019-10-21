
public class Imagine extends Element {
	private String nume;

	public Imagine(String nume) {
		super();
		this.nume = nume;
	}
	
	public void print() {
		System.out.println("Image with Title: " + nume);
	}
	
}
