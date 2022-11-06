package exercises.pjohanson.novweek1.extra;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExponentModIterator implements Iterator<ExponentMod>, Iterable<ExponentMod> {
    protected BigInteger alpha;
    protected BigInteger p;

    protected BigInteger currentExponent;

    protected int extendIterator;

    public ExponentModIterator(int alpha, int p) {
        this(Integer.toString(alpha), Integer.toString(p));
    }
    public ExponentModIterator(String alpha, String p) {
        this.alpha = new BigInteger(alpha);
        this.p = new BigInteger(p);
        this.currentExponent = BigInteger.ONE;
        this.extendIterator = 0;
    }

    public ExponentModIterator extendIterator(int extendIterator)
    {
        this.extendIterator += extendIterator;
        return this;
    }

    @Override
    public boolean hasNext() {
        return currentExponent.compareTo(p.add(BigInteger.valueOf(extendIterator))) < 0;
    }

    @Override
    public ExponentMod next() {
        ExponentMod ret = new ExponentMod(alpha, currentExponent, p);
        currentExponent = currentExponent.add(BigInteger.ONE);
        return ret;
    }

    @Override
    public Iterator<ExponentMod> iterator() {
        return this;
    }

    public ExponentModIterator rewind() {
        currentExponent = BigInteger.ONE;
        return this;
    }

    public Set<BigInteger> getSet() {
        this.rewind();
        Set<BigInteger> set = new HashSet<>();
        for (ExponentMod expMod: this) {
            set.add(expMod.getValue());
        }
        return set;
    }

    public boolean isGenerator() {
        BigInteger pMinusOne = p.subtract(BigInteger.ONE);
        return pMinusOne.compareTo(BigInteger.valueOf(getSet().size())) == 0;
    }
}
