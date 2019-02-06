
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square window2;
    private Triangle roof;
    private Circle sun;
    private Circle top1;
    private Circle top2;
    private Circle top3;
    private Square trunk;
    private Square door;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100,100);
        wall.changeColor("green");
        wall.makeVisible();

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(15);
        window.moveVertical(100);
        window.changeSize(20,20);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("white");
        window2.changeSize(20,20);
        window2.moveHorizontal(65);
        window2.moveVertical(100);
        window2.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.changeColor("black");
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-15);
        sun.changeSize(60);
        sun.makeVisible();
        
        trunk = new Square();
        trunk.changeColor("brown");
        trunk.moveHorizontal(175);
        trunk.moveVertical(100);
        trunk.changeSize(15,70);
        trunk.makeVisible();
        
        top1 = new Circle();
        top1.changeColor("green");
        top1.moveHorizontal(185);
        top1.moveVertical(70);
        top1.changeSize(40);
        top1.makeVisible();
        
        top2 = new Circle();
        top2.changeColor("green");
        top2.moveHorizontal(195);
        top2.moveVertical(65);
        top2.changeSize(45);
        top2.makeVisible();
        
        top3 = new Circle();
        top3.changeColor("green");
        top3.moveHorizontal(200);
        top3.moveVertical(70);
        top3.changeSize(40);
        top3.makeVisible();
        
        door = new Square();
        door.changeColor("red");
        door.moveHorizontal(35);
        door.moveVertical(140);
        door.changeSize(30,40);
        door.makeVisible();
        
      
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
