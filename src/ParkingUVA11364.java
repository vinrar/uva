import java.util.*;

public class ParkingUVA11364 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tc = in.nextInt();
        while(tc-- > 0) {
            int n = in.nextInt();
            int sum = 0;
            List<Integer> arr = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                arr.add(in.nextInt());
                sum += arr.get(i);
            }
            Collections.sort(arr);

            //System.out.println(sum - (arr.get(0) * n) + arr.get(n-1) - arr.get(0));
//
//            int pos = (int)Math.round((sum+0.0)/(n+0.0));
//            System.out.println("POS: " + pos);
//            sum = 0;
//            for(int i = 0; i < n; i++) {
//                sum += Math.abs(pos - arr.get(i));
//            }
            System.out.println(2 * (arr.get(n-1) -arr.get(0)));
        }
    }
}
