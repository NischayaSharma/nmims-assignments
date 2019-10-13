class MainQ6{
    public static int fib(int num){
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        return fib(num-1)+fib(num-2);
    }
    public static void testFib() throws AssertionError{
        if(!(fib(0)==0 && fib(1)==1 && fib(2)==1 && fib(3)==2 && fib(4)==3 && fib(5)==5 && fib(6)==8 && fib(7)==13)){
            throw new AssertionError();
        }
    }
    public static void main(String[] args) {
        System.out.println(testFib());
    }
}
class AssertionError extends Exception{
    public AssertionError(String str) {
        System.out.println(str);
    }
}