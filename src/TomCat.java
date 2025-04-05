public class TomCat extends AvioaneLupta {

    public TomCat(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }

    public void refuel() {
        System.out.println("Plane ID = " + getPlaneID() + " - Initiating refueling procedure - Locating refueller - " +
                "Catching up - Refueling - Refueling complete");
    }
}
