public class P01 {
  public static void main(String[] args){
    System.out.println("����̓��_����");
    int kokugo = PConsole.inputIntNum(0, 100);
    System.out.println("�p��̓��_����");
    int eigo = PConsole.inputIntNum(0, 100);
    System.out.println("���w�̓��_����");
    int sugaku = PConsole.inputIntNum(0, 100);

    int sum = kokugo + eigo + sugaku;
    int ave = sum/3;
    System.out.println("���ϓ_��"+ave+"�_�ł��B");
  }
}
