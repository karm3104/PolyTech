public class P02 {
    public static void main(String[] args){
        System.out.println("ŽžŠÔ‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        int time = PConsole.inputIntNum(1, 16);

        if(time < 10){
            System.out.println("‚¨‚Í‚æ‚¤");
            
        }else{
            System.out.println("ŽžŠÔ‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
            int time2 = PConsole.inputIntNum(4, 22);
            if(time2 < 19){
                System.out.println("‚±‚ñ‚É‚¿‚Í");
            }else{
                System.out.println("‚±‚ñ‚Î‚ñ‚Í");
            }
        }
    }
}
