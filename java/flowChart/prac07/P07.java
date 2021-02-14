public class P07 {
    public static void main(String[] args){
        System.out.println("偶数、奇数を判断します。自然数を入力してください");
        int n = PConsole.inputIntNum();

        int ans = n % 2;
        if(ans == 0){
            System.out.println("入力した値は偶数です。");
        }else{
            System.out.println("入力した値は奇数です。");
        }
    }
}
