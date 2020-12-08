import java.io.FileReader;
import java.io.IOException;

public class TaskTwo {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(args[0]);

            int count = 0;
            String check = "world";
            StringBuilder word = new StringBuilder();

            while (reader.ready()) {
                word.append((char)reader.read());
            }

            String[] words = word.toString().split("[,.!?;:]");
            for (String str: words) {
                if (str.equals(check)){
                    count++;
                }
            }
            System.out.println("the number of World words : " + count);
            reader.close();
        } catch (IOException e) {

        }
    }
}
