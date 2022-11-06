package exercises.pjohanson.novweek1.extra;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExponentModIterator implements Iterator<ExponentMod>, Iterable<ExponentMod> {
    protected BigInteger alpha;
    protected int p;

    protected int currentExponent;

    protected int extendIterator;

    public ExponentModIterator(int alpha, int p) {
        this(Integer.toString(alpha), p);
    }
    public ExponentModIterator(String alpha, int p) {
        this.alpha = new BigInteger(alpha);
        this.p = p;
        this.currentExponent = 1;
        this.extendIterator = 0;
    }

    public ExponentModIterator extendIterator(int extendIterator)
    {
        this.extendIterator += extendIterator;
        return this;
    }

    @Override
    public boolean hasNext() {
        return currentExponent <= p + extendIterator;
    }

    @Override
    public ExponentMod next() {
        return new ExponentMod(alpha, currentExponent++, p);
    }

    @Override
    public Iterator<ExponentMod> iterator() {
        return this;
    }

    public ExponentModIterator rewind() {
        currentExponent = 1;
        return this;
    }

    public Set<Integer> getSet() {
        this.rewind();
        Set<Integer> set = new HashSet<>();
        for (ExponentMod expMod: this) {
            set.add(expMod.getValue());
        }
        return set;
    }

    public boolean isGenerator() {
        return this.getSet().size() == p - 1;
    }
}
