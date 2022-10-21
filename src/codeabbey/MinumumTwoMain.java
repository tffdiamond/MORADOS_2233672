package codeabbey;

import java.util.*;
import java.util.stream.Stream;

public class MinumumTwoMain {
    int num1, num2;

    public MinumumTwoMain(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
//        int[][] minOfTwo ={{20}, {937350,6507063}, {-6702735 -3152911
//        },{909094, 3833385},{4386163, -1250257},{2684932 -3883917},{3535625, 2029337
//        },{-1615212 ,-9430575},{5889313 ,-1229776},{4078887, 2038844},{-8071288, -1377610},{-295658 ,6569899},
//                {-8456583 ,-7977004},{7293714, 3583442},{2097525 -9488171},{-1136349, 406693},{5475658 ,9323170},
//                {1030398, 3957516},{-6107316 ,1389032},{1614093 -1508081},{4230968, -9141473}};
//        String toString = String.valueOf(minOfTwo);
//        Stream<int[]> min = Arrays.stream(minOfTwo).min(Comparator<int[]>comparator);
//        min.forEach(str -> System.out.print(Arrays.toString(str) + " "));
    }

    public static void main(String[] args) {
        ArrayList<MinumumTwoMain> ar = new ArrayList<MinumumTwoMain>();
        ar.add(new MinumumTwoMain(20, 20));
        ar.add(new MinumumTwoMain(9373507, 6507063));
        ar.add(new MinumumTwoMain(-6702735, -3152911));
        ar.add(new MinumumTwoMain(909094, 3833385));
        ar.add(new MinumumTwoMain(4386163, -1250257));
        ar.add(new MinumumTwoMain(2684932, -3883917));
        ar.add(new MinumumTwoMain(3535625, 2029337));
        ar.add(new MinumumTwoMain(-1615212, -9430575));
        ar.add(new MinumumTwoMain(5889313, -1229776));
        ar.add(new MinumumTwoMain(4078887, 2038844));
        ar.add(new MinumumTwoMain(-8071288, -1377610));
        ar.add(new MinumumTwoMain(-295658,6569899));
        ar.add(new MinumumTwoMain(-8456583, -7977004));
        ar.add(new MinumumTwoMain(7293714, 3583442));
        ar.add(new MinumumTwoMain(2097525, -9488171));
        ar.add(new MinumumTwoMain(-1136349, 406693));
        ar.add(new MinumumTwoMain(5475658, 9323170));
        ar.add(new MinumumTwoMain(1030398, 3957516));
        ar.add(new MinumumTwoMain(-6107316, 1389032));
        ar.add(new MinumumTwoMain(1614093, -1508081));
        ar.add(new MinumumTwoMain(4230968, -9141473));


        String s = "s,d,f";

        System.out.println(Arrays.toString(s.split(",")));
//        ar.add(new MinumumTwoMain());
//        ar.add(new MinumumTwoMain());
        Collections.sort(ar, new MinTwo());
        System.out.println("IDK");
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
    }
}

class MinTwo implements Comparator<MinumumTwoMain>{

    @Override
    public int compare(MinumumTwoMain o1, MinumumTwoMain o2) {
        return o1.num1 - o2.num2;
    }
}
