import java.util.Scanner;

public class EmoogleBalance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int j = 1;
        while(n != 0) {
            int bal = 0;
            for(int i = 0; i< n; i++){
                int input = in.nextInt();
                if(input == 0)
                    bal -= 1;
                else
                    bal += 1;
            }
            System.out.println("Case " + j + ": " + bal);
            n = in.nextInt();
            j++;
        }
    }
}
