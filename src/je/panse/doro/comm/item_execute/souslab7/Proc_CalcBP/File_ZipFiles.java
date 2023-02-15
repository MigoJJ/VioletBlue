package je.panse.doro.comm.item_execute.souslab7.Proc_CalcBP;

import java.io.*;
import java.util.zip.*;

public class File_ZipFiles {
   static public void main(String[] args) throws Exception {
      // Input directory to be zipped
      String sourceDir = "/home/migowj/ittia1_chart";

      // Output ZIP file location
      String targetZipFile = "/home/migowj/Documents/ittia1_chart_zipfile.zip";
            // Create a buffer for reading the files
            byte[] buf = new byte[1024];

            try {
               // Create the ZIP file
               ZipOutputStream out = new ZipOutputStream(new FileOutputStream(targetZipFile));

               // Compress the files
               File[] files = new File(sourceDir).listFiles();
               for (int i=0; i<files.length; i++) {
                  if (files[i].isDirectory()) {
                     addDir(out, files[i], files[i].getPath().substring(sourceDir.length()+1));
                  } else {
                     FileInputStream in = new FileInputStream(files[i].getPath());

                     // Add ZIP entry to output stream.
                     out.putNextEntry(new ZipEntry(files[i].getPath().substring(sourceDir.length()+1)));

                     // Transfer bytes from the file to the ZIP file
                     int len;
                     while ((len = in.read(buf)) > 0) {
                        out.write(buf, 0, len);
                     }

                     // Complete the entry
                     out.closeEntry();
                     in.close();
                  }
               }

               // Complete the ZIP file
               out.close();
               System.out.println("Zipping completed");
            } catch (IOException e) {
               e.printStackTrace();
            }
         }

         static public void addDir(ZipOutputStream out, File dir, String base) throws IOException {
            // Compress the files in the directory
            File[] files = dir.listFiles();
            for (int i=0; i<files.length; i++) {
               if (files[i].isDirectory()) {
                  addDir(out, files[i], base + "/" + files[i].getName());
               } else {
                  FileInputStream in = new FileInputStream(files[i].getPath());

                  // Add ZIP entry to output stream.
                  out.putNextEntry(new ZipEntry(base + "/" + files[i].getName()));

                  // Transfer bytes from the file to the ZIP file
                  byte[] buf = new byte[1024];
                  int len;
                  while ((len = in.read(buf)) > 0) {
                     out.write(buf, 0, len);
                  }

                  // Complete the entry
                  out.closeEntry();
                  in.close();
               }
            }
         }
      }

