package string;

public class DeleteCopies {
    public static void main(String[] args) {
        String str = "aaabbcdeefsjdkfffffffffffffffffhhhhhhhhhhhhhhiiiiiiiiiiiiiiiiiiiiiiiii";
        StringBuffer stringBuffer = new StringBuffer(str);
        for (int i = 0; i < stringBuffer.length() - 1; i++) {
            try {
                while (stringBuffer.charAt(i) == stringBuffer.charAt(i + 1)) {

                    stringBuffer.deleteCharAt(i + 1);
                }
            } catch (IndexOutOfBoundsException es) {
                break;
            }
        }
        System.out.println(stringBuffer);
    }
}
