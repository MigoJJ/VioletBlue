package je.panse.doro.comm;

import java.io.IOException;			
import java.nio.file.Files;
import java.nio.file.Path;
import je.panse.doro.main.Enter;

public class ReadWriteToFile
{
	public static void readWTF(String rwtf) throws IOException
	{
		Path fileName = Path.of(rwtf);
	    String actual  = Files.readString(fileName);

	    System.out.println(actual);
	    ManageFileAppend.main(actual);
	}
	
	public static void readWTF_DMM(String rwtf_dmm) throws IOException
	{
		Path fileName = Path.of(rwtf_dmm);
	    String actual  = Files.readString(fileName);

	    System.out.println(actual);
	    ManageFileAppend.main(actual);
	}

// ------------------------------------------
}