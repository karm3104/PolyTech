public class P02 {
    public static void main(String[] args){
        System.out.println("���Ԃ���͂��Ă�������");
        int time = PConsole.inputIntNum(1, 16);

        if(time < 10){
            System.out.println("���͂悤");
            
        }else{
            System.out.println("���Ԃ���͂��Ă�������");
            int time2 = PConsole.inputIntNum(4, 22);
            if(time2 < 19){
                System.out.println("����ɂ���");
            }else{
                System.out.println("����΂��");
            }
        }
    }
}
