
public class Tabel extends Element {
	String nume;

	public Tabel(String nume) {
		super();
		this.nume = nume;
	}
	
	public void print() {
		System.out.println("Table with Title: " + nume);
	}
}
