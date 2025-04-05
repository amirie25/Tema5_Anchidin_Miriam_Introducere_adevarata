public class Concorde extends AvioaneLupta{

    public Concorde(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }

    public void goSuperSonic(){
        System.out.println("Plane ID = " + getPlaneID() + " - Supersonic mode activated");
    }

    public void goSubSonic(){
        System.out.println("Plane ID = " + getPlaneID() + " Supersonic mode deactivated");
    }
}
