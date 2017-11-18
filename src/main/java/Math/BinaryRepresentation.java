package Math;

public class BinaryRepresentation {
    public static void main(String[] args) {
        System.out.println(new BinaryRepresentation().findDigitsInBinary(0));
    }

    public String findDigitsInBinary(int a) {
       StringBuilder stringBuilder = new StringBuilder();

       if (a == 0) {
           return "0";
       }


       while (a >= 0) {
           int remainder = a%2;
           a = a/2;
           stringBuilder.append(remainder);
       }

       return stringBuilder.reverse().toString();
    }

}
