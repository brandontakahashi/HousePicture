public class Picture
{
    private Square wall;
    private Square wall1;
    private Square wall2;
    private Square concrete;
    private Square window;
    private Triangle roof;
    private Triangle roof1;
    private Square roof2;
    private Circle sun;
    private Square garage;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        wall1 = new Square();
        wall2 = new Square();
        roof = new Triangle();
        roof1 = new Triangle();
        roof2 = new Square();
        concrete = new Square();
        garage = new Square();

        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.changeColor("red");
            wall.moveHorizontal(100);
            wall.moveVertical(130);
            wall.changeSize(120);

            wall1.changeColor("green");
            wall1.moveHorizontal(200);
            wall1.moveVertical(130);
            wall1.changeSize(120);

            roof2.changeColor("black");
            roof2.moveHorizontal(40);
            roof2.moveVertical(80);
            roof2.changeSize(210);
            roof2.makeVisible();

            wall2.changeColor("yellow");
            wall2.moveHorizontal(40);
            wall2.moveVertical(120);
            wall2.changeSize(220);
            wall2.makeVisible();

            garage.changeColor("white");
            garage.moveHorizontal(80);
            garage.moveVertical(160);
            garage.changeSize(145);
            garage.makeVisible();

            concrete.changeColor("black");
            concrete.moveHorizontal(40);
            concrete.moveVertical(260);
            concrete.changeSize(220);
            concrete.makeVisible();

            roof.changeColor("black");
            roof.moveHorizontal(40);
            roof.moveVertical(80);
            roof.changeSize(40,40);
            roof.makeVisible();

            roof1.changeColor("black");
            roof1.moveHorizontal(250);
            roof1.moveVertical(80);
            roof1.changeSize(40,40);
            roof1.makeVisible();

            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
