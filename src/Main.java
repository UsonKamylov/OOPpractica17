import persons.BusDriver;
import persons.Cabbie;
import persons.Seller;
import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Trolleybus;

public class Main {
    public static void main(String[] args) {



        Seller seller=new Seller("Bakyt",22,80.4,"seller");
        Cabbie cabbie=new Cabbie("Asaan",23,70.4,"cabbie");
        BusDriver  busDriver=new BusDriver("Uson",23,85.4,"busdriver");
        System.out.println(seller);
        System.out.println(cabbie);
        System.out.println(busDriver);

        Bus bus=new Bus("Автобус",2017,"AO 098 OA","Blue",seller,busDriver);
        Trolleybus trel = new Trolleybus("trell",2018,"UI 8909 IU","Silver",seller);
        Car car=new Car("BMW",2020,"AA 77 OO","Black",cabbie,busDriver);
        System.out.println("_____________________________________________");
        System.out.println(bus);
        bus.run();
        bus.stops();
        System.out.println("__________________________________________");
        System.out.println(trel);
        trel.run();
        trel.stops();
        System.out.println("____________________________________-");
        System.out.println(car);
        car.run();
        car.stops();




    }

}