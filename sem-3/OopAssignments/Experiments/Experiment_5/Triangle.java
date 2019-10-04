package exp_5.ques1;

class Triangle implements Shape {
    private int side1, side2, side3;

    Triangle(int a, int b, int c) {
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
    }

    public int area() {
        int s = side1 + side2 + side3;
        return (int) (Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
    }

    public int perimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    int getSide1() {
        return this.side1;
    }

    void setSide1(int length) {
        this.side1 = length;
    }

    int getSide3() {
        return this.side3;
    }

    void setSide3(int length) {
        this.side3 = length;
    }

    int getSide2() {
        return this.side2;
    }

    void setSide2(int breadth) {
        this.side2 = breadth;
    }

    boolean equals(Triangle tri) {
        return (this.side1 == tri.side1 && this.side2 == tri.side2 && this.side3 == tri.side3);
    }

    public String toString() {
        String str = "side1->" + this.side1 + " side2->" + this.side2 + " side3->" + this.side3;
        return str;
    }
}