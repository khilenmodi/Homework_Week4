package homework_week4;

/**
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 * fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 * fields.
 */

public class Point {
        int x,y;
        public void  Point (){
            this.x =0;
            this.y=0;
        }
        public Point (int x, int y){
            this.x = x;
            this.y = y;

        }
        //Method named getX without any parameters, it needs to return the value of x field.
        public int getX(){
            return x;
        }
        //Method named setX with one parameter of type int, it needs to set the value of the x field.
        public void setX(int x){
            this.x =x;
        }
        //Method named getY without any parameters, it needs to return the value of y field.
        public int getY(){
            return y;

        }
        //Method named setY with one parameter of type int, it needs to set the value of the y field.
        public void setY(int y){
            this.y = y;
        }
        //Method named distance without any parameters, it needs to return the distance between this
        //Point and Point 0,0 as double.
        public double distance() {
            return Math.sqrt((this.x - 0) * (this.x - 0) + (this.y - 0) * (this.y - 0));
        }
        //Method named distance with two parameters x, y both of type int, it needs to return the distance
        //between this Point and Point x,y as double.
         public double distance(int x, int y){
             return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));

         }
         //Method named distance with parameter another of type Point, it needs to return the distance
         //between this Point and another Point as double.
         public double distance(Point a){
             return Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y));
        }

    public static void main(String[] args) {
        Point obj =new Point(6,5);
        Point obj1 = new Point(3,1);
        System.out.println("distance(0,0 =" +obj.distance());
        System.out.println("distance second ="+ obj.distance(obj1));
        System.out.println("Distance (2,2) ="+ obj.distance(2,2));
        Point point = new Point(0,0);
        System.out.println("distance ()" + point.distance());
    }
}
