public class PrintNumbers {
    public static void main(String[] args) {
        System.out.println(new PrintNumbers().printNumber(100));
    }

    public int printNumber(int i){
        if (i < 0)
           return 0;


        System.out.println(printNumber(i-1));

        return i;
    }
}
