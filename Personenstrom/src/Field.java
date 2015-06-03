import java.util.ArrayList;
import java.util.List;

public class Field {

	private int length; // Seitenlänge
	private List<Cell> cells; // Zellen in das Feld eingeteilt ist

	// Stellt Bereich dar, in dem ein Personenstrom fließt.
	public Field(int size/* , int gridsize */) {
		this.length = size;
		// this.gridsize = gridsize;
		this.cells = new ArrayList<>(); // erzeugt Feld mit size x size Zellen
		System.out.println(cells);
		initCells(); // Feld mit leeren Zellen initialisieren
	}

	// Getter für Feld auf dem bestimmte Person steht
	public Cell getCell(Person p) {
		for (Cell c : cells) {
			if (c.getPerson() == p) {
				return c;
			}
		}
		return null;
	}

	// Setzt Zellen auf quadratisches Feld.
	private void initCells() {
		for (int i = 0; i < length * length; i++) {
			cells.add(new Cell(i / length, i % length)); // Zeilen über Spalten
		}
	}

}
