package je.panse.doro.fourgate.thyroid.prescription;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;
	 
public class ThyroidJTableInput extends JPanel{
    private boolean DEBUG = false;
 
    public ThyroidJTableInput()  throws IOException {
        super(new GridLayout(1,0));
	 
	        String[] columnNames = {"Name",
	                                "Last Name",
	                                "Sport",
//	                                "# of Years",
	                                "Vegetarian"};
	 
	        Object[][] data = {
	        {"Observation", "and","F/U", "without meds"},
	        {".", ".",".", "."},
	        {"Synthroid", "25 ug","0.5 tab p.o.", "q.d."},
	        {"Synthroid", "25 ug","1 tab p.o.", "q.d."},
	        {"Synthroid", "50 ug","1 tab p.o.", "q.d."},
	        {"Synthroid", "75 ug","1 tab p.o.", "q.d."},
	        {"Synthroid", "100 ug","1 tab p.o.", "q.d."},
	        {".", ".",".", "."},
	        {"Synthroxine", "25 ug","0.5 tab p.o.", "q.d."},
	        {"Synthroxine", "25 ug","1 tab p.o.", "q.d."},
	        {"Synthroxine", "50 ug","1 tab p.o.", "q.d."},
	        {"Synthroxine", "75 ug","1 tab p.o.", "q.d."},
	        {"Synthroxine", "100 ug","1 tab p.o.", "q.d."},
	        {".", ".",".", "."},
	        {"Methimazole", "2.5 mg","1 tab p.o.", "q.d."},
	        {"Methimazole", "5 mg","1 tab p.o.", "q.d."},
	        {"Methimazole", "5 mg","2 tab p.o.", "b.i.d."},
	        {"Methimazole", "5 mg","2 tab p.o.", "t.i.d."},
	        {".", ".",".", "."},
	        {"Antiroid", "50 mg","1 tab p.o.", "q.d."},
	        {"Antiroid", "50 mg","2 tab p.o.", "q.d."},
	        {"Antiroid", "50 mg","2 tab p.o.", "b.i.d."},
	        {"Antiroid", "50 mg","2 tab p.o.", "t.i.d."},
	        {".", ".",".", "."},
	        {"Camen", "5 mg","1 tab p.o.", "q.d."},
	        {"Camen", "10 mg","1 tab p.o.", "q.d."},
	        {".", ".",".", "."},
	        {"Indenol", "10 mg","1 tab p.o.", "q.d."},
	        {"Indenol", "10 mg","1 tab p.o.", "b.i.d."},
	        {"Indenol", "10 mg","1 tab p.o.", "t.i.d."},
	        };

	        
	        
	        final JTable table = new JTable(data, columnNames);
	        table.setPreferredScrollableViewportSize(new Dimension(500, 600));
	        table.setFillsViewportHeight(true);

	        //-----------------------------------
	 table.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 1) {     // to detect doble/single click events
                JTable target = (JTable)e.getSource();
                int row = target.getSelectedRow(); // select a row
                int column = target.getSelectedColumn(); // select a column
                Object tgvarow = table.getValueAt(row, column);
                Object[] rowData = new Object[table.getColumnCount()];
                String sumrowsData ="  ";

                for (int i = 0; i < table.getColumnCount(); i++) {
                   rowData[i] = table.getValueAt(row, i);
//                 System.out.print(" " + rowData[i]);
                   sumrowsData = (sumrowsData + rowData[i] +" ");
                }
//                System.out.println(sumrowsData);
                try {
					ThyroidPxEnter.main(sumrowsData);
					} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                }

          	}
 	       //-----------------------------------
	 		});
	        if (DEBUG) {
	            table.addMouseListener(new MouseAdapter() {
	                public void mouseClicked(MouseEvent e) {
	                	printDebugData(table);
	                }
	            });
	        }
	        //Create the scroll pane and add the table to it.
	        JScrollPane scrollPane = new JScrollPane(table);
	        //Add the scroll pane to this panel.
	        add(scrollPane);
	    }
	        
	    private void printDebugData(JTable table) {
	        int numRows = table.getRowCount();
	        int numCols = table.getColumnCount();
	        javax.swing.table.TableModel model = table.getModel();
	 
	        System.out.println("Value of data: ");
	        for (int i=0; i < numRows; i++) {
	            System.out.print("    row " + i + ":");
	            for (int j=0; j < numCols; j++) {
	                System.out.print("  " + model.getValueAt(i, j));
	            }
	            System.out.println();
	        }
	        System.out.println("--------------------------");
	    }
	    private static void createAndShowGUI() throws IOException {
	        //Create and set up the window.
	        JFrame frame = new JFrame("ThyroidJTableInput");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        //Create and set up the content pane.
	        ThyroidJTableInput newContentPane = new ThyroidJTableInput();
	        newContentPane.setOpaque(true); //content panes must be opaque
	        frame.setContentPane(newContentPane);
	 
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }
	 
	    public static void main(String[] args) throws IOException {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                try {
						createAndShowGUI();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        });
	    }
   
	    
	}
