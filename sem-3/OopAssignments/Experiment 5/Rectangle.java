package exp_5.ques1;

class Rectangle implements Shape {
    private int len, bre;

    Rectangle(int a, int b) {
        this.len = a;
        this.bre = b;
    }

    public int area() {
        return this.len * this.bre;
    }

    public int perimeter() {
        return (2 * this.len) + (2 * this.bre);
    }

    int getLength() {
        return this.len;
    }

    void setLength(int length) {
        this.len = length;
    }

    int getBreadth() {
        return this.bre;
    }

    void setBreadth(int breadth) {
        this.bre = breadth;
    }

    boolean equals(Rectangle rect) {
        return (this.len == rect.len && this.bre == rect.bre);
    }

    public String toString() {
        String str = "Length->" + this.len + "  Breadth->" + this.bre;
        return str;
    }
}