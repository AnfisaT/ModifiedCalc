package CmdCalculator;

/**
 * Created by Anfisa on 24.06.2017.
 */
public class OpDec extends MathAct implements Operation {

    OpDec(int x, String[] A) {
        super(x, A);
    }

    public double op (double v1, double v2) {
        double res = v1-v2;
        return res;
    }

    public String[] action(double r) {
        return super.action(r);
    }
}