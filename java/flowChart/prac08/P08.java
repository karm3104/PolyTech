public class P08 {
    public static void main(String[] args){
        System.out.println("���R���P����͂��Ă�������");
        int a = PConsole.inputIntNum();
        System.out.println("���R���Q����͂��Ă�������");
        int b = PConsole.inputIntNum();

        int ans = a % b; 
        if(ans == 0){
            System.out.println(a+"��"+b+"�̔{���ł��B");
        }else{
            System.out.println(a+"��"+b+"�̔�{���ł��B");
        }
    }
}
