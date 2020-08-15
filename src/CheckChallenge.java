public class CheckChallenge {
    public static void main(String arg[]){
        printNumbers();
    }
    public static void printNumbers(){
        int maxValue = 154;
        int i = 1;
        while(i < maxValue){
            System.out.println(i+"-"+(i+1)+","+(i+4)+"-"+(i+5)+","+(i+8)+"-"+(i+9));
            i += 12;
        }
    }
}
