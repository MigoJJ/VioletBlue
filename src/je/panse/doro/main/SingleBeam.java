package je.panse.doro.main;

import je.panse.doro.comm.item_administratus.Menu_list;

public class SingleBeam {
	public static void main(String[] args) throws Exception {
		Menu_list.main(Enter.wtsi + "/SingleBeam");
		Debut sb2 = new Debut(); 
		sb2.main(null);
	}
}