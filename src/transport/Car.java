package transport;

import persons.BusDriver;
import persons.Cabbie;

public class Car extends Transport {
    private Cabbie cabbie;
    private BusDriver busDriver;

    public Cabbie getCabbie() {
        return cabbie;
    }

    public void setCabbie(Cabbie cabbie) {
        this.cabbie = cabbie;
    }

    public Car(String id, int year, String number, String color,Cabbie cabbie,BusDriver busDriver) {
        super(id, year, number, color);
        this.cabbie = cabbie;
        this.busDriver=busDriver;
    }

    @Override
    public void run() {
        System.out.println(getId()+"is runing");
    }

    @Override
    public void stops() {
        System.out.println(getId()+"is stoping");

    }
}
