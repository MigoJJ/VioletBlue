package je.panse.doro.comm.prepare;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
      System.out.print("Enter  >>   Age...Gender...Fracture(y/n)...Menopause(y/n) : ");
    
      Scanner dexa_scan = new Scanner(System.in);
      
      int realage = dexa_scan.nextInt();
      String gender_val = dexa_scan.next();
      String fracture_val = dexa_scan.next();
      String menopause_val = dexa_scan.next();
      
      System.out.println("Age value is : " + realage 
    		  + "\nand the gender value is : " + gender_val 
    		  + "\nand the fracture_val value is : " + fracture_val 
    		  + "\nand the menopause_val value is : " + menopause_val);

   }
}