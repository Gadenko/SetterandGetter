package Model;
import java.time.LocalDate;

public class Student {

    private int age;
    private String city;
    private int birthyear;
    private LocalDate birthday;
    private String name;

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public int getAge() {
        return age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", city='" + city + '\'' +
                ", birthyear=" + birthyear +
                ", birthday=" + birthday +
                ", name='" + name + '\'' +
                '}';
    }
}
