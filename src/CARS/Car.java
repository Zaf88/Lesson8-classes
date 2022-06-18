package CARS;

import Cabins.Cabin;
import LIGHTS.Headlight;
import MIRRORS.RearViewMirror;

public abstract class Car {

    public Headlight headLight;
    public RearViewMirror rearViewMirror;
    public Cabin cabin;

    public Car(Headlight headLight, RearViewMirror rearViewMirror,Cabin cabin) {
        this.headLight = headLight;
        this.rearViewMirror = rearViewMirror;
        this.cabin = cabin;
    }

}
