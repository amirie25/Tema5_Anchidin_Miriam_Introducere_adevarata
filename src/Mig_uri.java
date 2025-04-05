public class Mig_uri extends AvioaneLupta {

    public Mig_uri(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }

    public void highSpeedGeometry(){
        System.out.println("Plane ID = " + getPlaneID() + " - High speed geometry selected");
    }

    public void normalGeometry(){
        System.out.println("Plane ID = " + getPlaneID() + " - Normal geometry selected");
    }
}
