import java.util.Scanner;

public class OneTwoThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc-- > 0) {
            String input = in.next();
            if(input.length() == 5){
                System.out.println(3);
                continue;
            }
            int oneScore = 0;
            String one = "one";
            String two = "two";
            int twoScore = 0;
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == one.charAt(i)){
                    oneScore += 1;
                }

                if(input.charAt(i) == two.charAt(i)){
                    twoScore += 1;
                }
            }

            if(twoScore > oneScore)
                System.out.println(2);
            else
                System.out.println(1);
        }
    }
}
