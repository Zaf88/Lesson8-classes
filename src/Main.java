import CARS.BMW;
import CARS.Car;
import Cabins.Cabin;
import Cabins.CabinFourPlaces;
import LIGHTS.Headlight;
import LIGHTS.Lamp;
import MIRRORS.Mirror;
import MIRRORS.RearViewMirror;

public class Main {


    public static void main(String[] args) {
// create car
        Headlight lamp = new Lamp();
        RearViewMirror mirror = new Mirror();
        CabinFourPlaces cabinFourPlaces = new CabinFourPlaces();
        BMW bmw = new BMW(lamp, mirror, cabinFourPlaces);
        System.out.println(bmw.rearViewMirror.giveView());
        System.out.println(bmw.headLight.giveLight());
        CAT cat = new CAT(lamp, mirror, cabinFourPlaces);
        System.out.println(cat.transportCargo());
        SchoolBus schoolBus = new SchoolBus(lamp, mirror, cabinFourPlaces);
        System.out.println(schoolBus.transportPeople());
        System.out.println(schoolBus.cabin.countOfPlaces());
    }
}
