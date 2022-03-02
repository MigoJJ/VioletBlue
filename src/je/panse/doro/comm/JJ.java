package je.panse.doro.comm;

import java.io.*;

public class JJ {
	public static void main (String[] args) {
		JJ a = new JJ();
	  a.appendToCheckbook();
	} 
	public void appendToCheckbook () {
	  BufferedWriter bw = null;
	  try {
		  	bw = new BufferedWriter(new FileWriter("checkbook.dat", true));
			bw.write("400:08311998:Inprise Corporation:249.95");
			bw.newLine();
			bw.flush();
		    } catch (IOException ioe) {
			 ioe.printStackTrace();
			 } finally {                       // always close the file
						 if (bw != null) try {
						    bw.close();
			 } catch (IOException ioe2) {
			    // just ignore it
			 }
		} // end try/catch/finally
			
	} // end test()

} // end class