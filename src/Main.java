import matchParser.MatchParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by faos7 on 2/17/17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("please eneter formula");
        String formula = readLine();
        MatchParser p = new MatchParser();
        System.out.println("please enter x value");
        Double xVal = Double.parseDouble(readLine());
        p.setVariable("x", xVal);
        try{
            System.out.println( "y" + "=" + p.Parse( formula ) );
        }catch(Exception e){
            System.err.println( "Error while parsing '"+formula+"' with message: " + e.getMessage() );
        }
    }

    public static String readLine(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (Exception e){
            System.out.println();
            System.err.println("Unexpected error");
            return "0";
        }
    }
}
