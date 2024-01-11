public class Picture
{
    private Square wall;
    private Square wall1;
    private Square wall2;
    private Square concrete;
    private Triangle roof;
    private Triangle roof1;
    private Square roof2;
    private Triangle roof3;
    private Square roof4;
    private Circle sun;
    private Square garage;
    private Square garage2;
    private Square grass;
    private Square door;
    private Square door1;
    private Circle doorknob;

    private Square window;
    private Square window1;
    private Square window2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sun = new Circle();
        wall = new Square();
        wall1 = new Square();
        wall2 = new Square();
        roof = new Triangle();
        roof1 = new Triangle();
        roof2 = new Square();
        roof3 = new Triangle();
        roof4 = new Square();
        concrete = new Square();
        garage = new Square();
        garage2 = new Square();
        grass = new Square();
        door = new Square();
        door1 = new Square();
        doorknob = new Circle();
        window = new Square();
        window1 = new Square();
        window2 = new Square();

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

            sun.changeColor("yellow");
            sun.moveHorizontal(400);
            sun.moveVertical(20);
            sun.changeSize(55);
            sun.makeVisible();

            roof4.changeColor("black");
            roof4.moveHorizontal(260);
            roof4.moveVertical(100);
            roof4.changeSize(200);
            roof4.makeVisible();

            wall.changeColor("tan2");
            wall.moveHorizontal(150);
            wall.moveVertical(130);
            wall.changeSize(170);
            wall.makeVisible();

            wall1.changeColor("tan");
            wall1.moveHorizontal(265);
            wall1.moveVertical(130);
            wall1.changeSize(200);
            wall1.makeVisible();

            roof2.changeColor("black");
            roof2.moveHorizontal(40);
            roof2.moveVertical(80);
            roof2.changeSize(210);
            roof2.makeVisible();

            wall2.changeColor("tan");
            wall2.moveHorizontal(40);
            wall2.moveVertical(120);
            wall2.changeSize(220);
            wall2.makeVisible();

            garage2.changeColor("black");
            garage2.moveHorizontal(75);
            garage2.moveVertical(155);
            garage2.changeSize(155);
            garage2.makeVisible();

            garage.changeColor("white");
            garage.moveHorizontal(80);
            garage.moveVertical(160);
            garage.changeSize(145);
            garage.makeVisible();

            concrete.changeColor("grey");
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

            grass.changeColor("green");
            grass.moveHorizontal(260);
            grass.moveVertical(245);
            grass.changeSize(205);
            grass.makeVisible();

            roof3.changeColor("black");
            roof3.moveHorizontal(460);
            roof3.moveVertical(100);
            roof3.changeSize(30,30);
            roof3.makeVisible();

            door.changeColor("brown");
            door.moveHorizontal(345);
            door.moveVertical(205);
            door.changeSize(40);
            door.makeVisible();

            door1.changeColor("brown");
            door1.moveHorizontal(345);
            door1.moveVertical(190);
            door1.changeSize(40);
            door1.makeVisible();

            doorknob.changeColor("black");
            doorknob.moveHorizontal(370);
            doorknob.moveVertical(210);
            doorknob.changeSize(10);
            doorknob.makeVisible();

            window.changeColor("white");
            window.moveHorizontal(290);
            window.moveVertical(170);
            window.changeSize(30);
            window.makeVisible();

            window1.changeColor("white");
            window1.moveHorizontal(290);
            window1.moveVertical(180);
            window1.changeSize(30);
            window1.makeVisible();

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
