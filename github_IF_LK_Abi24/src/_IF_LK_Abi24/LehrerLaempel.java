package _IF_LK_Abi24;

import gui.GUI;
import linear.List;
import linear.ListWithViewer;

public class Lehrer_Laempel {
	private List<String> lieblingsSchueler;
	
	public Lehrer_Laempel() {
		lieblingsSchueler = new ListWithViewer<String>();
		lieblingsSchueler.append("Max");
		lieblingsSchueler.append("Moritz");
	}
	
	public void lieblingsSchuelerHinzufuegen(String pName) {
		lieblingsSchueler.append(pName);
	}
	
	public static void main(String[] args) {
		Lehrer_Laempel ll = new Lehrer_Laempel();
		new GUI(ll);
	}
}
