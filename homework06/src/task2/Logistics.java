package task2;

public class Logistics {
    public static void main(String[] args) {

        RoadLogistics road = new RoadLogistics();
        Transport r = road.createTransport();

        SeaLogistics sea = new SeaLogistics();
        Transport s = sea.createTransport();

     r.deliver();
     s.deliver();
    }

}
