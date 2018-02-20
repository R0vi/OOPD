class Damsteen {
  float x, y, d;
  int kleur;

  Damsteen(float x, float y, float d, int kleur) {
    this.x = x;
    this.y = y;
    this.d = d;
    this.kleur = kleur;
  }

  void tekenDamsteen() {
    fill(kleur);
    ellipse(x, y, d, d);
  }
}