package ReadingStrings04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by asus on 2019/09/28.
 */
class BRReadLines {
    public static void main(String args[]) throws IOException {
        // create a BufferedReader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        PrintWriter printWriter=new PrintWriter(System.out);
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        do {
            str = br.readLine();
//            System.out.println(str);
            printWriter.println(str);
            printWriter.flush();
        } while (!str.equals("stop"));
    }
}
