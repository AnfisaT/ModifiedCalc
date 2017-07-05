package CmdCalculator;

/**
 * Created by Anfisa on 26.06.2017.
 */
public class StringMD {
    public String [] MD (String B []){
        String Elements [] = B;
        int x;

        for (int i = 0; i < Elements.length; i++) {

            if (i == 1) {
               switch(Elements[i]){
                   case "*":
                       x = 1;
                       break;
                   case "/":
                       x = 1;
                       break;
                   default:
                       x = 0;
                       i = i+1;
                       break;
               }
               while (x > 0){
                   switch (Elements[1]) {
                        case "*":
                            OpMult X = new OpMult(0, Elements);
                            Elements = X.action(X.op(Double.valueOf(Elements[0]), Double.valueOf(Elements[2])));
                            x = x-1;
                            break;
                        case "/":
                            OpDev Y = new OpDev(0, Elements);
                            Elements = Y.action(Y.op(Double.valueOf(Elements[0]), Double.valueOf(Elements[2])));
                            x = x-1;
                            break;
                    }
               }
               i = i - 1;
            }

            else{
                switch (Elements[i]) {
                    case "*":
                        OpMult X = new OpMult(i-1, Elements);
                        Elements = X.action(X.op(Double.valueOf(Elements[i - 1]), Double.valueOf(Elements[i + 1])));
                        break;
                    case "/":
                        OpDev Y = new OpDev(i-1, Elements);
                        Elements = Y.action(Y.op(Double.valueOf(Elements[i - 1]), Double.valueOf(Elements[i + 1])));
                        break;
                }
            }

        }

        return(Elements);
    }

}
