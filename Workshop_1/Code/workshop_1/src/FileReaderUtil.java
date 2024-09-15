import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtil {
    public static String[] readDatabase(String filename) throws IOException {
        List<String> sequences = new ArrayList<>();
        FileReader reader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            sequences.add(line);
        }
        bufferedReader.close();
        return sequences.toArray(new String[0]);
    }
}