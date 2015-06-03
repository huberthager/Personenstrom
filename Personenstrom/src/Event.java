public abstract class Event {

  protected double eventTime;

  /**
   * @return the eventTime
   */
  public double getEventTime() {
    return eventTime;
  }

  abstract void processEvent();

}
