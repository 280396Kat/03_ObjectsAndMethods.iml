import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class ParserWeb {

    static ArrayList<Line> ollLines = new ArrayList<>();
    static ArrayList<Station> ollStations = new ArrayList<>();

    public static void parsingSite(String siteName) throws IOException {

        Document doc = Jsoup.connect(siteName).get();

        Elements line = doc.select(".js-metro-line");
        // line.forEach(System.out::println);
        Elements station = doc.select(".js-depend");
        //station.forEach(System.out::println);


        for (Element e : line) {
            ollLines.add(parserLine(e));
        }

        for (Element e : station) {
            Elements spb = e.select("p.single-station");
            System.out.println(e.attr("data-line"));
            for (Element a : spb) {
                ollStations.add(parserStation(a, e.attr("data-line")));


            }

        }
        ollStations.forEach(System.out::println);
    }


        public static Line parserLine (Element e){
            return new Line(e.text(), e.attr("data-line"));

        }

        public static Station parserStation (Element e, String number){
            return new Station(e.text(), number);
        }


    }

