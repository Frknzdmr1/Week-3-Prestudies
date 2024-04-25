package persons;

public class Student extends Person{
    private String joke;

    public Student(String joke) {
        this.joke = joke;
    }
    public void setJoke() {
        this.joke = joke;
    }
    public void getJoke() {
        this.joke = joke;
    }
    public void tellJoke(){
        System.out.println(this.joke);
    }
}
