import CARS.Car;
import Cabins.Cabin;
import LIGHTS.Headlight;
import MIRRORS.RearViewMirror;

public class CAT extends Car implements Truck {


    public CAT(Headlight headLight, RearViewMirror rearViewMirror, Cabin cabin) {
        super(headLight, rearViewMirror, cabin);
    }
    @Override
    public String transportCargo() {
        return "boxes";
    }
}
