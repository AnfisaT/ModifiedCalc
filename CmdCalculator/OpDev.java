package CmdCalculator;

/**
 * Created by Anfisa on 24.06.2017.
 */
public class OpDev extends MathAct implements Operation {

    OpDev(int x, String[] A) {
        super(x, A);
    }

    public double op(double v1, double v2) {

        double quot;
        if (v2 != 0){
            quot = v1 / v2;
        }
        else {
            quot = 0;
        }

        return quot;
     }

     public String [] action(double q){
         return super.action(q);
     }
}
