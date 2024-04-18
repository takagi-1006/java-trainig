public class Main {
    public static boolean isLeapYear(int year) {//うるう年メソッド
      return ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0);
    }
  
    public static boolean isPrimeNumber(int number) {//素数メソッド
      boolean rtn = true;
      for (int sosuu = 2; sosuu <= number; sosuu++) {
        if (number % sosuu == 0) {
          rtn = false;
          break;
        } else if (sosuu == number - 1) {
          rtn = true;
          break;
        }
      }
      return rtn;
    }
  
    public static void main(String[] args) {
      for (int i = 3; i < 101; i++) {
        System.out.print(i + ":");
        if (isPrimeNumber(i)) {//うるう年のメソッドが入っている
          System.out.println("素数である");
        }else{
          System.out.println("");
        }
      }
      for(int i=1004;i<=3000;i++){//素数のメソッドが入っている
        if (isLeapYear(i)) {
          System.out.println(i+"年");
        }
      }
    }
  }
  