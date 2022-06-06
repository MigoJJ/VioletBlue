package je.panse.doro.aeternum.aete;

import java.io.IOException;


public class ParseStringDis {
	public static void main(String args[]) throws IOException
	{
		String str = ":ctg / geekss@for@geekss";
		String[] subOfSuj = str.split("/", 2);

		if (str.startsWith(":")) {
			subOfSuj[0] = subOfSuj[0].trim(); 
			String aa = subOfSuj[0].substring(1, subOfSuj[0].length());
			System.out.println(" substring(1, str.length());>>>" + subOfSuj[0]);
			subOfSuj[0] = code_select(aa);
		}
		for (String a : subOfSuj)
			System.out.print(a);
	}

	public static String code_select(String dcode) throws IOException {
	    String cresult = "";
		switch (dcode) {

			case "t" : cresult =("#  Hypertension ")	;break;
			case "c" : cresult =("#  Hypercholesterolemia ");break;
			case "ctg" : cresult =("#  HyperTriGlyceridemia ");break;
          
			default: System.out.println(" ReInsert disease code please ...  : ");break;
		}
		return cresult;
	}
//------------------------------------------
}