
/**
 * Write a description of class MathUtilities here.
 *
 * @author Mert
 * @version Bekdemir
 */
public class MathUtilities
{
    /**
     * Method power
     * @param base
     * @param exponent
     * method will calculate and return the result
     * of the first parameter raised to the power of the second parameter
     */
    public static int power(int base, int exponent){
        int count = 1;
        int result = 1;
        while(count <= exponent){
            
            result = result * base;
            count ++;
        }
        return result;
    }
}
