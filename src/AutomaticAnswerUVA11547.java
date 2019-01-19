import java.util.Scanner;

public class AutomaticAnswerUVA11547 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();

        while(tc-- > 0) {
            int n = in.nextInt();
            System.out.println(Math.abs((((n * 315) + 36962) % 100)/10));
        }
    }
}
