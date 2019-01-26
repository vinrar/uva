import java.util.Scanner;

public class GreyCodesReverseUVA11173Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int code = in.nextInt();
        int n = code;
        code = code >> 1;
        while(code > 0){
            n ^= code;
            code = code >> 1;
        }
        System.out.println(n);
    }
}