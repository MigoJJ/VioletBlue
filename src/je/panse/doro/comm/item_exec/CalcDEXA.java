package je.panse.doro.comm.item_exec;

import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.StartForm;

public class CalcDEXA {

	public static void main(String[] args) {
		int realage; 
		String gender; 
		String SaintPan;
		
		try (Scanner rasc = new Scanner(System.in)) {
			System.out.println("당신의 나이는 ?");
			realage = rasc.nextInt();
		
		Scanner gesc = new Scanner(System.in); 
			System.out.println("당신의 성별은 ?");
			gender = gesc.nextLine();
		
		Scanner ossc = new Scanner(System.in); 	
			System.out.println("당신은 골절 병력이 있습니까?   yes / no  ( y/n )   ");
			ossc = nextLine();
			
			if  (gender.equals("m")) {
			    System.out.println("gender   : m ");
			}
			else{
			    System.out.println("gender   : f ");
			} 
		}
	}

	private static Scanner nextLine() {
		// TODO Auto-generated method stub
		return null;
	}
	
		
// ---------
}
//		System.out.println("당신은 골절 병력이 있습니까?   yes / no  ( y/n )   ");
//    fracture = input("당신은 골절 병력이 있습니까?   yes / no  ( y/n )   ")
//
//    if premeno =="y" :
//        # z_score = float(input("Z-score  :  "))
//        # print('_' * 60)
//        if z_score <= -2.0:  # "연령기대치이하"
//           print("\n골밀도 검사 결과 Z-score = {0} 입니다.".format(z_score))
//           file_save('\n------------------------------------------------------DEXA\n\n')
//           file_save("\n골밀도 검사 결과 Z-score = {0} 입니다.".format(z_score))  #--save result
//           z_judge = open('C:/GDSRC/Ref_Text/gdsdexJL.txt', 'r', encoding='utf-8')
//           for z_judgeC in z_judge:
//                        z_judgeCr = z_judgeC.rstrip()
//                        if z_judgeCr.startswith('dexaC01'):
//                           print("{0} ".format(z_judgeCr[8:]))
//                           Z_Score = ("\n{0} ".format(z_judgeCr[9:]))
//                           file_save(Z_Score)     #----------------save result
//                        else:
//                           break
//        else:
//            print("골밀도 검사 결과 Z-score = {0} 입니다.".format(z_score))
//            z_judge = "    정상 입니다."
//            print(z_judge)
//            break
//    else:
//        # t_score = float(input("T-score  :  "))
//        print("골밀도 검사 결과 T-score = {0} 입니다.".format(t_score))
//        file_save('\n------------------------------------------------------DEXA\n')
//        file_save("\n골밀도 검사 결과 T-score = {0} 입니다.".format(t_score))
//        if fracture == "y" and t_score <= -2.5:
//            dexa_JL = 'dexaC03'
//        if fracture == "n" and t_score <= -2.5:
//            dexa_JL = 'dexaC04'
//        if fracture == "n" and -2.5 < t_score < -1.0:
//            dexa_JL = 'dexaC05'
//        if fracture == "n" and -1.0 <= t_score:
//            dexa_JL = 'dexaC06'
//
//        t_judge = open('C:/GDSRC/Ref_Text/gdsdexJL.txt', 'r', encoding='utf-8')
//        line = t_judge.readlines()
//        for t_judgeC in line:
//            t_judgeCr = t_judgeC.rstrip()
//            if t_judgeCr.startswith(dexa_JL):
//                print("{0}".format(t_judgeCr[8:]))
//                T_Score = (" {0}\n".format(t_judgeCr[9:]))
//                file_save(T_Score)  # ----------------save result
//                break