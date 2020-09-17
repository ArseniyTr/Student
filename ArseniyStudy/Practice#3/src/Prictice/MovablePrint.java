package Prictice;

public class MovablePrint implements Praktice{
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
    int x=0;
    int y=0;
    int xSpeed;
    int ySpeed;
    MovablePrint(){};
    MovablePrint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePrint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
