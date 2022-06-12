public class Main {


    public static void main(String[] args) {
// create car
        Headlight Lamp = new Lamp();
        RearViewMirror Mirror = new Mirror();
        BMW bmw = new BMW(Lamp, Mirror);
        System.out.println(Car.rearViewMirror.giveView());
        System.out.println(Car.headlight.givelight());
    }
}
