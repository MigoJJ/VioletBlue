package je.panse.doro.comm;

import java.awt.*;
import java.io.File;

import je.panse.doro.main.Enter;

public class File_editor_proc {
    public static void main(String string){
        try
        {
            File file = new File(Enter.wts + "/ChartPlateNote");
            if(!Desktop.isDesktopSupported())
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
                desktop.open(file);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
// ----------	
}