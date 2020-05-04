public class Mercedes extends Car implements Prinatable {
    private String bodyType;

    public Mercedes(int year, int power, String name, String bodyType){
        super(year, power, name);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public void print() {
        System.out.println(getYear()+ " "+ getPower()+ " "+ getName() + " "+ getBodyType());


    }
}
