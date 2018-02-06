void setup() {
  size(200, 200);
  Damsteen damsteenwit = new Damsteen(10, 10, 20, 255);
  Damsteen damsteenzwart = new Damsteen(40, 40, 20, 0);
  fill(damsteenwit.kleur);
  ellipse(damsteenwit.x, damsteenwit.y, damsteenwit.diameter, damsteenwit.diameter);
  fill(damsteenzwart.kleur);
  ellipse(damsteenzwart.x, damsteenzwart.y, damsteenzwart.diameter, damsteenzwart.diameter);
}

class Damsteen {
  int x;
  int y;
  int diameter;
  int kleur;
  
  Damsteen(int x, int y, int diameter, int kleur) {
    this.x = x;
    this.y = y;
    this.diameter = diameter;
    this.kleur = kleur;
  }
}