public class P23 {
    public static void main(String[] args){
        System.out.println("�悤�����肢�̊ق�");
        System.out.println("���Ȃ��̖��O����͂��Ă�������");
        String name = PConsole.inputString();
        System.out.println("���Ȃ��̔N�����͂��Ă�������");
        String ageString = PConsole.inputString();
        int age = Integer.parseInt(ageString);
        int fortune = PConsole.getRandomInt(0, 3);

        fortune++;
        System.out.println("�肢�̌��ʂ��o�܂���!");
        System.out.println(age+"�΂�"+name+"����A���Ȃ��̉^�C�ԍ���"+fortune+"�ł��B");
        System.out.println("1:��g 2:���g 3:�g 4:��");
    }
}