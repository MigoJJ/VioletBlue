package je.panse.doro.comm.item_manage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.main.Enter;

public class dirCopy {
	public static void main(String[] args) {
		try {
			bu_chart(Enter.wt + "/tripikata", Enter.wt + "/tripikata/bu");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void bu_chart(String laname, String nunmae) throws IOException {
	   List<String> list=new ArrayList<String>();  
		  list.add("/3CC");  
		  list.add("/4PMH");  
		  list.add("/5SUJ");  
		  list.add("/6OBJ");  
		  list.add("/7LAB");  
		  list.add("/8ACC");  
		  list.add("/9PLAN");

		  for(String fruit:list)  
		  File_cdrw_proc.copyfiler(laname +fruit, nunmae+ fruit );
	}
}