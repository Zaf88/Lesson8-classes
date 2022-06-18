package LIGHTS;

public class Lamp implements Headlight {
    @Override
    public String giveLight() {
        return "highBeam";
    }
}
