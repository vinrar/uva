import java.util.Scanner;

public class PackingForHolidayUVA12372 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i = 1; i <= n; i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if(a > 20 || b > 20 || c > 20) {
                System.out.println("Case " + i + ": bad");
                continue;
            }

            System.out.println("Case " + i + ": good");
        }
    }
}
