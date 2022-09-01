package je.panse.doro.comm.item_subexecute;

public class ResultEditAdd {
	//---String change  <  >  adult from double
	public static String cr_result(double valresult, String iconAdd){
		String rvalresult = (iconAdd + Double.toString(valresult));
		return rvalresult;
	}
	//---String result Positive Reactive 
	static String cr_result(String valresult){
		String rvalresult = ("➤ " + valresult);
		return rvalresult;
	}
	//---double result low only 
	static String cr_result(double valhigh, double valresult ){
		String rvalresult = (">  " + Double.toString(valresult));
		return rvalresult;
	}
	//---double result range 
	static String cr_result(double vallow, double valhigh, double valresult ){
		String rvalresult = Double.toString(valresult);
		if(vallow > valresult) {
			rvalresult = (Double.toString(valresult)+ " ⮟  ");
		}
		else if (valhigh < valresult) {
			rvalresult = (Double.toString(valresult)+ " ⮝  ");
		}
		return rvalresult;
	}
}