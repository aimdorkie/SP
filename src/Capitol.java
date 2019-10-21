import java.util.ArrayList;
import java.util.List;

public class Capitol {
	private String nume;
	private List<Subcapitol> subcapitole = new ArrayList<Subcapitol>();
	
	public Capitol(String nume) {
		super();
		this.nume = nume;
	}
	
	public int addSubcapitol(String nume) {
		Subcapitol obj = new Subcapitol(nume);
		subcapitole.add(obj);
		return subcapitole.indexOf(obj);
	}
	
	public Subcapitol getSubcapitol(int index) {
		return subcapitole.get(index);
	}

	public void print() {
		System.out.println("Chapter: " + nume);
		for(Subcapitol x : subcapitole) {
			x.print();
		}
	}
}
