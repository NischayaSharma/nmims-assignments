object MainQ1 {
    def main(args: Array[String])
    {
        var strIn: String = readLine();
        var strOut: String = "";
        for (i <- 0 until strIn.length()){
            strOut += strIn.substring(strIn.length()-(i+1),strIn.length()-i);
        }
        println(strOut);
    }
}
