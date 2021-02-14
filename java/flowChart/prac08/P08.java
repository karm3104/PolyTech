public class P08 {
    public static void main(String[] args){
        System.out.println("©‘R”‚P‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        int a = PConsole.inputIntNum();
        System.out.println("©‘R”‚Q‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        int b = PConsole.inputIntNum();

        int ans = a % b; 
        if(ans == 0){
            System.out.println(a+"‚Í"+b+"‚Ì”{”‚Å‚·B");
        }else{
            System.out.println(a+"‚Í"+b+"‚Ì”ñ”{”‚Å‚·B");
        }
    }
}
