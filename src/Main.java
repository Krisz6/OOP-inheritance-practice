// Importáljuk a package-ekbe rendezett classokat
import data.Person;
import data.Staff;
import data.Student;

public class Main {
    public static void main(String[] args) {
        // Ezt nyugodtan módosítsd!
        Person person = new Person("Laci", "123");
        Staff staff = new Staff("Maki", "234","suli",
                600);
        Student student = new Student("Tobi","345",
                "Futás",1993,38);
    }
}
