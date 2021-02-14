public class P01b{
  public static void main(String[] args){
    System.out.println("マスオの身長入力");
    int masuo = PConsole.inputIntNum();
    System.out.println("カツオの身長入力");
    int katsuo = PConsole.inputIntNum();
    System.out.println("ワカメの身長入力");
    int wakame = PConsole.inputIntNum();

    int sum = masuo + katsuo + wakame;
    int ave = sum / 3;
    System.out.println("平均身長は"+ave+"cmです。");
  }
}