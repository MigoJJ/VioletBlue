package je.panse.doro.comm;

import java.io.IOException;		
import je.panse.doro.main.Enter;

public class File_cdrw{
    public static void main(String args[]) throws IOException
    {
        //Creating object of InstanceExample Class
    	File_cdrw_proc ob1 = new File_cdrw_proc();
    	File_cdrw_proc ob2 = new File_cdrw_proc(); 

    	File_cdrw_proc ob3 = new File_cdrw_proc(); 
    	File_cdrw_proc ob4 = new File_cdrw_proc(); 
    	File_cdrw_proc ob5 = new File_cdrw_proc(); 

    	File_cdrw_proc ob7 = new File_cdrw_proc(); 
    	File_cdrw_proc ob8 = new File_cdrw_proc();        	
    	File_cdrw_proc ob9 = new File_cdrw_proc();        	
    	
        //Calling printInstanceVariable() for each object
//        ob1.printInstanceVariable();
//        ob2.printInstanceVariable();
//        ob4.deletefiler("/home/migowj/git/violetBlue0306/src/je/panse/doro/comm/test.txt");
        ob3.checkfiler("/home/migowj/git/violetBlue0306/src/je/panse/doro/comm/test.txt");
        ob4.copyfiler("/home/migowj/git/violetBlue0306/src/je/panse/doro/comm/test.txt", "/home/migowj/git/violetBlue0306/src/je/panse/doro/comm/copied_test.txt");
        ob5.readfiler("/home/migowj/git/violetBlue0306/src/je/panse/doro/comm/copied_test.txt");
        ob7.rwfiler("/home/migowj/git/violetBlue0306/src/je/panse/doro/comm/copied_test.txt", Enter.wtf + "chartPlate");
        ob9.formdircopier("");
    }
}
