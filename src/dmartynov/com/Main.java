package dmartynov.com;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String str1 = "this apple is sweet";
        String str2 =  "this apple is sour";
        System.out.println(Arrays.toString(uniqueWords(str1, str2)));
    }

    private static String[] uniqueWords(String str1, String str2) {
        String twoStrings = str1 + " " + str2;
        String[] res = twoStrings.split(" ");
        String[] result = new String[res.length];
        int[] count = new int[res.length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                if (res[i].equals(res[j])) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            if (count[i] < 2) {
                result[i] = res[i];
            }
        }
        result = Arrays.stream(result)
                .filter(s -> (s != null && s.length() > 0))
                .toArray(String[]::new);
        return result;
    }


}
