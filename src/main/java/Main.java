public class Main {
    public static void main(String[] args) {

        Student myStudent = new Student();

        myStudent.setAge(27);
        myStudent.setCity("Hamburg");
        myStudent.setBirthyear(1989);

        System.out.println("Du bist " + myStudent.getAge() + " Jahre alt.");
        System.out.println("Und du kommst aus " + myStudent.getCity() + ".");
        System.out.println("Bist geboren im Jahr " + myStudent.getBirthyear() + ".");

    }
}
