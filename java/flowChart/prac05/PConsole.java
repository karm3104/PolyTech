import java.io.*;
import java.util.Random;
import java.nio.charset.Charset;
/*
 * コンソール入出力用クラス
 *
 * copyright:Nakamura,Atsushi
 *
 * ver.1.00 2018-07-13.0833
 * ver.1.01 2020-01-19.1616
 */
public class PConsole {
	/**
	 *   整数入力
	 */
	public static int inputIntNum() {
		InputStreamReader isr;        // 入力のための仕組装置
		BufferedReader reader;        // 入力のための仕組装置
		
		String str;                   // 入力された文字列を格納する
		int num = 0;                  // 変換された整数
		String prompt = "整数入力>";  // 入力用のプロンプト

		// 入力のための仕組み装置を用意する
		isr = new InputStreamReader(System.in);
		reader = new BufferedReader(isr);

		//reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 入力ループ
		while(true) {
			try {
				System.out.print(prompt);
				str = reader.readLine();
				num = Integer.parseInt(str);
			} catch (IOException e) {
				; // 教材用なので例外送出はしない。
			} catch (NumberFormatException e) {
				System.out.println("整数ではありません.入力し直してください.");
				continue;
			}
			break;
		}

		return num;
	}
	
	/**
	 *   整数入力:入力範囲指定版
	 */
	public static int inputIntNum(int min, int max) {
		int num;         // 入力された整数
		String message;  // 入力メッセージ

		message = String.format("%d~%dの整数を入力してください.",min ,max);
		while (true) {
			System.out.println(message);
			num = inputIntNum();
			if (num < min || num > max) {
				System.out.println("入力値が範囲外です.");
			} else {
				break;
			}
		}
		return num;
	}

	/**
	 *    文字列入力
	 */
	public static String inputString() {
		InputStreamReader isr;        // 入力のための仕組装置
		BufferedReader reader;        // 入力のための仕組装置
		
		String str;                   // 入力された文字列を格納する
		String prompt = "文字列入力>";  // 入力用のプロンプト

		// 入力のための仕組み装置を用意する
		isr = new InputStreamReader(System.in);
		reader = new BufferedReader(isr);

		// 入力
		str = "";
		try {
			System.out.print(prompt);
			str = reader.readLine();
		} catch (IOException e) {
			; // 教材用なので例外送出はしない。
		}

		return str;
	}


	/**
	 * 最大値、最小値を指定して、乱数を発生（整数）
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
	 * 整数をランダムに入れた配列を生成する
	 * 
	 * 戻り値: ランダムな整数の入った配列
	 * min:最少値
	 * max:最大値
	 * count:配列の個数
	 * disp: true:内容を表示する false:表示しない
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
			System.out.printf( "    作成された配列 --- 要素数:%d\n",count);
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
	 * 日本語交じりの書式指定（コンソール出力）（左寄せ）
	 * 　String target:出力文字列
	 * 	 int length:出力桁数　
	 */
	public static void printfJpn(String target, int length) {
        printfJpn(target, length,false);
    }

	/**
	 * 日本語交じりの書式指定（コンソール出力）
	 *    String target:出力文字列
	 *    int length:出力桁数　
	 *    boolean right: true:左寄せ / false:右寄せ
	 */
    public static void printfJpn(String target, int length,boolean right) {
        System.out.print(formatJpnString(target, length, right));
    }

	/**
	 * 日本語交じりの書式指定（文字列作成）
	 *    String target:出力文字列
	 *    int length:出力桁数　
	 *    boolean right: true:左寄せ / false:右寄せ
	 */
    private static String formatJpnString(String target, int length, boolean right) {
        String string = null;
        int byteDiff = (target.getBytes(Charset.forName("UTF-8")).length - target.length())/2;
        
        if (right) string = String.format("%-" + (length - byteDiff) + "s", target);
        else       string = String.format("%" + (length - byteDiff) + "s", target);

        return string;
	}

	/**
	 * テスト用メイン
	 */
	public static void main(String[] args) {
		// 使用例：入力
		int num = inputIntNum(0,18);
		System.out.println(num);


		// 使用例：ランダムな値の配列を取得
		int[] array;
		int cnt = num;
		int maxSetting = 100;
		int minSetting = -10;
		array = createRandomIntArray(minSetting,  maxSetting,  cnt,  true);
		//                           最小値,最大値,要素数,表示/非表示

		// 要素数、最大値、最小値が指定内に収まっているかどうかどおりかどうか確認
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
	  
		
