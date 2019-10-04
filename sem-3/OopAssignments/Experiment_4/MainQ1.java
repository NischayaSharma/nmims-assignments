package exp4.Q1;
class Definition {
    void Initialize() {
        double length = 25;
        double breadth = 20;
        double height = 10;
        System.out.println("Length = " +length);
        System.out.println("Breadth = " +breadth);
        System.out.println("Height = " +height);
    }
}
class Bookshelf extends Definition {
    void Shelves() {
        Definition obj = new Definition();
        obj.Initialize();
        double shelves = 5;
        System.out.println("No. of Shelves = " +shelves);
    }
}
public class MainQ1 {
    public static void main(String args[]) {
        Bookshelf ob = new Bookshelf();
        ob.Shelves();
    }
}