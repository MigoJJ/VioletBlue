package je.panse.doro.comm.item_execute.souslab7;

import java.io.IOException;

public class CalcBP {
    public static void main(String[] args) {
    	        String cmd = "gnome-terminal --working-directory='/home/migowj/ittia1_chart/addjar_ittia5/hito/bp' -e 'bash -c \"command; exec bash\"'";
    	        try {
    	            Runtime.getRuntime().exec(cmd);
    	        } catch (IOException e) {
    	            e.printStackTrace();
    	        }
    	    }
//
//    	
//
//    	String cd = "cd /home/migowj/ittia1_chart/addjar_ittia5/hito/bp";
//    	
//    	String cmd = "gnome-terminal -e 'bash -c \"java -jar /home/migowj/ittia1_chart/addjar_ittia5/hito/bp/vitalsign.jar; exec bash\"'";
//        try {
//          Runtime.getRuntime().exec(cd);
//        	Runtime.getRuntime().exec(cmd);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
