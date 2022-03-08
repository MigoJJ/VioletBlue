package je.panse.doro.main;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CheckDeleteFile {
	  public static void main(String wtf) throws IOException {
//		  wtf = (wtf + "/htn");
		  List<String> list=new ArrayList<String>();  
//		  list.add("/lanu/11ChartPlat");  
//		  list.add("/lanu/12Comment");  
		  list.add("/51CC");  
		  list.add("/52PMH");  
		  list.add("/53SUJ");  
		  list.add("/54OBJ");  
		  list.add("/55LAB");  
		  list.add("/56ACC");  
		  list.add("/57PLAN");  
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