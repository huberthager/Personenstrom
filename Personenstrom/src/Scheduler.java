

public class Scheduler {
  private Field field;
  private FutureEventList futureEventList;
  private double simTime;
  private double endSimTime;
  private Person person;

  /**
   * Default-Konstruktor
   */
  public Scheduler(double endSimTime) {
    simTime = 0;
    this.endSimTime=endSimTime;
    // Erzeugt ein 10*10 Grosses Feld und auf (0,5) einer PersonenQuelle und auf
    // (10,5) eine Ziel.
    field = new Field(10, 0, 5, 9, 5);
    person=field.getSourceCell().getSource().createPerson1();
    futureEventList = new FutureEventList();
    futureEventList.addEvent(new NextStep(simTime));
    }

  public void run() {
	  Event currentEvent;
	  
	  while (!futureEventList.isEmpty() && simTime < endSimTime) {
			currentEvent = futureEventList.getFirst();
			simTime = currentEvent.getEventTime();// hole dir das event mit der
												// kleinesten Zeit
			currentEvent.processEvent( futureEventList,person, simTime,1,field);
			futureEventList.removeFirst();
			
	  
  }

}
}