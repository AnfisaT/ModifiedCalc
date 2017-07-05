package CmdCalculator;

/**
 * Created by Anfisa on 26.06.2017.
 */
public class StringID {
    public String [] ID (String D []){

        String E [] = D;

        while (E[1] != ""){

            switch (E[1]) {
                case "+":
                    OpInc F = new OpInc(0, E);
                    E = F.action(F.op(Double.valueOf(E[0]),Double.valueOf(E[2])));
                    break;
                case "-":
                    OpDec G = new OpDec(0, E);
                    E = G.action(G.op(Double.valueOf(E[0]),Double.valueOf(E[2])));
                    break;
            }
        }

        return (E);
    }
}
