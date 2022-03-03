package je.panse.doro.exec.input.la;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import je.panse.doro.comm.ManageFileAppend;

public class WriteToFile
{
	public static void main(String[] args) throws IOException
	{
		Path fileName = Path.of("demo.txt");
	    String content  = "hello world !!";
	    Files.writeString(fileName, content);

	    String actual = Files.readString(fileName);
	    System.out.println(actual);
	    ManageFileAppend.main(actual);
	}
}