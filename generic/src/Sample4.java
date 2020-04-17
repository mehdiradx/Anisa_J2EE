/**
 * Created by asus on 2019/08/02.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample4
{
    public static void main(String[] args)
    {
        List<String> directions = new ArrayList<String>();
        directions.add("north");
        directions.add("south");
        directions.add("east ");
        directions.add("west ");
        printList(directions);
        List<Integer> grades = new ArrayList<Integer>();
        grades.add(new Integer(98));
        grades.add(new Integer(63));
        grades.add(new Integer(87));
        printList(grades);
    }

    static void printList(List<?> list)
    {
        Iterator<?> iter = list.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }

//    void copy(List<?> src, List<?> dest, Filter filter)
//    {
//        for (int i = 0; i < src.size(); i++)
//            if (filter.accept(src.get(i)))
//                dest.add(src.get(i));
//    }

    //This method’s parameter list is correct, but there’s a problem. According to the compiler, dest.add(src.get(i)); violates type safety. The ? implies that any kind of object can be the list’s element type, and it’s possible that the source and destination element types are incompatible.

    //For example, if the source list was a List of Shape and the destination list was a List of String, and copy() was allowed to proceed, ClassCastException would be thrown when attempting to retrieve the destination list’s elements.

    //You could partially solve this problem by providing upper and lower bounds for the wildcards, as follows:


    void copy(List<? extends String> src, List<? super String> dest,
              Filter filter)
    {
        for (int i = 0; i < src.size(); i++)
            if (filter.accept(src.get(i)))
                dest.add(src.get(i));
    }

}
