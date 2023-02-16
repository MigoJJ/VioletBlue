package je.panse.doro.hito.newsub;

import java.util.Scanner;	

import je.panse.doro.comm.item_administratus.key.Key_shortcut;
import je.panse.doro.comm.item_execute.souslab7.CalcCBC;
import je.panse.doro.comm.item_execute.souslab7.CalcChol;
import je.panse.doro.comm.item_execute.souslab7.CalcCr;
import je.panse.doro.comm.item_execute.souslab7.CalcGOT;
import je.panse.doro.comm.item_execute.souslab7.CalcHbA1c;
import je.panse.doro.comm.item_execute.souslab7.CalcLpa;
import je.panse.doro.comm.item_execute.souslab7.CalcTFT;
import je.panse.doro.comm.item_execute.souslab7.CalcTFT2;
import je.panse.doro.comm.item_execute.souslab7.CalcVitD;

import java.util.Scanner;

public class New7LAB {
    public static void main(String[] args) throws Exception { 
        try (Scanner scanner = new Scanner(System.in)) {
            int selectCode = 0;
            while (true) {
                System.out.println("Enter selected code number...: ");
                selectCode = scanner.nextInt();
                switch (selectCode) {
                    case 1:
                        CalcHbA1c calcHbA1c = new CalcHbA1c();
                        calcHbA1c.main(null);
                        break;
                    case 2:
                        CalcTFT calcTFT = new CalcTFT();
                        calcTFT.main(null);
                        break;
                    case 22:
                        CalcTFT2 calcTFT2 = new CalcTFT2();
                        calcTFT2.main(null);
                        break;
                    case 3:
                        CalcChol calcChol = new CalcChol();
                        calcChol.main(null);
                        break;
                    case 4:
                        CalcCr calcCr = new CalcCr();
                        calcCr.main(null);
                        break;
                    case 5:
                        CalcVitD calcVitD = new CalcVitD();
                        calcVitD.main(null);
                        break;
                    case 6:
                        CalcCBC calcCBC = new CalcCBC();
                        calcCBC.main(null);
                        break;
                    case 7:
                        CalcLpa calcLpa = new CalcLpa();
                        calcLpa.main(null);
                        break;
                    case 8:
                        CalcGOT calcGOT = new CalcGOT();
                        calcGOT.main(null);
                        break;
                    default:
                        System.out.println("Uncertain... Please check!");
                        Key_shortcut.main(selectCode);
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }	
}
