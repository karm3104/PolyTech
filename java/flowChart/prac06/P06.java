public class P06 {
    public static void main(String[] args){
        System.out.println("任意の秒数を変換します。入力してください。");
        int time = PConsole.inputIntNum();
        
        int hour = time / 3600;
        int min = (time % 3600) / 60; 
        int sec = time % 60;
        System.out.println(time+"秒は"+hour+"時間"+min+"分"+sec+"秒になります");
    }
}

//最初サイト見ずにやったやつ。大きい数字なら大丈夫だったが、小さい数字の分、秒数の変換とかおかしかった。
// public class P06 {
//     public static void main(String[] args){
//         System.out.println("任意の秒数を変換します。入力してください。");
//         int time = PConsole.inputIntNum();
        
//         int hour = time / 3600;
//         int min = time / 60; 
//         int sec = time /60 % 60;
//         System.out.println(time+"秒は"+hour+"時間"+min+"分"+sec+"秒になります");
//     }
// }
