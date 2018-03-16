import processing.core.PApplet;
import java.util.ArrayList;

public class WeergaveObjectContainer extends WeergaveObject {

    private ArrayList<WeergaveObject> WeergaveObjecten = new ArrayList<>();

    public WeergaveObjectContainer(float x, float y, float breedte, float hoogte) {
        super(x, y, breedte, hoogte);
    }

    public void voegToe(WeergaveObject wo) {
        this.WeergaveObjecten.add(wo);
    }

    public void verwijder(WeergaveObject wo) {
        this.WeergaveObjecten.remove(wo);
    }

    @Override
    public void geefWeer(PApplet p, float startX, float startY) {
        for(WeergaveObject wo : WeergaveObjecten) {
            wo.geefWeer(p, startX + this.x, startY + this.y);
        }
    }

    @Override
    protected boolean isMuisBinnen(int muisX, int muisY) {
        if (muisX >= x && muisX < x + breedte &&
                muisY >= y && muisY < y + hoogte) {
            return true;
        }
        return false;
    }
}
