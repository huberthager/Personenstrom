public class Person {

  private double freeFlowVelocity; // Wunschgeschwindigkeit in m/s
  private Cell location; // Zelle auf dem Feld in der Person steht

  public Person(Cell loc, double velocity) {
    this.location = loc;
    // this.freeFlowVelocity = initFreeFlowVelocity();
    this.freeFlowVelocity = velocity;
  }

  /**
   * @return the freeFlowVelocity
   */
  public double getFreeFlowVelocity() {
    return freeFlowVelocity;
  }

  /**
   * @param freeFlowVelocity
   *          the freeFlowVelocity to set
   */
  public void setFreeFlowVelocity(double freeFlowVelocity) {
    this.freeFlowVelocity = freeFlowVelocity;
  }

  /**
   * @return the location
   */
  public Cell getLocation() {
    return location;
  }

  /**
   * @param location
   *          the location to set
   */
  public void setLocation(Cell location) {
    this.location = location;
  }

  // // Normalverteilte Wunschgeschwindigkeit einer Person
  // private double initFreeFlowVelocity() {
  // return new Random().nextGaussian(); // normalverteilte pseudo
  // // Zufallszahl
  // }
}
