public class StepFinished extends Event {

  public StepFinished(double eventTime) {
    this.eventTime = eventTime;
  }

  @Override
  void processEvent(FutureEventList futureEventList, Person person,
      double simTime, int CellSize,Field field) {
	  if(!person.getLocation().equals(field.getTargetCell())){
		  futureEventList.addEvent(new NextStep(eventTime));
	  }
	  else{
		  field.getTargetCell().setPerson(null);
		  
	  }
  }

}
