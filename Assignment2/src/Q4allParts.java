public class Q4allParts {
    public static void main(String[] args) {

    }
    //a
    public static String concat(String s1,String s2){
        char[] result = new char[s1.length() + s2.length()];
        int k = 0;

        for (int i = 0; i < s1.length(); i++) {
            result[k++] = s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            result[k++] = s2.charAt(i);
        }

        String concatenated = new String(result);
        return concatenated;
    }

    //b

    public static char[] Reverse(char[] arr){
        //char[] arr = s.toCharArray();

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }

    //c
    public static String Vowels(char[] arr) {
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
                    c=='A'||c=='E'||c=='I'||c=='O'||c=='U')) {
                result += c;
            }
        }
    return result;
    }

    //d
    public static String[] sort(String[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (compare(arr[j], arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    static int compare(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }

    //e

    public static char[] UpperToLower(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + 32); // Convert to lowercase
            }
        }
        return arr;
    }
}
