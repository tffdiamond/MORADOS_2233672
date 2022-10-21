package bmical;
//Recursion - a technique of function to call itself.
public class Recursion1 {
    public static void main(String[] args) {
        int result = sum(100); //define an identifier which is equal sum()
        System.out.println(result); //print the result of sum() or vice versa
    }

    //create a method//
    static int sum(int k) { //calls a method that is in the main string
        if (k>0){//iterate the process for each k > 0
            return k+sum(k-1);//return or take back the sum of k into the sum()
        }else{ //if the if-statement is false i.e., k = 0, then this line will be executed
            return 0; // return or take back 0 into sum()
        }
    }
}
