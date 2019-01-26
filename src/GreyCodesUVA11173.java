import java.util.Scanner;

public class GreyCodesUVA11173 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        //int[] list = prepareIntegerList(30);
        while(tc-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();

            System.out.println(k ^ (k >> 1));
        }
    }
    /*
    My first attempt. Haha. Heap space out of bounds exception. Such naivety.
     */
//    public static int[] prepareIntegerList(int n){
//        int value = 1 << n;
//        int[] list = new int[value];
//        int currIndex = 1;
//        list[0] = 0;
//        list[1] = 1;
//        Stack<Integer> stack = new Stack<>();
//        stack.push(list[0]);
//        stack.push(list[1]);
//
//        while(n-- > 1){
//            while(!stack.isEmpty()){
//                currIndex += 1;
//                int x = stack.pop();
//                x = x << 1;
//                list[currIndex] = x;
//            }
//            for(int i = 0; i <= currIndex; i++){
//                stack.push(list[i]);
//            }
//        }
//
//        return list;
//    }
}