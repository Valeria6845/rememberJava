package homework5;

public class Coworker {
    private String firstName;
    private String secondName;
    private String thirdName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;

    public Coworker(String firstName, String secondName, String thirdName,
                    String position, String email, String phoneNumber, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Coworker{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
