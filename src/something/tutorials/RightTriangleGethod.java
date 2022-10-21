package something.tutorials;
//not good version of creating a program to calculate the area and perimeter of a triangle (redundancy at finest)
public class RightTriangleGethod {
    static int getBase(int x){
        return x;
    }
    static int getHeight(int y){
        return y;
    }
    static int getHypotenuse(int z){
        return z;
    }
    static int perimeter = getBase(20) + getHeight(20) + getHypotenuse(30);
    static float area = (float)1/(float)2 * getBase(20) * getHeight(20);
    public static void main(String[] args) {
        System.out.println("Perimter: "+perimeter+" ");
        System.out.println("Area: "+area+" ");
    }
}
