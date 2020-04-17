package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by asus on 2019/12/14.
 */

class Samand {
    public String color;
    public int model;
    public Samand(String color, int model) {
        this.color = color;
        this.model = model;
    }
    @Override
    public String toString() {
        return "samand:color:" + color + " model:" + model;
    }
}
public class StreamSample {
    public static void main(String[] args) {
        List<Samand> samandList = Arrays.asList(
                new Samand("red", 1393),
                new Samand("red", 1392),
                new Samand("red", 1397),
                new Samand("red", 1398),
                new Samand("rellow", 1398),
                new Samand("red", 1390),
                new Samand("red", 1394),
                new Samand("green", 1398),
                new Samand("black", 1398)

        );


//        samandList.stream().forEach((s)->System.out.println(s.model));
//        samandList
//                .stream()
//                .filter((s) -> {
//                    if (s.model > 1392)
//                        return true;
//
//                    return false;
//                })
//                .sorted((p,q)->
//                    p.model-q.model
//                )
//                .forEach((s)->{
//                    System.out.println(s);
//                });


//                .forEach(System.out::println);



//        samandList
//                .stream()
//                .filter((s) -> {
//                    if (s.color.startsWith("re"))
//                        return true;
//
//                    return false;
//                })
//                .forEach((s)->{
//                    System.out.println(s);
//                });


//        long a=samandList.stream()
//                .map((s)->s.color)
//                .filter((e)->{
//                    return e.length()<4 ;
//                })
//                .count();
//
//        System.out.println(a);



//        samandList.stream()
//                .map(Samand->Samand.color)
//                .filter(color->color.startsWith("r"))
//                .forEach((s)-> System.out.println(s));

//        Optional<Integer> total=samandList.stream().parallel()
//                .map(Samand->Samand.model)
//                .reduce((p,q)->p+q);

//        System.out.println(total.isPresent());


//        if (total.isPresent())
//                total.ifPresent((s)-> System.out.println("hooora "+s));
//        else
//            System.out.println(total.orElse(Integer.MAX_VALUE));



            ////////////////////////optional empty

//            Optional<Double> myOpt=(null ==null)?Optional.empty():Optional.of(new Double(4.4));

            ////////////////////////optional empty







//        long total=samandList.stream()
//                .map(Samand->Samand.color)
//                .filter(color->color.startsWith("r"))
//                .count();
//
//        System.out.println(total);


//        boolean a=samandList.stream()
//                .anyMatch(s->s.color.equals("red"));

//        boolean a=samandList.stream()
//                .noneMatch(s->s.color.equals("yellow"));
//        System.out.println(a);


//        List<Samand>  samands=samandList.stream()
//                .filter(s->s.color.equals("red"))
//                .collect(Collectors.toList());


//        Map<String,Integer> map=samandList.stream()
//                .collect(Collectors.toMap(s->s.color,s->s.model));
//
//
//        samandList.stream().max((p,q)->p.model-q.model);


    }

}
