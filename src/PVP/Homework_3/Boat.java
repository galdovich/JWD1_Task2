package PVP.Homework_3;

public class Boat extends Ships {
    private String manOnABoat;
    private double weight;
    private static int count;

    // Constructors

    public Boat(String application, String name, int passengers, double length, int maxSpeed, String manOnABoat, double weight) {
        super(application, name, passengers, length, maxSpeed);
        this.manOnABoat = manOnABoat;
        this.weight = weight;
        count++;
    }

    public Boat() {

        count++;
    }

    // Getter and Setter
    public String getManOnABoat() {
        return manOnABoat;
    }

    public void setManOnABoat(String manOnABoat) {
        this.manOnABoat = manOnABoat;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "\t " + "Хозяин: " +
                manOnABoat + "\t " +
                "Вес: " + weight;
    }

    public static int getObjectsCount (){
        return count;
    }
}
