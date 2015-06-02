
public class Field {
	
	private int size;
//	private int gridsize;
	private Cell[][] cells;
	
	
	
	public Field(int size/*, int gridsize*/) {
		this.size = size;
//		this.gridsize = gridsize;
		this.cells = new Cell[size][size]; //erzeugt Feld mit size x size Zellen
		System.out.println(cells.length);
		initCells(); //Feld mit leeren Zellen initialisieren
	}
	
	
	private void initCells() {
		for(int row = 0; row < size; row++) {
			for(int col = 0; col < size; col++) {
				cells[row][col] = new Cell();
			}
		}
	}
	
	

}
