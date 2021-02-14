public class P03{
    public static void main(String[] args){
        System.out.println("自然数１の倍数を自然数２の個数で昇順で表示します。");
        System.out.println("自然数1を入力してください。");
        int num1 = PConsole.inputIntNum();
        System.out.println("自然数2を入力してください。");
        int num2 = PConsole.inputIntNum();

        for(int i=1; i <= num2;i++){
            System.out.println(num1*i);
        }


    }
}