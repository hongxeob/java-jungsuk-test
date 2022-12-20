package EX6;

public class Ex6_22 {
    public static boolean isNumber(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
        }


    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자 입니까?" + isNumber(str));
        str = "12d33";
        System.out.println(str + "는 숫자 입니까?" + isNumber(str));
    }
}
