public class P02 {
    public static void main(String[] args){
        System.out.println("時間を入力してください");
        int time = PConsole.inputIntNum(1, 16);

        if(time < 10){
            System.out.println("おはよう");
            
        }else{
            System.out.println("時間を入力してください");
            int time2 = PConsole.inputIntNum(4, 22);
            if(time2 < 19){
                System.out.println("こんにちは");
            }else{
                System.out.println("こんばんは");
            }
        }
    }
}
