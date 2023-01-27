import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class Metro {

    private static final HashMap<Line, ArrayList<Station>> metro = new HashMap<>();

    public Metro(String pathToHtml) throws IOException {
        ParserWeb.parsingSite(pathToHtml);
        createMetro();
    }

    private void createMetro() {
        ParserWeb.getAllLines().forEach(e -> {
            ArrayList<Station> st = new ArrayList<>();
            ParserWeb.getAllStations().forEach(a -> {
                if (e.getLineNumber().equals(a.getLineNumber())) st.add(a);
            });

        metro.put(e, st);});
    }






}