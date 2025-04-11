package lab1;

/**
 * Class with methods to find the area of a triangle given a height var and the circumference
 * @author Emmanuel Ajoku
 * @since 12/02/2025
 *
 *
 */
public class is_angled_triangle {

    public static void main(String[] args) {
        int a = 10;
        int base = 5;
        int C = 7;
        System.out.println(area(a,base,C));
        System.out.println(circum(a,base,C));

    }

    /**
     *
     * @param a int value
     * @param b int value
     * @param c int value
     * @return area double
     */

    public static double area(int a ,int b,int c){
        /**
         * @param height sum of ((a,b,c)^2)/2
         */
        double area;
        double height = ((a^2) + (b^2) + (c^2)) / 2;
        area = 0.5 * b * height;
        return area;
    }

    /**
     * @return circumference int value
     */

    public static int circum(int a,int b,int c)
    {
        int circumference =  a+b+c;
        return circumference;
    }

}
