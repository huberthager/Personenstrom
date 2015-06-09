public class Source {
  private Cell location;

  public Source(Cell c) {
    this.location = c;

  }

  public Person createPerson1() {
    return new Person(location, 2.0);

  }

  public Person createPerson2() {
    return new Person(location, 0.5);

  }
}
