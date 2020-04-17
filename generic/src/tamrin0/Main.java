package tamrin0;

/**
 * Created by asus on 2019/10/25.
 */
public class Main {
    public static void main(String[] args) {

        Zarf<String ,Integer> zarf=new Zarf<String, Integer>() {
            @Override
            public String rikhtan(Integer integer) {
                return String.valueOf(integer);
            }
        };



    }
}
