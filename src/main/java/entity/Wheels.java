package entity;

public class Wheels {
    int numOfWheels;
    String size;

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "numOfWheels=" + numOfWheels +
                ", size='" + size + '\'' +
                '}';
    }
}
