import java.util.PriorityQueue;

public class FutureEventList {

  private PriorityQueue<Event> priorityQueue;

  public FutureEventList() {
    priorityQueue = new PriorityQueue<>(100, new EventComparator());
  }

  public void addEvent(Event e) {
    this.priorityQueue.add(e);
  }

  public void removeFirst() {
    this.priorityQueue.poll();
  }

  public boolean isEmpty() {
    return priorityQueue.size() == 0;
  }

  public Event getFirst() {
    return priorityQueue.peek();
  }

  public String toString() {
    String out = "";
    for (Event e : priorityQueue) {
      out += " " + e.toString();
    }
    return out;
  }

}
