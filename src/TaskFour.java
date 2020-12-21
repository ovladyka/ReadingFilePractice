import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TaskFour {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile(new File(args[0]), "r");
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

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
