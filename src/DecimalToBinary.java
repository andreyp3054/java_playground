public class DecimalToBinary {
    public static void main(String[] args) {
        int sample = 5;
        long binary = 0;
        int remainder;
        int i = 1;


        while (sample != 0) {
            remainder = sample % 2;
            binary += remainder * i;
            sample = sample / 2;
            i *= 10;
        }
        System.out.println(binary); //101

    }
}