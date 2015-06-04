public class Person {

  private double freeFlowVelocity; // Wunschgeschwindigkeit in m/s
  private Cell location; // Zelle auf dem Feld in der Person steht

  public Person(Cell loc, double velocity) {
    this.location = loc;
    // this.freeFlowVelocity = initFreeFlowVelocity();
    this.freeFlowVelocity = velocity;
  }

  // // Normalverteilte Wunschgeschwindigkeit einer Person
  // private double initFreeFlowVelocity() {
  // return new Random().nextGaussian(); // normalverteilte pseudo
  // // Zufallszahl
  // }
}
