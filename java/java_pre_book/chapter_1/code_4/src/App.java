// public class App {
//     public static void main(String[] args) {
//         System.out.println("");
//     }
// }

public class App {
    public static void main(String[] args){
    double pi = 3.14; //円周率を入れた変数
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * pi);
    System.out.println("パイの半径を倍にします");
    pi = 10; //変数誤り。本来代入すべき変数はpie
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * pi);
    }
}
