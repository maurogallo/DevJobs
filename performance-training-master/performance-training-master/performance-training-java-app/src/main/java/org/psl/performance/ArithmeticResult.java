package org.psl.performance;

public class ArithmeticResult {

    private final long id;
    private final int result;

    public ArithmeticResult(long id, int result) {
        this.id = id;
        this.result = result;
    }

    public long getId() {
        return id;
    }

    public int getResult() {
        return result;
    }
}
