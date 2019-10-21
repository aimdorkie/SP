import java.util.ArrayList;
import java.util.List;

public class Subcapitol {
	String nume;
	List<Element> elemente = new ArrayList<Element>();
	
	public Subcapitol(String nume) {
		super();
		this.nume = nume;
	}
	
	public int addImagine(String nume) {
		Imagine obj = new Imagine(nume);
		elemente.add(obj);
		return elemente.indexOf(obj);
	}
	
	public int addParagraf(String nume) {
		Paragraf obj = new Paragraf(nume);
		elemente.add(obj);
		return elemente.indexOf(obj);
	}
	
	public void addTabel(String nume) {
		elemente.add(new Tabel(nume));
	}
	
	public Imagine getImagine(int index) {
		return (Imagine)elemente.get(index);
	}
	
	public Paragraf getParagraf(int index) {
		return (Paragraf)elemente.get(index);
	}
	
	public Tabel getTabel(int index) {
		return (Tabel)elemente.get(index);
	}
	
	public void print() {
		System.out.println("Subchapter: " + nume);
		for(Element x : elemente)
			x.print();
	}
	
}
