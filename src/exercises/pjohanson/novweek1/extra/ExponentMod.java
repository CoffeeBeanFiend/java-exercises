package exercises.pjohanson.novweek1.extra;

import java.math.BigInteger;

public class ExponentMod {
    protected BigInteger alpha;
    protected BigInteger power;
    protected BigInteger mod;

    public ExponentMod(BigInteger alpha, BigInteger power, BigInteger mod) {
        this.alpha = alpha;
        this.power = power;
        this.mod = mod;
    }

    public BigInteger getAlpha() {
        return alpha;
    }

    public BigInteger getPower() {
        return power;
    }

    public BigInteger getMod() {
        return mod;
    }

    public BigInteger getValue() {
        return alpha.modPow(getPower(), getMod());
    }

    @Override
    public String toString() {
        return getAlpha() + "^" + getPower() + " % " + getMod() + " = " + getValue();
    }
}
