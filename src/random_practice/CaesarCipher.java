package random_practice;

public class CaesarCipher {
    public static void main(String[] args) {
        String word = "THE";        // output should be HVS
        int key = 14;
        System.out.println(decrypt(word, key));
    }

    public static String encrypt(String word, int key){
        char[] array = word.toCharArray();
        StringBuilder builder = new StringBuilder("");
        for(char a: array){
            if(Character.isLetter(a)){
                char shifted = (char) ('A' + (a - 'A' + key) % 26);
                builder.append(shifted);
            }
        }
            return builder.toString();
    }

    public static String decrypt(String word, int key){
        return encrypt(word, 26 - key);
    }

}
