import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class ParserWeb {




    static ArrayList<Line> allLines = new ArrayList<>();
    static ArrayList<Station> allStations = new ArrayList<>();

    public static ArrayList<Station> getAllStations() {
        return allStations;
    }
    public static ArrayList<Line> getAllLines() {
        return allLines;
    }



    public static void parsingSite(String siteName) throws IOException {

        Document doc = Jsoup.connect(siteName).get();

        Elements line = doc.select(".js-metro-line");
         //line.forEach(System.out::println);
        Elements station = doc.select("div.js-metro-stations");
        //station.forEach(System.out::println);

        for (Element e : line) {
            allLines.add(parserLine(e));
        }
        for (Element e : station) {
            Elements spb = e.select("p.single-station");
            for (Element a : spb) {
                allStations.add(parserStation(a, e.attr("data-line")));

            }
        }
        allStations.forEach(System.out::println);
    }
        public static Line parserLine (Element e){
            return new Line(e.text(), e.attr("data-line"));

        }
        public static Station parserStation (Element e, String number){

        return new Station(e.text(), number);
        }

    }

