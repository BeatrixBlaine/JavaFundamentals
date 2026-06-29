package Algorithm;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String name = "Hello World";
        System.out.println(lengthOfLastWord(name));

    }

    public static int lengthOfLastWord(String s) {
        String words[] = s.split(" ");
        String lastWord = words[words.length - 1 ];

        return lastWord.length();
    }
}
