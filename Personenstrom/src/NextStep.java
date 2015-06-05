import java.util.Set;

public class NextStep extends Event {
	
	public NextStep(double simTime) {
		eventTime=simTime;
	}
  /**
 * 
 */
  @Override
  void processEvent(FutureEventList futureEventList, Person person,
	      double simTime, int cellLength,Field field) {

    double velocity = person.getFreeFlowVelocity();
    Cell that = person.getLocation();
    Cell other = this.nextBestCell(person,field);
    that.setIsOccupied(false);
    other.setIsOccupied(true);
    double dist = this.euklidDist(that, other, cellLength);
    futureEventList.addEvent(new StepFinished(simTime + dist / velocity));

  }

  /**
   * 
   * @param person
   * @return Zelle mit dem hoechsten Nutzenanstieg
   */
  private Cell nextBestCell(Person person, Field field) {
    Cell bestCell=person.getLocation();
    double utilityValue=0;
    Set<Cell> neighbours=person.getLocation().getNeighbours(field);
    double utilityValueNeighbour;
    for(Cell c : neighbours){
    	utilityValueNeighbour=this.euklidDist(c, field.getTargetCell(), 1)*(-1);
    	if(utilityValueNeighbour>utilityValue){
    		utilityValue=utilityValueNeighbour;
    		bestCell=c;
    	}
    }
    
    
    return bestCell;

  }

  /**
   * 
   * @param that
   * @param other
   * @param cellLength
   * @return Distanz zwischen den Zellenmittelpunkten that und other.
   */

  private double euklidDist(Cell that, Cell other, int cellLength) {
    // Zellenmittelpunkte zur berechnung verwenden
    int x1 = that.getX() + cellLength / 2;
    int y1 = that.getY() + cellLength / 2;
    int x2 = other.getX() + cellLength / 2;
    int y2 = other.getY() + cellLength / 2;

    // euklidischer Abstand
    return Math.sqrt(Math.pow(Math.abs(x2 - x1), 2)
        + Math.pow(Math.abs(y2 - y1), 2));

  }
}
