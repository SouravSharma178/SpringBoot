@Entity
public class Person {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String emailId;
// getters and setters
}