public class P06 {
    public static void main(String[] args){
        System.out.println("�C�ӂ̕b����ϊ����܂��B���͂��Ă��������B");
        int time = PConsole.inputIntNum();
        
        int hour = time / 3600;
        int min = (time % 3600) / 60; 
        int sec = time % 60;
        System.out.println(time+"�b��"+hour+"����"+min+"��"+sec+"�b�ɂȂ�܂�");
    }
}

//�ŏ��T�C�g�����ɂ������B�傫�������Ȃ���v���������A�����������̕��A�b���̕ϊ��Ƃ��������������B
// public class P06 {
//     public static void main(String[] args){
//         System.out.println("�C�ӂ̕b����ϊ����܂��B���͂��Ă��������B");
//         int time = PConsole.inputIntNum();
        
//         int hour = time / 3600;
//         int min = time / 60; 
//         int sec = time /60 % 60;
//         System.out.println(time+"�b��"+hour+"����"+min+"��"+sec+"�b�ɂȂ�܂�");
//     }
// }
