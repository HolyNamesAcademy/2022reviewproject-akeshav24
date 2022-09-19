
public class ShapeMaker {
    /**
     * Returns a string that looks like a square with sides of size "size". If size = 5, the square looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param size length of side
     * @return a string that looks like the shape above when printed
     */
    public static String PrintSquare(int size)
    { String str="";
        for(int r=0;r<size; r++)
        {
            for(int c=0; c<size; c++)
            {
                str+="*";
                if(c+1<size)
                {
                    str+=" ";
                }
            }
            str+="\n";
        }
        return str;
    }

    /**
     * Returns a string that looks like a rectangle with sides of size "length" and "width. If length = 5, width = 4 the rectangle looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param length the width of the rectangle
     * @param height the height of the rectangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRectangle(int length, int height)
    {
        String str="";
        for(int r=0; r<height; r++)
        {
            for(int c=0; c<length; c++)
            {
                str+="*";
                if(c+1<length)
                {
                    str+=" ";
                }
            }
            str+="\n";
        }
        return str;
    }

    /**
     * Returns a string that looks like a right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     *
     *     * *
     *     * * *
     *     * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRightTriangle(int height)
    {
        String str="";
        for(int r=0; r<height; r++)
        {
            for(int c=0; c<=r; c++)
            {
                str+="*";
                if(c+1<=r)
                {
                    str+=" ";
                }
            }
            str+="\n";
        }
        return str;
    }

    /**
     * Returns a string that looks like an inverted right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     * * * * *
     *     * * * *
     *     * * *
     *     * *
     *     *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintInvertedRightTriangle(int height)
    {   String str="";
        for(int r=height; r>0; r--)
        {
            for(int c=r; c>0; c--)
            {
                str+="*";
                if(c-1>0)
                {
                    str+=" ";
                }
            }
            str+="\n";
        }
        return str;
    }

    /**
     * Returns a string that looks like a backwards right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *             *
     *           * *
     *         * * *
     *       * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */

    public static String PrintBackwardsRightTriangle(int height)
    {
        String str="";
        for(int i=0; i<height; i++)
        {
            for(int j=1; j<height-i; j++)
            {
                str+="  ";
            }
            for(int k=0; k<=i; k++)
            {
                str+="*";
                if(k+1<=i)
                {
                    str+=" ";
                }
            }
            str+="\n";
        }
        return str;
    }

    /**
     * Returns a string that looks like an equilateral triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *         *
     *        * *
     *       * * *
     *      * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintEquilateralTriangle(int height)
    {
        String str="";
        int count=0;
        for(int r=0; r<height; r++)
        {   count=0;
            for(int c=r; c<height-1;c++)
            {
                str+= " ";
                count++;
            }
            for(int x=0; x<height-count; x++)
            {
                str+="*";
                if(x+1<height-count)
                {
                    str+=" ";
                }
            }
            str+="\n";
        }
        return str;
    }
}
