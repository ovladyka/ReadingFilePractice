import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TaskOne {
    public static void main(String[] args) {
        try {

            FileReader fileReader = new FileReader(args[0]);
            FileWriter fileWriter = new FileWriter(args[1]);

            int count = 0;
            while (fileReader.ready()) {
                int symbol = fileReader.read();
                count++;
                if (count % 2 == 0) {
                    fileWriter.write(symbol);
                }
            }

            fileReader.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
