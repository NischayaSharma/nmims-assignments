package exp_6;

class PrintDetails {
    public void printHeader(char c){
        for(int i=0 ; i<70 ; i++)
            System.out.println(c);
    }

    public void printHeader(char c, int num){
        for(int i=0 ; i<num ; i++)
            System.out.println(c);
    }

    public void printHeader(String str){
            System.out.println(str);
    }
}