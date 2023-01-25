package transport;

import persons.BusDriver;
import persons.Seller;

public class Bus extends Transport {
    private  Seller seller;
    private BusDriver busDriver;

    public Bus(String id, int year, String number, String color,Seller seller, BusDriver busDriver) {
        super(id, year, number, color);
        this.seller=seller;
        this.busDriver=busDriver;
    }

    public BusDriver getBusDriver() {
        return busDriver;
    }

    public void setBusDriver(BusDriver busDriver) {
        this.busDriver = busDriver;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
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
