import java.util.Scanner;

public class NlogoniaDivisionUVA11498 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNextLine()){
            int tc = in.nextInt();
            if(tc == 0)
                break;
            int x = in.nextInt();
            int y = in.nextInt();
            while(tc-- > 0) {

                int x1 = in.nextInt();
                int y1 = in.nextInt();

                //System.out.println("Before. x1: " + x1 + " y1: " + y1);

                x1 -= x;
                y1 -= y;

                //System.out.println("After. x1: " + x1 + " y1: " + y1);

                if(x1 == 0 || y1 == 0) {
                    System.out.println("divisa");
                    continue;
                }

                if(x1 > 0 && y1 > 0){
                    System.out.println("NE");
                    continue;
                }

                if(x1 > 0 && y1 < 0) {
                    System.out.println("SE");
                    continue;
                }

                if(x1 < 0 && y1 < 0) {
                    System.out.println("SO");
                    continue;
                }

                if(x1 < 0 && y1 > 0){
                    System.out.println("NO");
                    continue;
                }

            }
        }
    }
}
