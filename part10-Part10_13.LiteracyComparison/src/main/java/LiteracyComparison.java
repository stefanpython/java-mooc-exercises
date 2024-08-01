
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {
        List<LiteracyRecord> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(s -> s.split(","))
                    .sorted((x, y) -> x[5].compareTo(y[5]))
                    .forEach(v -> System.out.println(v[3] + " (" + Integer.parseInt(v[4]) + "), " + v[2].split(" ")[1].trim() + ", " + Double.parseDouble(v[5])));

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }

}
