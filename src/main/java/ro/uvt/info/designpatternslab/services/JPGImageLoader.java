package ro.uvt.info.designpatternslab.services;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JPGImageLoader implements ImageLoader{
    @Override
    public String loadImage(String url) throws IOException{
        try {
            File imageFile = new File(url);

            BufferedImage image = ImageIO.read(imageFile);

            ImageIcon icon = new ImageIcon(image);
            JFrame frame = new JFrame();

            frame.setLayout(new FlowLayout());

            frame.setSize(200, 300);
            JLabel lbl=new JLabel();
            lbl.setIcon(icon);
            frame.add(lbl);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Image " + url + " is not JPG type!";
    }
}