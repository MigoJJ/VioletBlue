package je.panse.doro.comm;

import javax.imageio.ImageIO;	
import javax.swing.*;
import je.panse.doro.main.Enter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageCall {
	public void main(String[] args) throws IOException {

        File file = new File(Enter.wd + "/aeternum/herpeszoster/bring/herpesZoster.jpg");
//        File file = new File(Enter.wd + "/aeternum/supportdiagnosis/Dis_code.png");

        BufferedImage bufferedImage = ImageIO.read(file);

        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout());
        
        jFrame.setSize(1200, 900);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}