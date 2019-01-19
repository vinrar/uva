import java.util.Scanner;

public class RelationalOperatorUVA11172 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            if(a > b)
                System.out.println(">");
            else if(a < b)
                System.out.println("<");
            else
                System.out.println("=");
        }
    }
}
