public class Avioane {

    private String planeID;
    private int TotalEnginePower;

    public Avioane(String planeID, int totalEnginePower) {
        this.planeID = planeID;
        TotalEnginePower = totalEnginePower;
    }

    public void takeOff(){
        System.out.println( "Plane ID = " + getPlaneID() + " - Initiating takeoff procedure - Starting engines - Accelerating down " +
                "the runway - Taking off - Retracting gear - Takeoff complete”.");
    }

    public void fly(){
        System.out.println( "Plane ID = " + getPlaneID() + " - Flying");
    }

    public void land(){
        System.out.println( "Plane ID = " + getPlaneID() + " - Initiating landing procedure - Enabling airbrakes - " +
                "Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing " +
                "complete”.");
    }

    public String getPlaneID() {
        return planeID;
    }

    public void setPlaneID(String planeID) {
        this.planeID = planeID;
    }

    public int getTotalEnginePower() {
        return TotalEnginePower;
    }

    public void setTotalEnginePower(int totalEnginePower) {
        TotalEnginePower = totalEnginePower;
    }
}
