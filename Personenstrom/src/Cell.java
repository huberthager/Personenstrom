import java.util.HashSet;
import java.util.Set;

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
  
  public Set<Cell> getNeighbours(Field field){
	  int x =this.getX();
	  int y= this.getY();
	  int length=field.getLength();
	  
	  Set<Cell> neighbours=new HashSet<>();
	  //Ecken
	 if(x==0 && y==0){
		 neighbours.add(field.getCell(x, y+1));
		  neighbours.add(field.getCell(x+1, y+1));
		  neighbours.add(field.getCell(x+1, y));
		 }
	 if(x==length && y==0){
		 neighbours.add(field.getCell(x-1, y));
		 neighbours.add(field.getCell(x-1, y+1));
		 neighbours.add(field.getCell(x, y+1));
		 
	 }
	 if(x==length && y==length){
		  neighbours.add(field.getCell(x, y-1));
		  neighbours.add(field.getCell(x-1, y-1));
		  neighbours.add(field.getCell(x-1, y));
		 
	 }
	 if(x==0 && y==length){
		 neighbours.add(field.getCell(x, y-1));
		 neighbours.add(field.getCell(x+1, y));
		  neighbours.add(field.getCell(x+1, y-1));
		 
	 }
	 
	 //Ränder
	 if(y==0){
		 neighbours.add(field.getCell(x, y+1));
		  neighbours.add(field.getCell(x+1, y+1));
		  neighbours.add(field.getCell(x+1, y));
		  neighbours.add(field.getCell(x-1, y));
		  neighbours.add(field.getCell(x-1, y+1));
	 }
	 
	 if(x==length){
		 neighbours.add(field.getCell(x, y+1));
		 neighbours.add(field.getCell(x, y-1));
		  neighbours.add(field.getCell(x-1, y-1));
		  neighbours.add(field.getCell(x-1, y));
		  neighbours.add(field.getCell(x-1, y+1));
		 
	 }
	 if(y==length){
		  neighbours.add(field.getCell(x+1, y));
		  neighbours.add(field.getCell(x+1, y-1));
		  neighbours.add(field.getCell(x, y-1));
		  neighbours.add(field.getCell(x-1, y-1));
		  neighbours.add(field.getCell(x-1, y));
		 
	 }
	 if(x==0){
		 neighbours.add(field.getCell(x, y+1));
		  neighbours.add(field.getCell(x+1, y+1));
		  neighbours.add(field.getCell(x+1, y));
		  neighbours.add(field.getCell(x+1, y-1));
		  neighbours.add(field.getCell(x, y-1));
		 
	 }
//	  result.add(field.getCell(x, y+1));
//	  result.add(field.getCell(x+1, y+1));
//	  result.add(field.getCell(x+1, y));
//	  result.add(field.getCell(x+1, y-1));
//	  result.add(field.getCell(x, y-1));
//	  result.add(field.getCell(x-1, y-1));
//	  result.add(field.getCell(x-1, y));
//	  result.add(field.getCell(x-1, y+1));
	 return neighbours;
  }
  
  public boolean isEqual(Cell other){
	  if(this.getX()==other.getX() &&  this.getY()==other.getY()){
		  return true;
	  }
	  return false;
  }
  
}
