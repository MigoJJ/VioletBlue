package je.panse.doro.hito;

import java.util.Scanner;	
import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.key.Key_returnquit;
import je.panse.doro.comm.item_administratus.key.Key_shortcut;
import je.panse.doro.fourgate.symptom.subjective_read_data.Symptom12Enter;
import je.panse.doro.hito.newsub.New3CC;
import je.panse.doro.hito.newsub.New3PI;
import je.panse.doro.hito.newsub.New4PMH;
import je.panse.doro.hito.newsub.New5SUJ;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.hito.newsub.New8ASS;
import je.panse.doro.hito.newsub.New9PLAN;
import je.panse.doro.main.Enter;

public class Newcategory {

    public static void switching() throws Exception {
        File_cdrw_proc fcp = new File_cdrw_proc();
        String a = "JJ";

        while (true) {
            try (Scanner new_code = new Scanner(System.in)) {
                System.out.println("Enter selected code number ...   : ");
                a = new_code.nextLine().trim();
                if (a.equals("")) {
                    Key_returnquit krq = new Key_returnquit();
                    krq.mainquit(a);
                }
                int select_code = Integer.parseInt(a);
                switch (select_code) {
                    case 1:
                        New3CC n31 = new New3CC();
                        n31.main(null);
                        break;
                    case 11:
                        New3PI n32 = new New3PI();
                        n32.main(null);
                        break;
                    case 12:
                        Symptom12Enter n33 = new Symptom12Enter();
                        n33.main(null);
                        break;
                    case 13:
                        String udbu2 = Enter.currentUsersHomeDir + "/addjar_ittia2";
                        String jarName = "java -jar " + udbu2 + "/ittia1jros.jar";
                        Runtime runtime = Runtime.getRuntime();
                        Process process = runtime.exec(jarName);
                        break;
                    case 2:
                        New4PMH.main(null);
                        break;
                    case 3:
                        New5SUJ.main(null);
                        break;
                    case 4:
                        fcp.readfiler(Enter.wtss + "/6OBJ_List");
                        New6OBJ.main(null);
                        break;
                    case 5:
                        fcp.readfiler(Enter.wtss + "/7LAB_List");
                        New7LAB.main(null);
                        break;
                    case 6:
                        fcp.readfiler(Enter.wtss + "/8ASS_List");
                        New8ASS.main(null);
                        break;
                    case 7:
                        fcp.readfiler(Enter.wtss + "/9PLAN_List");
                        New9PLAN.main(null);
                        break;
                    default:
                        Key_shortcut.main(select_code);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args) throws Exception {
        switching();
    }
}
