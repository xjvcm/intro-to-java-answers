/**
 *  (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the
 * following 2 * 2 system of linear equation provided that ad – bc is not 0:
 * ax + by = e
 * cx + dy = f
 * x = (ed - bf) / (ad - bc)
 * y = (af - ec) / (ad - bc)
 * Write a program that solves the following equation and displays the value for x and
 * y: (Hint: replace the symbols in the formula with numbers to compute x and y. This
 * exercise can be done in Chapter 1 without using materials in later chapters.)
 * 3.4x + 50.2y = 44.5
 * 2.1x + .55y = 5.9
 */

 /**
  * c1e13
  */
public class c1e13 {

    public static void main(String[] args) {
        double a, b, d, c, e, f, x, y;
        
        a = 3.4;
        b = 50.2;
        c = 2.1;
        d = .55;
        e = 44.5;
        f = 5.9;

        x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        System.out.println("X is " + x + "\nY is " + y);
    }
}