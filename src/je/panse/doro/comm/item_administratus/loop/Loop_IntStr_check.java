package je.panse.doro.comm.item_administratus.loop;

public class Loop_IntStr_check {
	public static void main(String inputStr) {
		boolean ii = Loop_IntStr_check.isNumeric(inputStr);
	    if (ii != false) {
	    	System.out.println("i numeric...: "+inputStr); // true
		}else if (ii != true){
	    	System.out.println("i charcter...: "+inputStr); // true
		}else {
			
		}
	}

	public static boolean isNumeric(String i) {
	    if (i == null) {
	        return false;
	    }
	    try {
	        Double.parseDouble(i);
	        return true;
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	}
}
