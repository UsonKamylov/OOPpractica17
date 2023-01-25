package transport;

public abstract class Transport {
    private String id;
    private  int year;
    private  String number;
    private String color;

    public Transport(String id, int year, String number, String color) {
        this.id = id;
        this.year = year;
        this.number = number;
        this.color = color;
    }

    public Transport() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }
    public abstract void run();
    public abstract void stops();

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Transport.Transport{" +
                "id='" + id + '\'' +
                ", year=" + year +
                ", number='" + number + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
