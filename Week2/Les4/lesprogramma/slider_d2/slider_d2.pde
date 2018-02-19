Slider slider1 = new Slider((width - 200) / 2, 50, 200, 50, 5);

void setup() {
  size(300, 200);
  background(0);
}
void draw() {
  slider1.bepaalSliderPositie();
  slider1.tekenSlider();
}