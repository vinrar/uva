import java.util.Scanner;

public class SearchingNessyUVA11044 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();

            System.out.println((x/3) * (y/3));
        }
    }
}
