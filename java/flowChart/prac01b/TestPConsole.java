
package flowChart.prac02;
import java.io.*;
import java.util.Random;
/*
 * �R���\�[�����o�͗p�N���X �̃e�X�g�p�N���X
 *
 * copyright:Nakamura,Atsushi
 *
 * ver.1.00 2018-07-13.0833
 * ver.1.01 2020-01-19.1616
 */
class TestPConsole {
	public static void main(String[] args) {
		try {		
			// �g�p��F��������
			int num = PConsole.inputIntNum();
			System.out.println(num);

			// �g�p��F�������́B�͈͕t��
			num = PConsole.inputIntNum(0,18);
			System.out.println(num);

			// �g�p��F���������
			String str = PConsole.inputString();
			System.out.println(str);

			// �g�p��F�����_���Ȓl�̔z����擾
			int[] array;
			int cnt = 0;
			int maxSetting = 0;
			int minSetting = 0;

			// �g�p��F��������
			System.out.println("�����_���Ȑ����z����쐬���܂��B�ő�l����͂��Ă�������");
			maxSetting = PConsole.inputIntNum();
			System.out.println(maxSetting);
			System.out.println("�ŏ��l����͂��Ă�������");
			minSetting = PConsole.inputIntNum();
			System.out.println(minSetting);
			System.out.println("�v�f������͂��Ă�������");
			cnt = PConsole.inputIntNum();
			System.out.println(cnt);

			array = PConsole.createRandomIntArray(minSetting,  maxSetting,  cnt,  true);
			//                           �ŏ��l,�ő�l,�v�f��,�\��/��\��

			// �v�f���A�ő�l�A�ŏ��l���w����Ɏ��܂��Ă��邩�ǂ����ǂ��肩�ǂ����m�F
			int max = array[0];
			int min = array[0];
			for (int i = 0 ; i < array.length ; i++) {
				if (max < array[i]) max = array[i];
				if (min > array[i]) min = array[i]; 
			}
			System.out.print("\n\n");

			System.out.println("length = " + array.length);
			System.out.println("max = " + max + ":" + maxSetting);
			System.out.println("min = " + min + ":" + minSetting);

			System.out.println("�����_���Ȑ������쐬���܂��B�ő�l����͂��Ă�������");
			maxSetting = PConsole.inputIntNum();
			System.out.println(maxSetting);
			System.out.println("�ŏ��l����͂��Ă�������");
			minSetting = PConsole.inputIntNum();
			System.out.println(minSetting);
			int random = PConsole.getRandomInt(minSetting,maxSetting);
			System.out.println(random);

			// ���{�ꏑ���w��o��
			System.out.println("\n---------------------------------------------");
			System.out.println("���{�ꏑ���w��o��");
			PConsole.printfJpn("����������", 20,true);
			System.out.println(" | ");
			PConsole.printfJpn("aaaaa", 20,true);
			System.out.println(" | ");

			PConsole.printfJpn("����������", 20 );
			System.out.println(" | ");
			PConsole.printfJpn("aaaaa", 20);
			System.out.println(" | ");



		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
	  
		
