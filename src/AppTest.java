
public class AppTest {

	public static void main(String[] args) {
		Carte newCarte = new Carte("Book name");
		
		Autor auth = new Autor("Autor name");
		newCarte.addAutor(auth);
		int indexOfChapter = newCarte.addCapitol("Capitolul unu");
		Capitol chaptOne = newCarte.getCapitol(indexOfChapter);
		int indexOfSubChapter = chaptOne.addSubcapitol("Subcapitolul unu"); 
		Subcapitol chapOneOne = chaptOne.getSubcapitol(indexOfSubChapter);
		int indexOfImage = chapOneOne.addImagine("Imaginea unu");
		int indexOfParagraph = chapOneOne.addParagraf("Paragraful unu");
		chapOneOne.addParagraf("Paragraful doi");
		chapOneOne.addParagraf("Paragraful trei");
		chapOneOne.addImagine("Imaginea doi");
		chapOneOne.addParagraf("Paragraful patru");
		chapOneOne.addTabel("Tabel unu");
		
		chapOneOne.print();
		
	}

}
