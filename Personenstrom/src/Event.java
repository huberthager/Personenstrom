public abstract class Event {

  protected double eventTime;

  /**
   * @return the eventTime
   */
  public double getEventTime() {
    return eventTime;
  }

  /**
   * Fuehrt Ereignis aus.
   */
  abstract void processEvent();

}
