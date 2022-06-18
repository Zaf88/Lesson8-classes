package MIRRORS;

public class Mirror implements RearViewMirror {
    @Override
    public String giveView() {
        return "backView";
    }
}
