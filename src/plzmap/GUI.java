package plzmap;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GUI {

    private Frame f;
    private Painting painting;

    public GUI(HashMap<String, List<Double>> plzRecords, int w, int h, HashMap<String, Color> highlightPlzs) {
        this.f = new Frame("PLZ", -1, -1, w, h);
        this.painting = new Painting(this.f, plzRecords, w, h, highlightPlzs);
        this.f.getContentPane().add(this.painting);
        this.f.setupFrame();
    }



}
