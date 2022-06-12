public class Main {


    public static void main(String[] args) {
// create car
        Lamp lamp = new Lamp();
        Mirror mirror = new Mirror();
        BMW bmw = new BMW(lamp, mirror);
        System.out.println(BMW.mirror.giveView());
        System.out.println(BMW.lamp.givelight());
    }
}
