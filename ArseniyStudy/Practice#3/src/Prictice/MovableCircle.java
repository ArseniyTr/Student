package Prictice;

public class MovableCircle extends MovablePrint implements  Praktice  {
    public void moveUp(){
        y+=1;
    }
    public void moveDown(){
        y-=1;
    }
    public void moveLeft()
    {
        x-=1;
    }
    public void moveRight(){
        x+=1;
    }
    int radius=0;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                '}';
    }

    public static void main (String[] src){
    MovablePrint A = new MovablePrint(1,2,1,1){};
    MovableCircle B = new MovableCircle(1,2,1,1,4);
    System.out.println(A.toString());
    System.out.println(B.toString());
    }
}
