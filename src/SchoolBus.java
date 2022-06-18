import CARS.Car;
import Cabins.Cabin;
import LIGHTS.Headlight;
import MIRRORS.RearViewMirror;

public class SchoolBus extends Car implements Bus{

    public SchoolBus(Headlight headLight, RearViewMirror rearViewMirror, Cabin cabin) {
        super(headLight, rearViewMirror, cabin);
    }
    @Override
    public String transportPeople() {
        return "children";
    }
}
