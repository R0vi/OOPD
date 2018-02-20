void setup() {
  kaartMachine kaartmachine1 = new kaartMachine("One Piece", 420.69);
  kaartmachine1.geldInwerpen(400);
  kaartmachine1.betaal();
  kaartmachine1.geldInwerpen(20.69);
  kaartmachine1.betaal();
}