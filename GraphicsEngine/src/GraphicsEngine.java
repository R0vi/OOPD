import processing.core.PApplet;

import java.util.ArrayList;

public class GraphicsEngine extends PApplet {

    public ArrayList<WeergaveObject> wo = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("GraphicsEngine", args);
    }

    public void settings() {
        size(250,250);
    }

    public void setup() {
        Rechthoek r1 = new Rechthoek(0, 0, 10, 10);
        Rechthoek r2 = new Rechthoek(20, 20, 10, 10);
        wo.add(r1);
        wo.add(r2);
        HalloReageerder hr = new HalloReageerder();
        r1.voegReageerderToe(hr);
    }

    public void draw() {
        for (WeergaveObject o : wo) {
            o.geefWeer(this, 0 ,0);
        }
    }

    public void mousePressed() {
        for (WeergaveObject o : wo) {
            o.geefMousePressedGebeurtenis(this.mouseX, this.mouseY);
        }
    }
}