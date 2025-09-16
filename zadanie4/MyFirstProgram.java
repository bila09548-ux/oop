import myfirstpackage.*;
class MyFirstClass {
    public static void main(String[] s) {
       MyFirstPackage o = new MyFirstPackage(20, 10);
        System.out.println(o.division());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setFirst(i);
                o.setSecond(j);
                System.out.print(o.division());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}