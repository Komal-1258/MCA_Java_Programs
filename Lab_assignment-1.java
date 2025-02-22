/* Write a Java program for pattern 
0000
1111
2222 
3333 */

public class PatternPrinter {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
