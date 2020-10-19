import java.util.*;

public class demo {
    public static void main(String[] args) {
        double s1, s2, s3;
        String color = "";
        boolean filled = false;
        Scanner kb;
        try {
            System.out.print("Please enter three sides of triangle, a color and whether it is filled or not:");
            kb = new Scanner(System.in);
            s1 = kb.nextDouble();
            s2 = kb.nextDouble();
            s3 = kb.nextDouble();
            color = kb.next();
            filled = kb.nextBoolean();
            kb.close();
            Triangle obj = new Triangle(s1, s2, s3, color, filled);

            if (((s1 + s2) <= s3) || ((s3 + s2) <= s1) || ((s3 + s1) <= s2))
                throw new IllegalTriangleException();
            else {
                System.out.println(obj.toString());
            }

        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Please enter in form of: side1 side2 side3 color (true/false)");
        }
    }
}
