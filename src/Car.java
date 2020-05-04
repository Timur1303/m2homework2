public class Car implements Prinatable {
    private int year;
    private int power;
    private String name;

    public Car(int year, int power, String name){
        this.year  = year;
        this.power = power;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {

    }
}
