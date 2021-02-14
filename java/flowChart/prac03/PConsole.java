import java.io.*;
import java.util.Random;
import java.nio.charset.Charset;
/*
 * �R���\�[�����o�͗p�N���X
 *
 * copyright:Nakamura,Atsushi
 *
 * ver.1.00 2018-07-13.0833
 * ver.1.01 2020-01-19.1616
 */
public class PConsole {
	/**
	 *   ��������
	 */
	public static int inputIntNum() {
		InputStreamReader isr;        // ���͂̂��߂̎d�g���u
		BufferedReader reader;        // ���͂̂��߂̎d�g���u
		
		String str;                   // ���͂��ꂽ��������i�[����
		int num = 0;                  // �ϊ����ꂽ����
		String prompt = "��������>";  // ���͗p�̃v�����v�g

		// ���͂̂��߂̎d�g�ݑ��u��p�ӂ���
		isr = new InputStreamReader(System.in);
		reader = new BufferedReader(isr);

		//reader = new BufferedReader(new InputStreamReader(System.in));
		
		// ���̓��[�v
		while(true) {
			try {
				System.out.print(prompt);
				str = reader.readLine();
				num = Integer.parseInt(str);
			} catch (IOException e) {
				; // ���ޗp�Ȃ̂ŗ�O���o�͂��Ȃ��B
			} catch (NumberFormatException e) {
				System.out.println("�����ł͂���܂���.���͂������Ă�������.");
				continue;
			}
			break;
		}

		return num;
	}
	
	/**
	 *   ��������:���͔͈͎w���
	 */
	public static int inputIntNum(int min, int max) {
		int num;         // ���͂��ꂽ����
		String message;  // ���̓��b�Z�[�W

		message = String.format("%d~%d�̐�������͂��Ă�������.",min ,max);
		while (true) {
			System.out.println(message);
			num = inputIntNum();
			if (num < min || num > max) {
				System.out.println("���͒l���͈͊O�ł�.");
			} else {
				break;
			}
		}
		return num;
	}

	/**
	 *    ���������
	 */
	public static String inputString() {
		InputStreamReader isr;        // ���͂̂��߂̎d�g���u
		BufferedReader reader;        // ���͂̂��߂̎d�g���u
		
		String str;                   // ���͂��ꂽ��������i�[����
		String prompt = "���������>";  // ���͗p�̃v�����v�g

		// ���͂̂��߂̎d�g�ݑ��u��p�ӂ���
		isr = new InputStreamReader(System.in);
		reader = new BufferedReader(isr);

		// ����
		str = "";
		try {
			System.out.print(prompt);
			str = reader.readLine();
		} catch (IOException e) {
			; // ���ޗp�Ȃ̂ŗ�O���o�͂��Ȃ��B
		}

		return str;
	}


	/**
	 * �ő�l�A�ŏ��l���w�肵�āA�����𔭐��i�����j
	 */
	public static int getRandomInt(int min, int max) {

		if (max <= min) {
			throw new IllegalArgumentException("must be \'max <= min\'");
		}
		Random rand = new Random();
		int res = rand.nextInt(max - min) + min;
	
		return res;

	}

	/**
	 * �����������_���ɓ��ꂽ�z��𐶐�����
	 * 
	 * �߂�l: �����_���Ȑ����̓������z��
	 * min:�ŏ��l
	 * max:�ő�l
	 * count:�z��̌�
	 * disp: true:���e��\������ false:�\�����Ȃ�
	 */
	public static int[] createRandomIntArray(int min, int max, int count, boolean disp) {
		int[] array;

		if (max <= min) {
			throw new IllegalArgumentException("must be \'max <= min\'");
		}
		max++;
		array = new int[count];
		Random rand = new Random();
		for (int i = 0; i < count ; i++) {
			//System.out.printf("max:%d,min:%d,max- min:%d" ,max,min,max - min) ;
			array[i] = rand.nextInt(max - min) + min;
		}

		if (disp) {
			System.out.println("=====================================================");
			System.out.printf( "    �쐬���ꂽ�z�� --- �v�f��:%d\n",count);
			System.out.printf( "    by PConsole.createRandamIntArray()\n");
			System.out.println("=====================================================");
			int j = 1;
			for (int i = 0; i < count ; i++) {
				System.out.print(array[i]);
				if (i < count -1) {
					System.out.print(",");
				}
				if (j < 10) {
					j++;
				} else {
					System.out.println();
					j = 1;
				}
			}
		}
		System.out.println("\n=====================================================");
		return array;
	}

	/**
	 * ���{�������̏����w��i�R���\�[���o�́j�i���񂹁j
	 * �@String target:�o�͕�����
	 * 	 int length:�o�͌����@
	 */
	public static void printfJpn(String target, int length) {
        printfJpn(target, length,false);
    }

	/**
	 * ���{�������̏����w��i�R���\�[���o�́j
	 *    String target:�o�͕�����
	 *    int length:�o�͌����@
	 *    boolean right: true:���� / false:�E��
	 */
    public static void printfJpn(String target, int length,boolean right) {
        System.out.print(formatJpnString(target, length, right));
    }

	/**
	 * ���{�������̏����w��i������쐬�j
	 *    String target:�o�͕�����
	 *    int length:�o�͌����@
	 *    boolean right: true:���� / false:�E��
	 */
    private static String formatJpnString(String target, int length, boolean right) {
        String string = null;
        int byteDiff = (target.getBytes(Charset.forName("UTF-8")).length - target.length())/2;
        
        if (right) string = String.format("%-" + (length - byteDiff) + "s", target);
        else       string = String.format("%" + (length - byteDiff) + "s", target);

        return string;
	}

	/**
	 * �e�X�g�p���C��
	 */
	public static void main(String[] args) {
		// �g�p��F����
		int num = inputIntNum(0,18);
		System.out.println(num);


		// �g�p��F�����_���Ȓl�̔z����擾
		int[] array;
		int cnt = num;
		int maxSetting = 100;
		int minSetting = -10;
		array = createRandomIntArray(minSetting,  maxSetting,  cnt,  true);
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

	}

}
	  
		
