import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TaskFour {
    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        RandomAccessFile raf = new RandomAccessFile(file, "r");
        StringBuilder sb = new StringBuilder();

        for (long i = raf.length() - 1; i >= 0; i--) {
            raf.seek(i);
            char cr = (char) raf.read();

            if (cr == '\n' || i == 0) {
                if (cr != '\n') {
                    sb.append(cr);
                }
                sb.reverse();
                System.out.println(sb.toString());
                sb.delete(0, sb.length());
                continue;
            }
            sb.append(cr);
        }
		raf.close();
    }
}
