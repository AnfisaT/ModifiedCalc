package CmdCalculator;

/**
 * Created by Anfisa on 24.06.2017.
 */
public class OpMult extends MathAct implements Operation {
    OpMult(int x, String[] A) {
        super(x, A);
    }

    public double op (double v1, double v2) {
        double m = v1*v2;
        return m;
    }

    public String [] action (double m){
        return super.action(m);
    }
}