package je.panse.doro.comm.item_administratus;

public class ClearConsole {
    public static void main(String[] args) throws Exception{
       System.out.println("Code was erased!!");
       Runtime.getRuntime().exec("clear");
    	System.out.println(System.lineSeparator().repeat(10));
       System.out.println("Code was erased!!");
    }
}