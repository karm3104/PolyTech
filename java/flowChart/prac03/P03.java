public class P03{
    public static void main(String[] args){
        System.out.println("���R���P�̔{�������R���Q�̌��ŏ����ŕ\�����܂��B");
        System.out.println("���R��1����͂��Ă��������B");
        int num1 = PConsole.inputIntNum();
        System.out.println("���R��2����͂��Ă��������B");
        int num2 = PConsole.inputIntNum();

        for(int i=1; i <= num2;i++){
            System.out.println(num1*i);
        }


    }
}