public class Main {

    public static void main(String[] args) {

        createObject(BMW.class.getName()).print();
        createObject(Mercedes.class.getName()).print();
        createObject(Audi.class.getName()).print();
    }

    public static Car createObject(String className){
        Car car = null;
        switch (className){
            case "BMW": car  = new BMW(2018, 560, "BMW", "White");
            break;
            case "Mercedes": car  = new Mercedes(2017, 500, "Mercedes", "Sedan");
                break;
            case "Audi": car  = new Audi(2019, 450, "Audi", "RS6");
                break;

        }
        return car;



    }

}
