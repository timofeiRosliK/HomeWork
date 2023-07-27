package strings;

import java.util.Arrays;

public class StrMain {
    public static void main(String[] args) {
        String str = "Monkey";
        String str1 = "God";
        String updated = replace(str);
        System.out.println("updated = " + updated);
        String result = concat(str, str1);
        System.out.println("result = " + result);
        String task30 = "I follow the discipline";
        String finalTask30 = substituteSpace(task30);
        System.out.println("The replacement has been done = " + finalTask30);
        String task31 = reverseString(str1);
        System.out.println("The reverse is completed = " + task31);
        findLongerSubstring(str, task30);
        String[] strings = {"Work", "Hard", "Play", "Hard"};
        String task33 = appendArray(strings);
        System.out.println("task33 = " + task33);
        String badWord = "Bitch";
        String task34 = replaceVowel(badWord);
        System.out.println("Decoding is  = " + task34);
        String task35 = "Fl1ow2r";
        String noNumber = deleteAllNumbers(task35);
        System.out.println("noNumber = " + noNumber);


    }

    public static String replace(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        char[] letters = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'y', 'Y', 'u', 'U' };
        char[] allLetters = stringBuffer.toString().toCharArray();
        for (int i = 0; i < allLetters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (allLetters[i] == letters[j]) {
                    allLetters[i] = '*';
                }
            }

        }
        String result = String.valueOf(allLetters);
        return result.replace("*", "");
    }

    public static String concat(String str1, String str2) {
        StringBuffer buffer1 = new StringBuffer(str1);
        StringBuffer buffer2 = new StringBuffer(str2);

        char[] chars1 = buffer1.toString().toCharArray();
        char[] chars2 = buffer2.toString().toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            for (int j = 0; j < chars2.length; j++) {
                if (chars1[i] == chars2[j]) {
                    chars2[j] = '@';
                }

            }

        }
        String updStr2 = String.valueOf(chars2);
        String result = updStr2.replace("@", "");
        StringBuffer buffer = buffer1.append(result);
        return buffer.toString();
    }

    public static String substituteSpace(String str) {
        StringBuffer buff = new StringBuffer(str);
        return buff.toString().replace(" ", ",");
    }

    public static String reverseString(String str) {
        StringBuffer buff = new StringBuffer(str);
        return buff.reverse().toString();
    }

    public static void findLongerSubstring(String str1, String str2) {
        StringBuffer buffer1 = new StringBuffer(str1);
        StringBuffer buffer2 = new StringBuffer(str2);
        if (buffer1.length() > buffer2.length()) {
            String sub1 = buffer1.substring(0);
            System.out.println("sub1 = " + sub1);
        } else {
            String sub2 = buffer2.substring(0);
            System.out.println("sub2 = " + sub2);
        }
    }

    public static String appendArray(String[] strings) {
        StringBuilder builder = new StringBuilder(Arrays.toString(strings));
        return builder.toString().replaceAll(",", "|");
    }

    public static String replaceVowel(String str) {
        StringBuilder builder = new StringBuilder(str);
        char[] ch = builder.toString().toCharArray();
        char[] vowels = {'a', 'A', 'o', 'O', 'u', 'U', 'e', 'E', 'i', 'I' };
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (ch[i] == vowels[j]) {
                    ch[i] = '#';
                }

            }

        }
        return String.valueOf(ch);
    }

    public static String deleteAllNumbers(String str) {
        StringBuilder builder = new StringBuilder(str);
        char[] build = builder.toString().toCharArray();
        char[] numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9' };
        for (int i = 0; i < build.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (build[i] == numbers[j]){
                    build[i] = ';';
                }
            }

        }
        return builder.toString();
    }
}