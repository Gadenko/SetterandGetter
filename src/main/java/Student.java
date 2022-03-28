public class Student {

    private int age;
    private String city;
    private int birthyear;

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
}
