class Exp_5 implements Area{
    static int rectangle(int len, int bre){
        return len*bre;
    }
    static int triangle(int a, int b, int c){
        int s = a+b+c;
        return (int)Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public static void main(String args[]){
        Scanner in = neww Scanner(System.in);
        char choice = in.next();
    }
}