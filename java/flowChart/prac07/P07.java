public class P07 {
    public static void main(String[] args){
        System.out.println("�����A��𔻒f���܂��B���R������͂��Ă�������");
        int n = PConsole.inputIntNum();

        int ans = n % 2;
        if(ans == 0){
            System.out.println("���͂����l�͋����ł��B");
        }else{
            System.out.println("���͂����l�͊�ł��B");
        }
    }
}
