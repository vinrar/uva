import java.util.*;

public class TexQuotesUVA272 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //PrintWriter out = new PrintWriter(System.out);
        int j = 0;
        String input = null;
        boolean open = false;
        while (in.hasNextLine()) {
            input = in.nextLine();
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == '\u001a')
                    break;

                if(input.charAt(i) == '"') {
                       if(!open){
                           open = true;
                           System.out.print("``");
                       } else {
                           open = false;
                           System.out.print("''");
                       }
                } else
                    System.out.print(input.charAt(i));
            }

            System.out.print("\n");
        }
    }
}