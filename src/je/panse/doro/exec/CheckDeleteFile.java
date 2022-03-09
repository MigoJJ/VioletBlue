package je.panse.doro.exec;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CheckDeleteFile {
	  public static void main(String wtf) throws IOException {
		  List<String> list=new ArrayList<String>();  
			  list.add("/3CC");  
			  list.add("/4PMH");  
			  list.add("/5SUJ");  
			  list.add("/6OBJ");  
			  list.add("/7LAB");  
			  list.add("/8ACC");  
			  list.add("/9PLAN");  
			  for(String fruit:list)  
				   cff(wtf + fruit);
//		      System.out.println(fruit);
	  }

	  static void cff(String file1) {	
			File file = new File(file1); 
			if( file.exists() ){ 
			    if(file.delete()){ System.out.println("파일삭제 성공"); 
			    }else{ System.out.println("파일삭제 실패"); 
				} 
			    }else{ System.out.println("파일이 존재하지 않습니다."); 
		    } 
	    } 
		
// ------------------------------------------
}