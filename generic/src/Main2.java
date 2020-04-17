/**
 * Created by asus on 2019/08/02.
 */
public class Main2<T,S> {
    public void sum(T t,S s)
    {
        System.out.println(t);
        //generic
    }
    public static void main(String[] args) {
        Main2<Integer,Double> main2=new Main2<>();
        main2.sum(3,3.3333);
        Main2<String ,Integer> main21=new Main2<>();
        main21.sum("hello",3);
    }
}
