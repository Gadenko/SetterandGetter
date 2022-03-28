import Model.Student;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Student myStudent = new Student("David");

        myStudent.setAge(27);
        myStudent.setCity("Dresden");
        myStudent.setBirthyear(1989);
        myStudent.setBirthday(LocalDate.of(1989,9,30));

        System.out.println("My are " + myStudent.getAge() + " years old.");
        System.out.println("And I come from " + myStudent.getCity() + ".");
        System.out.println("I am born in the year " + myStudent.getBirthyear() + ".");
        System.out.println("My birthday is at " + myStudent.getBirthday() + ".");
        System.out.println("My name is " +myStudent.getName());
        System.out.println(myStudent.toString());

    }
}
