public class P01b{
  public static void main(String[] args){
    System.out.println("�}�X�I�̐g������");
    int masuo = PConsole.inputIntNum();
    System.out.println("�J�c�I�̐g������");
    int katsuo = PConsole.inputIntNum();
    System.out.println("���J���̐g������");
    int wakame = PConsole.inputIntNum();

    int sum = masuo + katsuo + wakame;
    int ave = sum / 3;
    System.out.println("���ϐg����"+ave+"cm�ł��B");
  }
}