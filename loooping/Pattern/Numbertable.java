
public class Numbertable {
    public static void main(String[] args) {

        int num = 1;

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {

                // Extra space for single-digit numbers
                if (num < 10) {
                    System.out.print("0"+num+" ");
                }
                else{
                    System.out.print(num + " ");
                }

                
                num++;
            }

            System.out.println();
        }
    }
}