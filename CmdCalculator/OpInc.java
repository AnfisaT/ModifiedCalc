package CmdCalculator;

/**
 * Created by Anfisa on 24.06.2017.
 */
public class OpInc extends MathAct implements Operation {

    OpInc(int x, String[] A) {
        super(x, A);

    }

    public double op (double v1, double v2){
        double sum =  v1+v2;
        return sum;
    }

    public String [] action(double s){
        double S = s;
        return super.action(S);
    }
}
