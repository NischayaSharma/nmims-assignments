object MainQ4{
    val pi = 3.14;
    def main(args: Array[String]){
        print ("Enter:\n1. Angle Converter\n2. Temperature Converter\n");
        var choice = readInt();
        if (choice == 1) {
            print ("Enter:\n1. Radians to Degree\n2. Degree to Radians\n");
            choice = readInt();
            if (choice == 1) {
                print ("Enter the degree:\n");
                var deg = readDouble();
                print (""+((deg)*(pi/180)));
            }
            else if (choice == 2) {
                print ("Enter the radian:\n");
                var rad = readDouble();
                print (""+((rad)*(180/pi)));
            }
        }
    }
}