import java.util.Random;

public class Person {

	private double freeFlowVelocity; // Wunschgeschwindigkeit
	private Cell location; // Zelle auf dem Feld in der Person steht

	public Person(Cell loc) {
		this.location = loc;
		this.freeFlowVelocity = initFreeFlowVelocity();
	}

	// Normalverteilte Wunschgeschwindigkeit einer Person
	private double initFreeFlowVelocity() {
		return new Random().nextGaussian(); // normalverteilte pseudo
											// Zufallszahl
	}
}
