package homework6;

public class Animal {
    private String name;
    private static int amount;

    public Animal(String name) {
        this.name = name;
        amount++;
    }

    public static int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void run(int obstacle) {
    }
    public void swim(int obstacle) {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
