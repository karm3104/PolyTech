// public class App {
//     public static void main(String[] args) {
//         System.out.println("");
//     }
// }

public class App {
    public static void main(String[] args){
    final double PI = 3.14; //円周率を入れた変数
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * PI);
    System.out.println("パイの半径を倍にします");
    PI = 10;
         //上のとおりにfinal変数PIに値を代入できないとのエラーが出る
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * PI);
    }
}