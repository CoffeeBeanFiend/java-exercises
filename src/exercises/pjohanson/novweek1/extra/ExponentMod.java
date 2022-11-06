package exercises.pjohanson.novweek1.extra;

import java.math.BigInteger;

public class ExponentMod {
    protected BigInteger alpha;
    protected int power;
    protected int mod;

    public ExponentMod(BigInteger alpha, int power, int mod) {
        this.alpha = alpha;
        this.power = power;
        this.mod = mod;
    }

    public BigInteger getAlpha() {
        return alpha;
    }

    public int getPower() {
        return power;
    }

    public int getMod() {
        return mod;
    }

    public Integer getValue() {
        return alpha.pow(getPower()).mod(BigInteger.valueOf(getMod())).intValue();
    }

    @Override
    public String toString() {
        return getAlpha() + "^" + getPower() + " % " + getMod() + " = " + getValue();
    }
}
