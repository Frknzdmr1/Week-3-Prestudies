package persons;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("I like numbers in Java - aren't they int-eresting?!");
        student1.setName("Furkan");
        student1.setAge(27);
        student1.setAddress("Toronto");

        student1.introduce();
        student1.tellJoke();
    }
}
