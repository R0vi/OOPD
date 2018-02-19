class Slider {
  float x, y, sWidth, sHeight;
  int indexes;

  Slider(float x, float y, float sWidth, float sHeight, int indexes) {
    this.x = x;
    this.y = y;
    this.sWidth = sWidth;
    this.sHeight = sHeight;
    this.indexes = indexes;
  }

  void drawSlider() {
    color(255, 0, 0);
    rect(x, y, sWidth, sHeight);
  }
}


void setup() {
  size(300, 200);
  background(0);

  Slider slider1 = new Slider((width - 200) / 2, 50, 200, 50, 5);
  slider1.drawSlider();
}