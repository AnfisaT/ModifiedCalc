package CmdCalculator;

/**
 * Created by Anfisa on 04.07.2017.
 */
public class MathAct{
    int i;
    String [] Ex;


    MathAct  (int x, String [] A){
        i = x;
        Ex = A;
    }

    public String [] action(double d){
        Ex[i] = Double.toString(d);
        TailPull H = new TailPull();
        Ex = H.tailpull(Ex, (i+1));
        return Ex;
    }

}
