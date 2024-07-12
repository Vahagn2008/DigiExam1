package room.model;

public class Plane {

    private String model;
    private String country;
    private int year;  // 1903-2023
    private int hours; // 0-10000
    private boolean isMilitary;
    private int weight; // 10000-160000 kg
    private byte wingSpan; // 10-45 m
    private short speed; // max 1000km/h, not negative
    private short seats; // not negative
    private double coast;

    public Plane(String model, String country, int year, int hours, boolean isMilitary, int weight, byte wingSpan, short speed, short seats, double coast) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.isMilitary = isMilitary;
        this.weight = weight;
        this.wingSpan = wingSpan;
        this.speed = speed;
        this.seats = seats;
        this.coast = coast;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public byte getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(byte wingSpan) {
        this.wingSpan = wingSpan;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public short getSeats() {
        return seats;
    }

    public void setSeats(short seats) {
        this.seats = seats;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public void Task1() {

        System.out.println("model: " + model);
        System.out.println("country: "+ country);
        if (getYear() > 1902 && getYear() < 2024) {
            System.out.println("year" + year);
        }else {
            System.out.println("Your plane is old or not created");
        }
        if (getHours() > 0 && getHours() < 10001) {
            System.out.println("hours: " + hours);
        }else {
            System.out.println("you are not fly or fly more that we want");
        }
        System.out.println("isMilitary: " + isMilitary);
        if (getWeight() > 9999 && getWeight() < 160001) {
            System.out.println("weight: " + weight);
        }else {
            System.out.println("Your plane is not heavy or it is very heavy");
        }
        if (getWingSpan() > 9 && getWingSpan() < 45) {
            System.out.println("wing span: " + wingSpan);
        }else {
            System.out.println("wings are very short or very long");
        }
        if (getSpeed() > 0 && getSpeed() < 1001) {
            System.out.println("speed: " + speed);
        }else {
            System.out.println("plane is staying or flying very fast");
        }
        if (getSeats() > 0) {
            System.out.println("seats: " + seats);
        }else {
            System.out.println("plane hasn't have seats or you type negative number");
        }
        System.out.println("coast: " + coast);

    }
}
