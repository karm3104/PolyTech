public class P09 {
    public static void main(String[] args){
        System.out.println("�����P����͂��Ă��������B");
        int a = PConsole.inputIntNum();
        System.out.println("�����Q����͂��Ă��������B");
        int b = PConsole.inputIntNum();

        if(a*a <= b*b){
            System.out.println(a+"��"+b+"�ł�"+b+"�̕����傫���ł��B");
        }else{
            System.out.println(a+"��"+b+"�ł�"+a+"�̕����傫���ł��B");
        }
    }
}
