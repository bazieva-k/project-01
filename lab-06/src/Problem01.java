import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Coordinate of your point: ");
        int userX = scan.nextInt();

        System.out.print("Coordinate of 1st point: ");
        int x1 = scan.nextInt();

        System.out.print("Coordinate of 2nd point: ");
        int x2 = scan.nextInt();

        int d1 = x1 - userX;
        if (d1 < 0 ){
            d1 = -d1;
        }
        int d2 = x2 - userX;
        if(d2 < 0){
            d2 = -d2;
        }

        if (d1 < d2) {
            System.out.printf("1st point is closer. Distance is %d%n", d1);
        } else if (d2 < d1) {
            System.out.printf("2nd point is closer. Distance is %d%n", d1);
        } else {
            System.out.printf("Distances are the same and equal to %d%n", d1);
        }
    }
}
