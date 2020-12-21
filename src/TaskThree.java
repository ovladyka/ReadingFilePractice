
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TaskThree {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            FileWriter writer = new FileWriter(args[1]);
            String line, lastLine = null;

            while ((line = br.readLine()) != null) {

                lastLine = line;
                for (String s : lastLine.split(" ")) {
                    if (s.matches("\\d+")) {
                        writer.write(s + " ");
                    }
                }
            }
            br.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
