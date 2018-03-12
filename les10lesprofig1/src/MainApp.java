import processing.core.PApplet;

public class MainApp extends PApplet {

    private Rechthoek r = new Rechthoek(50, 50 ,50 ,50);

    public static void main(String[] args) {
        PApplet.main("MainApp", args);
    }

    public void settings() {
        size(250,250);

    }

    public void setup() {
        r.setKleur(150);
    }

    public void draw() {
        background(0);
        if(keyPressed) {
            System.out.println("xP");
            switch (key) {
                case 'a':
                    System.out.println("xd");
                    r.setSnelheid(-1,0);
                    r.doeStap();
                    r.zetStil();
                case 's':
                    r.setSnelheid(0,1);
                    r.doeStap();
                    r.zetStil();
                case 'd':
                    r.setSnelheid(1,0);
                    r.doeStap();
                    r.zetStil();
                case 'w':
                    r.setSnelheid(0,-1);
                    r.doeStap();
                    r.zetStil();
            }
        }
        r.tekenRechthoek(this);
    }
}