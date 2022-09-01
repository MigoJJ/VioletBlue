package je.panse.doro.comm.item_subexecute;

public class ResultEditAdd {
	//---String change  <  >  adult from double
	public static String cr_result(double valresult, String iconAdd){
		String rvalresult = (iconAdd + Double.toString(valresult));
		return rvalresult;
	}
	//---String result Positive Reactive 
	static String cr_result(String valresult, String iconAdd){
		String rvalresult = ("➤ " + valresult);
		return rvalresult;
	}
	//---double result range 
	public static String cr_result(double vallow, double valhigh, double valresult ){
		String rvalresult = Double.toString(valresult);
		if(vallow > valresult) {
			rvalresult = (Double.toString(valresult)+ "  ⮟");
		}
		else if (valhigh < valresult) {
			rvalresult = (Double.toString(valresult)+ "   ⮝");
		}
		return rvalresult;
	}
}