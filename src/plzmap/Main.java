package plzmap;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        HashMap<String, List<Double>> plzRecords;
        try {
             plzRecords = getPlzLocationMap();
        } catch (Exception e) {
            System.out.println("Error reading csv:");
            e.printStackTrace();
            return;
        }

        HashMap<String, Color> highlightedPlzs = new HashMap<>();
        highlightedPlzs.put("69254", new Color(33, 227, 237));
        highlightedPlzs.put("68167", new Color(255, 102, 255));
        highlightedPlzs.put("76698", new Color(255, 0, 0));

        new GUI(plzRecords, 380*5/3, 450*5/3, highlightedPlzs);



    }

    private static HashMap<String, List<Double>> getPlzLocationMap() throws FileNotFoundException {
        List<List<String>> records = new ArrayList<>();
        URL path = Main.class.getResource("plz.csv");
        try (Scanner scanner = new Scanner(new File(path.getFile()));) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        }

        HashMap<String, List<Double>> plzRecords = new HashMap<>();

        for(List<String> list : records) {
            for(String r : list) {
                String[] record = r.split(",");
                ArrayList<Double> location = new ArrayList<>();
                location.add(Double.parseDouble(record[1]));
                location.add(Double.parseDouble(record[2]));
                plzRecords.put(record[0], location);
            }
        }

        return plzRecords;
    }

    private static List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter("\t");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }



}
