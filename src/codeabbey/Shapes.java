package codeabbey;

public class Shapes {

        public static void Square(){
            int horizontal = 5, vertical = 5;
            for (int i=1; i < horizontal; i++){
            for (int j=1; j < vertical; j++){
                System.out.print(i);
                System.out.println(j);
//                System.out.printf("%d8%d8",+j,+j);
//                System.out.print(i);
            }
            }
            System.out.println();
        }
    public static void main(String[] args) {
        int nr = 5, nc = 6;
        for (int i = 1; i < nr + 1; i++) {

            for (int j = 1; j < nc + 1; j++) {
                System.out.print( i * j +"\t");
            }
            System.out.println();
        }
        Square();
    }
}
