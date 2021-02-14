public class P05 {
    public static void main(String[] args){
        int[] array = {80, 68, 92, 100, 86};
        int sum = 0;
        for(int i=0;i<5;i++){
            sum = sum + array[i];
        }
        int avg = sum / array.length;
        System.out.println("合計点は"+sum+"点で、平均点は"+avg+"点です。");
    }
}