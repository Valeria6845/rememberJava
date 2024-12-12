package homework6;

public class Run {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Barsik");
        Cat catGinger = new Cat("Ginger");
        Dog dogBobik = new Dog("Bobik");
        Dog dogSharik = new Dog("Sharik");
        System.out.println(Cat.getAmount());
        System.out.println(Dog.getAmount());
        System.out.println(Animal.getAmount());
    }
}
