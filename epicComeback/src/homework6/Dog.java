package homework6;

public class Dog extends Animal{

    private String name;
    private static int amount;

    public static int getAmount() {
        return amount;
    }

    public Dog(String name) {
        super(name);
        this.name = name;
        amount++;
    }

    @Override
    public void run(int obstacle) {
        if (obstacle <= 500) {
            System.out.println("Dog ran through " + obstacle + "m");
        }else {
            System.out.println("Dog can`t run more than 500m");
        }
    }

    @Override
    public void swim(int obstacle) {
        if (obstacle <= 10) {
            System.out.println("Dog swam " + obstacle + "m");
        }else {
            System.out.println("Dog can`t swim more than 10m");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
