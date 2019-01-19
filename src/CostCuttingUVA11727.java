import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CostCuttingUVA11727 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            List<Integer> list = new ArrayList<>();
            list.add(x);
            list.add(y);
            list.add(z);
            Collections.sort(list);
            System.out.println("Case " + i + ": " + list.get(1));

//            if(x == y || x == z){
//                System.out.println(x);
//                continue;
//            }
//
//            if(y == x || y == z){
//                System.out.println(y);
//                continue;
//            }
//
//            if(z == x || y == z){
//                System.out.println(z);
//                continue;
//            }
//
//            if((x > y && x < z) || ((x > z && x < y))) {
//                System.out.println(x);
//                continue;
//            }
//
//            if((y > x && y < z) || ((y > z && y < x))) {
//                System.out.println(y);
//                continue;
//            }
//
//            if((z > x && z < y) || ((z > y && z < x))) {
//                System.out.println(z);
//                continue;
//            }
        }
    }
}
