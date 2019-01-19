import java.util.Scanner;

public class SaveSetuUVA12403 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tc = Integer.parseInt(in.nextLine());
        int cost = 0;
        while(tc-- > 0){
            String input = in.nextLine();
            if(input.startsWith("donate")){
                String value = input.substring(7, input.length());
                cost += Integer.parseInt(value);
            } else {
                System.out.println(cost);
            }
        }
    }
}
