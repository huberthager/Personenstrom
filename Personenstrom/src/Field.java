import java.util.ArrayList;
import java.util.List;

public class Field {

  private int length; // Seitenlaenge
  private List<Cell> cells; // Zellen in das Feld eingeteilt ist
  private Cell targetCell;
  private Cell sourceCell;

  /**
   * Initialisiert Feld.
   * 
   * @param size
   * @param xSource
   * @param ySource
   * @param xTarget
   * @param yTarget
   */
  public Field(int size, int xSource, int ySource, int xTarget, int yTarget/*
                                                                            * ,
                                                                            * int
                                                                            * gridsize
                                                                            */) {
    this.length = size;
    // this.gridsize = gridsize;
    this.cells = new ArrayList<>();
    initCells(); // Feld mit leeren Zellen initialisieren
    sourceCell = this.getCell(xSource, ySource);
    targetCell = this.getCell(xTarget, yTarget);
    sourceCell.setSource(new Source(sourceCell));
    sourceCell.setIsOccupied(true);
    targetCell.setTarget(new Target(targetCell));
    targetCell.setIsOccupied(true);
  }

  public int getLength() {
	return length;
}

/**
   * Getter fuer Feld auf dem bestimmte Person steht
   * 
   * @param p
   *          the person to get
   * 
   * @return Cell
   */
  public Cell getCell(Person p) {
    for (Cell c : cells) {
      if (c.getPerson() == p) {
        return c;
      }
    }
    return null;
  }

  /**
   * Getter fuer Zelle mit Koordinate x,y
   * 
   * @param x
   *          , y
   * @return Cell
   */
  public Cell getCell(int x, int y) {
    for (Cell c : cells) {
      if (c.getX() == x && c.getY() == y) {
        return c;
      }
    }
    return null;
  }
  


  public Cell getTargetCell() {
	return targetCell;
}

public Cell getSourceCell() {
	return sourceCell;
}

/**
   * Initialisiert Zellen auf quadratisches Feld.
   * 
   * 
   */
  private void initCells() {
    for (int i = 0; i < length * length; i++) {
      cells.add(new Cell(i / length, i % length)); // Zeilen ueber Spalten
    }
  }

}
