package day4;

public class SplitString {
    public static void main(String[] args) {
        String str = "This is my String";

        String info = "";
        String[] arr = new String[str.length()];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.charAt(i) == ' ') {
                arr[count] = info;
                info = "";
                count++;
            } else {
                info += String.valueOf(ch);
            }
        }
        arr[count++] = info;
        for(int i=0;i<count;i++) {
            System.out.println(arr[i]);
        }
    }
}
