package je.panse.doro.fourgate.ros;

import java.io.*;			
import java.util.*;
import javax.swing.*;

import java.awt.Component;
import java.awt.event.*;
import javax.swing.table.*;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.Librexls_JtableCall;
import je.panse.doro.main.Enter;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Rosproc {
	 public static void main(String[] args) {
		 Librexls_JtableCall.main("/fourgate/ros/ROSlist.xls","> ", "/6OBJ");
	 }
}