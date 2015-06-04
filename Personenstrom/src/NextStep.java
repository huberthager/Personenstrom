public class NextStep extends Event {
  /**
 * 
 */
  @Override
  void processEvent(FutureEventList futureEventList, Person person,
      double simTime, int CellSize) {

    double velocity = person.getFreeFlowVelocity();
    Cell that = person.getLocation();
    Cell other = this.nextBestCell(person);
    double dist = this.euklidDist(that, other, CellSize);
    futureEventList.addEvent(new StepFinished(simTime + dist / velocity));

  }

  /**
   * 
   * @param person
   * @return Zelle mit dem hoechsten Nutzenanstieg
   */
  private Cell nextBestCell(Person person) {
    Cell result;
    double utilityValue;
    // Fall Freie Sicht auf Ziel
    // check die 8 umliegenden Zellen mit switch case?

    // pseudo return
    return new Cell(1, 1);

  }

  /**
   * 
   * @param that
   * @param other
   * @param CellSize
   * @return Distanz zwischen den Zellenmittelpunkten that und other.
   */

  private double euklidDist(Cell that, Cell other, int CellSize) {
    // Zellenmittelpunkte zur berechnung verwenden
    int x1 = that.getX() + CellSize / 2;
    int y1 = that.getY() + CellSize / 2;
    int x2 = other.getX() + CellSize / 2;
    int y2 = other.getY() + CellSize / 2;

    // euklidischer Abstand
    return Math.sqrt(Math.pow(Math.abs(x2 - x1), 2)
        + Math.pow(Math.abs(y2 - y1), 2));

  }
}
