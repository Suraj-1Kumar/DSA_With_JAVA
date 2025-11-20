import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class UserInput {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter a number");
        /*InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num); 

        bf.close(); */

        int n = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){   // BR -> Reader -> Readable, Closeable -> Autocloseable
            n = Integer.parseInt(br.readLine());
            System.out.println(n);
        }
    }
}
