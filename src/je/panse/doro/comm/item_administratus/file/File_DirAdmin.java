package je.panse.doro.comm.item_administratus.file;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import je.panse.doro.main.Enter;
import je.panse.doro.main.SingleBeam;

public class File_DirAdmin {

    public void copy_Directory(String sourceDir, String targetDir) throws IOException {
        File_cdrw_proc fileProcessor = new File_cdrw_proc();
        List<String> directories = new ArrayList<>();
        directories.add("/3CC");  
        directories.add("/4PMH");  
        directories.add("/5SUJ");  
        directories.add("/6OBJ");  
        directories.add("/7LAB");  
        directories.add("/8ASS");  
        directories.add("/9PLAN");

        for (String directory : directories) {
            fileProcessor.copyfiler(sourceDir + directory, targetDir + directory);
        }
    }

    public void clear_Directory(String dir) throws Exception {
        File directory = new File(dir);
        File[] files = directory.listFiles();       
        for (File file : files) {
            if (file.isFile()) {
                System.gc();
                Thread.sleep(10);
                file.delete();
                SingleBeam singleBeam = new SingleBeam();
                singleBeam.main(null);
            }
        }
    }

    public void prepare_ChartPlate() throws IOException {
        File_cdrw_proc fileProcessor = new File_cdrw_proc();
        fileProcessor.deletefiler(Enter.wts + "/ChartPlate");
        fileProcessor.checkfiler(Enter.wts + "/ChartPlate");
        fileProcessor.deletefiler(Enter.wts + "/Comment");
        fileProcessor.checkfiler(Enter.wts + "/Comment");
    }
}
