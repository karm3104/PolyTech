public class P01 {
  public static void main(String[] args){
    System.out.println("国語の得点入力");
    int kokugo = PConsole.inputIntNum(0, 100);
    System.out.println("英語の得点入力");
    int eigo = PConsole.inputIntNum(0, 100);
    System.out.println("数学の得点入力");
    int sugaku = PConsole.inputIntNum(0, 100);

    int sum = kokugo + eigo + sugaku;
    int ave = sum/3;
    System.out.println("平均点は"+ave+"点です。");
  }
}
