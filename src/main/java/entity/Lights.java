package entity;

public class Lights {
    String typeOfLights;
    int numberOfLights;

    public String getTypeOfLights() {
        return typeOfLights;
    }

    public void setTypeOfLights(String typeOfLights) {
        this.typeOfLights = typeOfLights;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    @Override
    public String toString() {
        return "Lights{" +
                "typeOfLights='" + typeOfLights + '\'' +
                ", numberOfLights=" + numberOfLights +
                '}';
    }
}
