package exp_5.ques2;

class CalcCircle extends Input {
    int area() {
        int radius = radii();
        return (int) (3.14 * radius * radius);
    }

    void display() {
        System.out.println(area());
    }
}