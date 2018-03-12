import processing.core.PApplet;

import java.util.ArrayList;

public abstract class Knop {
    protected PApplet app;
    protected float x, y, breedte, hoogte;
    protected ArrayList<IDoelwit> doelwitten = new ArrayList<IDoelwit>();

    public Knop(PApplet app, float x, float y, float breedte, float hoogte) {
        this.app = app;
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    public boolean isMuisOverKnop() {
        if (app.mouseX >= x && app.mouseX < x + breedte &&
                app.mouseY >= y && app.mouseY < y + hoogte) {
            return true;
        } else {
            return false;
        }
    }

    public void handelInteractieAf() {
        doeKnopActie();
    }

    protected void doeKnopActie() {

    }

    public void voegDoelwitToe(IDoelwit doelwit) {
        doelwitten.add(doelwit);
    }

    public abstract void tekenKnop();
}