package exp_5.ques2;

class CalcSphere extends CalcCircle{
    int volume() {
        int radius = radii();
        return (int) (4 / 3 * 3.14 * radius * radius * radius);
    }

    void display() {
        System.out.println(volume());
    }
}