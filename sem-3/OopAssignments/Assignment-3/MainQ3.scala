object MainQ3{
    def min(arr: Array[Int]): Int = {
        var minimum: Int = 20;
        for (i <- arr ; if i<minimum){
            minimum = i;
        }
        return minimum;
    }
    def main(args: Array[String]){
        var arr = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 15, 16, -2);
        print (min(arr));
    }
}