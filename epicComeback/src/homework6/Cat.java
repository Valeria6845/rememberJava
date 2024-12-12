package homework6;

public class Cat extends Animal{

    private String name;
    private static int amount;

    public static int getAmount() {
        return amount;
    }

    public Cat(String name) {
        super(name);
        this.name = name;
        amount++;
    }
    @Override
    public void run(int obstacle) {
        if (obstacle <= 200) {
            System.out.println("Cat ran through " + obstacle + "m");
        }else {
            System.out.println("Cat can`t run more than 200m");
        }
    }
    @Override
    public void swim(int obstacle) {
        System.out.println("Cat can`t swim");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
