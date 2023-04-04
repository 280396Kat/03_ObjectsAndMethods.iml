package core;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataMemoryCollector {

    private Map<String, Station> mapStations = new HashMap<>(); // полиморфизм типов

    private String dataFile = "";

    public Map<String, Station> getMapStations() {
        return mapStations;
    }

    public String getDataFile() {
        return dataFile;
    }

    @Override
    public String toString() {
        return "DataMemoryCollector{" +
                "mapStations=" + mapStations +
                ", dataFile='" + dataFile + '\'' +
                '}';
    }

    public Map<String, Station> fileReader(String filePath) throws ParseException {
        File fileDoc = new File(filePath);
        if (fileDoc.isFile()) {
            dataFile = fileDoc.getAbsolutePath();
            if (fileDoc.getName().endsWith(".json")) {
                getDataFromJson(fileDoc);
            }
            if (fileDoc.getName().endsWith(".csv")) {
                getDataFromJson(fileDoc);
            }
        }else {
            File[] files = fileDoc.listFiles();
            for (File tmp : files) {
                fileReader(tmp.getAbsolutePath());
            }
        }
      return mapStations;
    }

    private void getDataFromJson(File fileDoc) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(getJsonFile());
        for(Object tmp : jsonArray) {
            JSONObject stationJson = (JSONObject) tmp;
            String stationName = (String) stationJson.get("тут будет название станции");
            if (!mapStations.containsKey(stationName)) {
                mapStations.put(stationName, new Station(stationName));
            }
        }
    }

    private void getDataFromCsv(File fileDoc) throws FileNotFoundException {
        String filePath = fileDoc.getAbsolutePath();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        try {
            String splitBy = ",";
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] lines = line.split(splitBy, 2);
                for (int i = 0; i < lines.length; i++) {
                    if(i % 2 == 0) {
                        String stationName = lines[i];
                        if (!mapStations.containsKey(stationName)) {
                            mapStations.put(stationName, new Station(stationName));
                        }
                        if (fileDoc.getName().startsWith("тут что-то будет")) {
                            mapStations.get(stationName); // сюда нужно вернуться
                        } else if (fileDoc.getName().startsWith("тут что-то будет")) {
                            mapStations.get(stationName); // сюда нужно вернуться
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getJsonFile() {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(Paths.get(dataFile));
            lines.forEach(line -> stringBuilder.append(line));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
