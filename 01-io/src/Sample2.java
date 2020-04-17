import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by asus on 2019/09/28.
 */
public class Sample2 {
    public static void main(String[] args) {
        try (FileWriter writer=new FileWriter("test2.txt",true)){
        }
        catch (Exception e)
        {
        }
        try {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer=new FileWriter("test2.txt",true);
            writer.write(" n  hello2");
//            writer.write("salam java \n");
//            writer.write("khoobi shayan.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
