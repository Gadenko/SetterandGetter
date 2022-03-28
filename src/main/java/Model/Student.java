package Model;
import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (birthyear != student.birthyear) return false;
        if (!Objects.equals(city, student.city)) return false;
        if (!Objects.equals(birthday, student.birthday)) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + birthyear;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
