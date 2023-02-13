package je.panse.doro.main;

import je.panse.doro.comm.item_administratus.Menu_list;
import je.panse.doro.comm.item_administratus.loop.CurrentDate;
import je.panse.doro.hito.StartForm;

public class Enter {
		public static final String currentUsersHomeDir = System.getProperty("user.dir");
		public static final String wd = currentUsersHomeDir + "/src/je/panse/doro";
//		public static final String wd = currentUsersHomeDir + "/je/panse/doro";
		public static final String wt = wd + "/text";
		public static final String wtk = wd + "/text/knots";
		public static final String wts = wd + "/text/samsara";
		public static final String wtt = wd + "/text/tripikata";
		public static final String wds = wd + "/aeternum/supportdiagnosis";
		public static final String wtsi = wt + "/singlebeam";
		public static final String wtss = wt + "/singlebeam/subnewmenu";
		public static final String udbu = "/home/migowj/ittia1_chart/addjar_ittia1";
		public static final String udbu2 = "/home/migowj/ittia1_chart/addjar_ittia2";
		public static final String udbu5 = "/home/migowj/ittia1_chart/addjar_ittia5";

    public static void main(String[] args) throws Exception {
        CurrentDate.defineTime();
        System.out.println("currentUsersHomeDir: " + currentUsersHomeDir);
        Menu_list.main(wt + "/singlebeam/StartMenuList");
        StartForm.main(args);
    }
}
