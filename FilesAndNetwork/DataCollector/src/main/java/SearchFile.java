import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SearchFile {

    StringBuilder builder = new StringBuilder();

    try {
        List<String> lines = Files.readAllLines(Paths.get("data/info.txt"));
        lines.forEach(line -> builder.append(line + "\n"));
    }
    catch (Exception ex) {
        ex.printStackTrace();
    }
    
}
