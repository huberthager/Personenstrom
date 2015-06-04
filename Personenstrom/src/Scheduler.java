public class Scheduler {
  private Field field;
  private FutureEventList futureEventList;
  private double simTime;

  /**
   * Default-Konstruktor
   */
  public Scheduler() {
    simTime = 0;
    // Erzeugt ein 10*10 Grosses Feld und auf (0,5) einer PersonenQuelle und auf
    // (10,5) eine Ziel.
    field = new Field(10, 0, 5, 10, 5);
    futureEventList = new FutureEventList();

  }

  public void run() {

  }

}
