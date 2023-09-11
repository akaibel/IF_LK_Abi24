package _IF_LK_Abi24;

import gui.GUI;
import linear.List;
import linear.ListWithViewer;

public class LehrerLaempel {
	private List<String> lieblingsSchueler;
	
	public LehrerLaempel() {
		lieblingsSchueler = new ListWithViewer<String>();
		lieblingsSchueler.append("Max");
		lieblingsSchueler.append("Moritz");
	}
	
	public void lieblingsSchuelerHinzufuegen(String pName) {
		lieblingsSchueler.append(pName);
	}
	
	public static void main(String[] args) {
		LehrerLaempel ll = new LehrerLaempel();
		new GUI(ll);
	}
}
