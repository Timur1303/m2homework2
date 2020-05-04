public class Audi extends Car implements Prinatable{
    private String model;

    public Audi(int year, int power, String name, String model){
        super(year, power, name);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void print() {
        System.out.println(getYear()+ " "+ getPower()+ " "+ getName() + " "+ getModel());

    }
}
