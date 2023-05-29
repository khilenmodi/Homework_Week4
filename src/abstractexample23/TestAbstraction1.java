package abstractexample23;
// in a real scenario method is called by programmer or user
public class TestAbstraction1 {

    public static void main(String[] args) {
        Shape s = new Circle1();// in real scenario, object is provided through method, e.g. getShape() method
        s.draw();
    }
}
