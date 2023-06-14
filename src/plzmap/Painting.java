package plzmap;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.List;

public class Painting extends JPanel{

    private HashMap<String, List<Double>> plzRecords;
    private int w;
    private int h;

    private double bufferX = 60;
    private double bufferY = 40;

    private HashMap<String, Color> highlightPlzs;


    public Painting(Frame f, HashMap<String, List<Double>> plzRecords, int w, int h, HashMap<String, Color> highlightPlzs){
        this.plzRecords = plzRecords;
        this.w = w;
        this.h = h;
        this.highlightPlzs = highlightPlzs;
        f.setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics g) {
        //super.paintComponent(g);

//        try {
//            URL path = Main.class.getResource("map_outline.jpg");
//            final BufferedImage image = ImageIO.read(new File(path.getFile()));
//            g.drawImage(image,470-612,0,null);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        for(String plz : this.plzRecords.keySet())
            paintPlz(plz, Color.DARK_GRAY,2, true, g);


        for(Map.Entry<String, Color> entry : this.highlightPlzs.entrySet())
            paintPlz(entry.getKey(), entry.getValue(), 8, false, g);


    }

    private double map(double val, double s1, double e1, double s2, double e2) {
        return s2 + ((e2 - s2) / (e1 - s1)) * (val - s1);
    }


    private void paintPlz(String plz, Color color, int size, boolean dot, Graphics g) {

        List<Double> p = plzRecords.get(plz);

        int x = (int) map(p.get(0), -0.056436524, 0.044636916, bufferX, w-bufferX);
        int y = (int) map(p.get(1), 0.7982389, 0.9287888, h-bufferY, bufferY);
        g.setColor(color);
        g.fillOval(x-size/2,y-size/2,size,size);
        if(dot) {
            g.setColor(Color.WHITE);
            g.drawLine(x,y,x,y);
        }

    }


}