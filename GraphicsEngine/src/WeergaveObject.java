import processing.core.PApplet;

import java.util.ArrayList;

public abstract class WeergaveObject {

    protected float x, y, vx, vy, ax, ay, breedte, hoogte;
    protected boolean isZichtbaar;

    public ArrayList<IReageerder> reageerders = new ArrayList<>();

    public WeergaveObject(float x, float y, float breedte, float hoogte) {
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    public void setSnelheid(float vx, float vy) {
        this.vx = vx;
        this.vy = vy;
    }

    public void setVersnelling(float ax, float ay) {
        this.ax = ax;
        this.ay = ay;
    }

    private void pasVersnellingToe() {
        vx += ax;
        vy += ay;
    }

    private void pasSnelheidToe() {
        x += vx;
        y += vy;
    }

    public void zetStil() {
        vx = vy = ax = ay = 0;
    }

    public boolean staatStil() {
        return (vx == 0 && vy == 0 && ax == 0 && ay == 0);
    }

    public void setIsZichtbaar(boolean zichtbaar) {
        this.isZichtbaar = zichtbaar;
    }

    public boolean getIsZichtbaar() {
        return this.isZichtbaar;
    }

    public void doeStap() {
        if (!staatStil()) {
            pasVersnellingToe();
            pasSnelheidToe();
        }
    }

    public abstract void geefWeer(PApplet app, float startX, float startY);

    protected abstract boolean isMuisBinnen(int muisX, int muisY);

    public void geefMousePressedGebeurtenis(int mouseX, int mouseY) {
        if(isMuisBinnen(mouseX, mouseY)) {
            for(IReageerder r : reageerders) {
                r.doeActie();
            }
        }
    }

    public void voegReageerderToe(IReageerder reageerder) {
        reageerders.add(reageerder);
    }

    public void verwijderReageerder(IReageerder reageerder) {
        reageerders.remove(reageerder);
    }
}
