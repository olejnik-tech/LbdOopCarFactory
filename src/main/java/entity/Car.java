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

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", suspension=" + suspension +
                ", breaks=" + breaks +
                '}';
    }
}
