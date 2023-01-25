package transport;

import persons.Seller;

public class Trolleybus extends Transport {
    private Seller seller;

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Trolleybus(String id, int year, String number, String color, Seller seller) {
        super(id, year, number, color);
        this.seller = seller;
    }

    public Trolleybus(Seller seller) {
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
