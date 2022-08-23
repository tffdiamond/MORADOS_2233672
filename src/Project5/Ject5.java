package Project5;

public class Ject5 {
   public static void main(String[] args){
       int testScore = 91;
       char grade = 0;
            if (testScore >= 90){
                grade = 'A';
            } else if (testScore >= 80) {
                grade = 'B';
            } else if (testScore >= 75) {
                grade = 'C';
            }
            System.out.println("Your Grade is = " + grade);
       var num = 40;
       switch (num) {
           case 10 -> System.out.println("10");
           case 20 -> System.out.println("20");
           case 30 -> System.out.println("30");
           case 40 -> {
               System.out.println("40"); {
                   int i = 0;
                        while (i <= 10) {
                            System.out.println(i);
                                i++;
                    }
                }
           }
       }
   }
}