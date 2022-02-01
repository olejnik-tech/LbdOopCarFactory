package entity;

import enums.Breaks;
import enums.Engine;
import enums.Suspension;

/**
 * Car Entity
 */
public class Car {

    public Engine engine;
    public Suspension suspension;
    public Breaks breaks;

    public Wheels wheels;
    public Lights lights;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    public Breaks getBreaks() {
        return breaks;
    }

    public void setBreaks(Breaks breaks) {
        this.breaks = breaks;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Lights getLights() {
        return lights;
    }

    public void setLights(Lights lights) {
        this.lights = lights;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", suspension=" + suspension +
                ", breaks=" + breaks +
                ", wheels=" + wheels +
                ", lights=" + lights +
                '}';
    }
}
