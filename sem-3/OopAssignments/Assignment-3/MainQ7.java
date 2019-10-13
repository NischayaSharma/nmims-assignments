import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;

class Line {
    int l1, l2, l3, l4;

    Line(int l1, int l2, int l3, int l4) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
    }
}

 class Point {
    int x1, x2, x3, x4, y1, y2, y3, y4;

    Point(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }

}

 class Polygon extends Line {

    Polygon(int l1, int l2, int l3, int l4) {
        super(l1, l2, l3, l4);
        // TODO Auto-generated constructor stub
    }

    boolean isRectangle() {
        if (l1 == l2 && l3 == l4) {
            return true;
        } else if (l1 == l3 && l2 == l4) {
            return true;
        } else if (l1 == l4 && l2 == l3) {
            return true;
        } else {
            return false;
        }
    }

    boolean isSquare() {
        if (l1 == l2 && l2 == l3 && l3 == l4) {
            return true;
        } else {
            return false;
        }
    }
}

 class Vector2D extends Point {
    Vector2D(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
        // TODO Auto-generated constructor stub
    }

    int abi, abj, bci, bcj, cdi, cdj, dai, daj, bai, baj, cbi, cbj, dci, dcj, adi, adj, a, b, c, d;

    void Dirvec() {
        abi = x1 - x2;
        abj = y1 - y2;
        bai = x2 - x1;
        baj = y2 - y1;
        bci = x2 - x3;
        bcj = y2 - y3;
        cbi = x3 - x2;
        cbj = y3 - y2;
        cdi = x3 - x4;
        cdj = y3 - y4;
        dci = x4 - x3;
        dcj = y4 - y3;
        dai = x4 - x1;
        daj = y4 - y1;
        adi = x1 - x4;
        adj = y1 - y4;
    }

    boolean dotpro() {
        a = abi * adi + abj * adj;
        b = bai * bci + baj * bcj;
        c = cbi * cdi + cbj * cdj;
        d = dai * dci + daj * dcj;
        if (a == 0 && b == 0 && c == 0 && d == 0)
            return true;
        else
            return false;
    }
}

public class MainQ7 {

    @Test
    public final void testRectangle() {
        Line l = new Line(1, 2, 1, 2);
        Point p = new Point(0, 3, 3, 0, 2, 2, 0, 0);
        Vector2D v = new Vector2D(0, 3, 3, 0, 2, 2, 0, 0);
        Polygon p1 = new Polygon(1, 2, 1, 2);
        Assert.assertEquals(true, p1.isRectangle());
        Assert.assertEquals(true, v.dotpro());

    }

    @Test
    public final void testSquare() {
        Line l = new Line(1, 1, 1, 1);
        Point p = new Point(0, 2, 2, 0, 2, 2, 0, 0);
        Vector2D v = new Vector2D(0, 3, 3, 0, 2, 2, 0, 0);
        Polygon p1 = new Polygon(1, 1, 1, 1);
        Assert.assertEquals(true, p1.isSquare());
        Assert.assertEquals(true, v.dotpro());

    }

    public static void main(String[] args) {
        MainQ7 obj = new MainQ7();
        obj.testRectangle();
        obj.testSquare();
    }

}