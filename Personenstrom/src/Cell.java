public class Cell {

  private boolean isOccupied; // Besetzt?
  private int x; // X-Koordiante der Zelle
  private int y; // Y-Koordinate der Zelle
  private Person person; // Person in Zelle
  private Target target; // Ziel
  private Source source; // Personenquelle

  public Cell(int x, int y) {
    this.x = x;
    this.y = y;
    this.isOccupied = false;
    person = null;
    target = null;
    source = null;
  }

  /**
   * @return x -Koordinate
   */
  public int getX() {
    return x;
  }

  /**
   * @return y -Koordinate
   */
  public int getY() {
    return y;
  }

  /**
   * @return person
   */
  public Person getPerson() {
    return person;
  }

  /**
   * @return the status
   */
  public boolean isOccupied() {
    return isOccupied;
  }

  /**
   * @param status
   *          the status to set
   */
  public void setIsOccupied(boolean isOccupied) {
    this.isOccupied = isOccupied;
  }

  /**
   * @return the target
   */
  public Target getTarget() {
    return target;
  }

  /**
   * @param target
   *          the target to set
   */
  public void setTarget(Target target) {
    this.target = target;
  }

  /**
   * @return the source
   */
  public Source getSource() {
    return source;
  }

  /**
   * @param source
   *          the source to set
   */
  public void setSource(Source source) {
    this.source = source;
  }

}
