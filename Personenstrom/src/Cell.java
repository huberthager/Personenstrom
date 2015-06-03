public class Cell {

	// private boolean status;
	private int x; // X-Koordiante der Zelle
	private int y; // Y-Koordinate der Zelle
	private Person person; // Person in Zelle

	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
		// this.status = false;
		person = null;
	}

	// Getter X-Koor
	public int getX() {
		return x;
	}

	// Getter Y-Koor
	public int getY() {
		return y;
	}

	// Getter Person in Zelle
	public Person getPerson() {
		return person;
	}
}
