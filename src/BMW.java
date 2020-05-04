public class BMW extends Car implements Prinatable {
    private String color;

    public BMW(int year, int power, String name,String color) {
        super(year, power, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println(getYear()+ " "+ getPower()+ " "+ getName() + " "+ getColor());



    }
}
