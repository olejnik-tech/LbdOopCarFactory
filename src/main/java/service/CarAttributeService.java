package service;

import enums.Breaks;
import enums.Engine;
import enums.Suspension;

/**
 * Car Attribute Factory
 * Used by Car Factory to determine specific attributes
 */
public class CarAttributeService {

    protected static Engine decideEngine(String engineString){
        switch(engineString) {
            case "MotorA":
                return Engine.ENGINE_A;
            case "MotorB":
                return Engine.ENGINE_B;
            case "MotorC":
                return Engine.ENGINE_C;
            default:
                return null;
        }
    }

    protected static Suspension decideSuspension(String suspensionString){
        switch(suspensionString) {
            case "SuspensionA":
                return Suspension.SUSPENSION_A;
            case "SuspensionB":
                return Suspension.SUSPENSION_B;
            case "SuspensionC":
                return Suspension.SUSPENSION_C;
            default:
                return null;
        }
    }

    protected static Breaks decideBreaks(String breaksString){
        switch(breaksString) {
            case "BreaksA":
                return Breaks.BREAKS_1;
            case "BreaksB":
                return Breaks.BREAKS_2;
            case "BreaksC":
                return Breaks.BREAKS_3;
            default:
                return null;
        }
    }
}
