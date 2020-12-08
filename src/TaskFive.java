import java.io.FileReader;
import java.io.IOException;

public class TaskFive {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(args[0]);
        StringBuilder sb = new StringBuilder();
        String[] arr;

        while (reader.ready()) {
            char symbol = (char) reader.read();

            if (!String.valueOf(symbol).matches(".") || !reader.ready()) {
                arr = sb.toString().split(" ");
                System.out.println(arr[0]);
                sb.delete(0, sb.length());
                arr = null;
                symbol = 0;
            }
            sb.append(symbol);

        }
    }
}
