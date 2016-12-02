package Calc;

/**
 * Created by Админ on 14.11.2016.
 */
public class Calc {
    public int getSum(int x, int y) {
        return x+y;
    }

    public int getDivide(int x, int y) throws CalcException {
        if(y == 0) throw new CalcException ("Деление на нуль!", y);
          return x/y;

    }

    public int getMultiple(int x, int y) {
        return x*y;
    }


}
