package homework5;

public class Run {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        Coworker coworker = new Coworker("Firstname", "Secondname",
                "Thirdname", "HR", "email@mail.com",
                "12345", 25);
        System.out.println(coworker);
    }
}
