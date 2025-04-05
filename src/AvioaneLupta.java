public class AvioaneLupta extends Avioane{

    public AvioaneLupta(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }

    public void launchMissle(){
        System.out.println("Plane ID = " + getPlaneID() + " - Initiating takeoff procedure - Starting engines - Accelerating down " +
                "the runway - Taking off - Retracting gear - Takeoff complete”.");
    }
}
