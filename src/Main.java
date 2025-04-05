public class Main {
    public static void main(String[] args) {

        Boeing boeing747 = new Boeing("BOEING-001", 65000, 416);
        boeing747.takeOff();
        boeing747.fly();
        boeing747.land();
        System.out.println("Max passengers: " + boeing747.getMaxPassengers());

        Concorde concorde = new Concorde("CONCORDE-001", 38000);
        concorde.takeOff();
        concorde.fly();
        concorde.goSuperSonic();
        concorde.goSubSonic();
        concorde.land();

        Mig_uri mig29 = new Mig_uri("MIG-001", 18000);
        mig29.takeOff();
        mig29.highSpeedGeometry();
        mig29.launchMissle();
        mig29.normalGeometry();
        mig29.land();
        
        TomCat tomcat = new TomCat("TOMCAT-001", 50000);
        tomcat.takeOff();
        tomcat.fly();
        tomcat.refuel();
        tomcat.land();
    }
}