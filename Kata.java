// create a fuction that will take an integer and reverse the order

// ex
// Input: 21445 Output: 54412

// Input: 145263 Output: 362541

// Input: 1254859723 Output: 3279584521
class Kata {

  public static class ReverseOrderList {
    public static int ReversedOrder(int num) {
      // Bust a move right here
      char[] charNum = Integer.toString(num).toCharArray();
      char[] array1 = charNum;
      int len = charNum.length - 1;

      for (int i = len, j = 0; i > 0; i--, j++) {
        System.out.print(Integer.toString(i));
        System.out.print(", ");
        System.out.println(Integer.toString(j));

        array1[j] = charNum[i];
      }

      return Integer.parseInt(new String(array1));
    }
  }

  public static void main(String args[]) {
    System.out.println("Hello, World");

    ReverseOrderList myList = new ReverseOrderList();

    int number = myList.ReversedOrder(21445);
    System.out.println(number);

  }
}
