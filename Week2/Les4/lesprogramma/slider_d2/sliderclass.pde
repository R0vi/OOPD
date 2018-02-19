class Slider {
  float x, y, sWidth, sHeight;
  int indexes, positie;

  Slider(float x, float y, float sWidth, float sHeight, int indexes) {
    this.x = x;
    this.y = y;
    this.sWidth = sWidth;
    this.sHeight = sHeight;
    this.indexes = indexes;
  }

  void bepaalSliderPositie() {
    float blokjeBreedte = this.sWidth / this.indexes;

    if (mouseX < this.x) {
      this.positie = 0;
    } else if (mouseX >= this.sWidth + this.x) {
      this.positie = this.indexes - 1;
    } else {
      this.positie = floor((mouseX  - this.x) / blokjeBreedte);
    }
  }

  void tekenSlider() {

    float blokjeBreedte = this.sWidth / this.indexes;

    noStroke();
    fill(255);
    rect(this.x, this.y, this.sWidth, this.sHeight);

    fill(#2257F0);
    rect(this.x + this.positie * blokjeBreedte, this.y, blokjeBreedte, this.sHeight);
  }
}