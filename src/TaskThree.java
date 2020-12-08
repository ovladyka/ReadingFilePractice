
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TaskThree {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader(args[0]);
        FileWriter writer = new FileWriter(args[1]);
        StringBuilder toRead = new StringBuilder();
        char symbol;

        while (reader.ready()) {

            symbol = (char) reader.read();

            if (Character.isDigit(symbol)) {
                toRead.append(symbol);
            }

            if (!Character.isDigit(symbol) && toRead.length() != 0) {
                writer.write(toRead + " ");
                toRead = new StringBuilder();
            }
        }
        reader.close();
        writer.close();
    }
}
