package pa03;


/**
 * SmallCircles are transparent yellow circles which move at a constant velocity
 * on the board and their radius shrink when bounce off the edges
*/

public class SmallCircles extends CircleShape{

  private int transparent=150;
	/**
	 * create a small circle and set the color to transparent yellow
	 */
  public SmallCircles(){
    super();
		this.color = new java.awt.Color(255,255,0,transparent); // transparent yellow
  }

   /**
   * keep the circle on board as usual, but also change the radius and color transparency.
   * If it bounces the wall, then its radius shrinks to 0.8 of its previous radius, and the
   * transparency of yellow change. 
   */
  public void keepOnBoard(){

    if (this.x < this.radius) {
      super.keepOnBoard();
      this.radius=this.radius*0.8;
      this.color = new java.awt.Color(255,255,0,transparent+100);

    }else if (this.x > CircleShape.boardWidth-this.radius) {
      super.keepOnBoard();
      this.radius=this.radius*0.8;
      this.color = new java.awt.Color(255,255,0,transparent+100);
    }

    if (this.y < this.radius){
      super.keepOnBoard();
      this.radius=this.radius*0.8;
      this.color = new java.awt.Color(255,255,0,transparent-100);

    } else if (this.y > CircleShape.boardHeight-this.radius) {
      super.keepOnBoard();
      this.radius=this.radius*0.8;
      this.color = new java.awt.Color(255,255,0,transparent-100);
    }
  }




}
