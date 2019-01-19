import java.util.Scanner;

public class CombinationLockUVA10550 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            int s = in.nextInt();
            int f = in.nextInt();
            int m = in.nextInt();
            int l = in.nextInt();

            if(s == 0 && f == 0 && m == 0 && l == 0)
                break;

            int output = 1080;

            if(f > s)
                output += (s + 40 - f) * 9;
            else
                output += (s - f) * 9;

            if(f > m)
                output += (m + 40 - f) * 9;
            else
                output += (m - f) * 9;

            if(l > m)
                output += (m + 40 - l) * 9;
            else
                output += (m - l) * 9;

            System.out.println(output);
        }
    }
}