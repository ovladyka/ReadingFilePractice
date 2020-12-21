import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TaskFive {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String line;
        String[] arr;

        try {
            while ((line=br.readLine()) != null) {
                arr = line.split(" ");
                System.out.println(arr[0]);
            }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
