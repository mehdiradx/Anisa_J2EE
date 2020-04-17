/**
 * Created by asus on 2019/09/06.
 */
//pojo
public class Person {

    private int id;
    private String name;
    private int city;


    public Person() {
    }

    public Person(int id, String name, int city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }
}
