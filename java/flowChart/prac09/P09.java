public class P09 {
    public static void main(String[] args){
        System.out.println("整数１を入力してください。");
        int a = PConsole.inputIntNum();
        System.out.println("整数２を入力してください。");
        int b = PConsole.inputIntNum();

        if(a*a <= b*b){
            System.out.println(a+"と"+b+"では"+b+"の方が大きいです。");
        }else{
            System.out.println(a+"と"+b+"では"+a+"の方が大きいです。");
        }
    }
}
