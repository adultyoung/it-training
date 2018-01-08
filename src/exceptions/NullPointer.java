package exceptions;

public class NullPointer {
    static Number nullNumb = null;

  static int getException (Number nullNumb) {
      int nullException = (int) nullNumb;
      return nullException;
  }
    public static void main(String[] args) {
        try {
            getException(nullNumb);
        } catch (NullPointerException es) {
            System.out.println("Ошибка NullPointerException споймана");
        }
    }

}
