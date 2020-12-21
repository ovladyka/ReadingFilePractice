import java.io.FileReader;
import java.io.IOException;

public class TaskTwo {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(args[0]);

            int count = 0;
            String check = "world";
            StringBuilder word = new StringBuilder();
            char[] arr = {',', '.', '!', '?', ';', ':'};

            while (reader.ready()) {
                char symbol = (char) reader.read();
                for (char cr : arr) {
                    if (symbol == cr) {
                        if (word.toString().trim().toLowerCase().equals(check)) {
                            count++;
                        }
                        word.delete(0, word.length());
                        symbol = 0;
                        break;
                    }
                }
                word.append(symbol);
            }

            System.out.println("the number of World words : " + count);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
