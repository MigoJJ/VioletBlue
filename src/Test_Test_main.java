import je.panse.doro.comm.item_administratus.loop.Loop_strintCheck;

public class Test_Test_main {
	public static void main(String[] args) {
		boolean strint =Loop_strintCheck.main("1234");
		boolean strint1 =Loop_strintCheck.main("abcd");
	System.out.println( "boolean 1234  " + strint);
	System.out.println( "boolean  abcd  " + strint1);
	}
}
