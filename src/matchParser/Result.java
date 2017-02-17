package matchParser;

/**
 * Created by faos7 on 2/17/17.
 */
public class Result {
    public double acc; // accumulator
    public String rest; // rest of the line, we hadn't yet calculated

    public Result(double v, String r) {
        this.acc = v;
        this.rest = r;
    }
}
