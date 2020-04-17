package main.java.com.anisa.bk;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
public class App1_OldDays {

    public static void main(String[] args) {
        Properties prop = new Properties();
        OutputStream output = null;
        try {
            // create a .properties file on demand
            output = new FileOutputStream("config.properties");
            // set the properties value
            prop.setProperty("db.url", "localhost");
            prop.setProperty("db.user", "anisa");
            prop.setProperty("db.password", "password");
            // save properties to project root folder
            prop.store(output, null);
            System.out.println(prop);
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
