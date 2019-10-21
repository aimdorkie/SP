import java.util.ArrayList;
import java.util.List;

public class Carte {
	
	String nume;
	List<Autor> autori = new ArrayList<Autor>();
	List<Capitol> capitole = new ArrayList<Capitol>();
	

	public Carte(String nume) {
		super();
		this.nume = nume;
	}
	
	
	public void addAutor(Autor e) {
		autori.add(e);
	}
	
	public Autor getAutor(int index) {
		return autori.get(index);
	}
	
	public int addCapitol(String nume) {
		Capitol obj = new Capitol(nume);
		capitole.add(obj);
		return capitole.indexOf(obj);
	}
	
	public Capitol getCapitol(int index) {
		return capitole.get(index);
	}
	
	public void print() {
		System.out.println("Book: " + nume);
		for(Autor x : autori)
			x.print();
		for(Capitol x : capitole)
			x.print();
	}
	
	
	
}
