package persons;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Furkan");
        person.setAge(27);
        person.setAddress("Toronto");
        person.introduce();
    }
}
