package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int max = 12;
    public static final int reverse = -1;
    private int[] numbers = new int[max];


    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == reverse;
    }

    public boolean isFull() {
        return total == max -1 ;
    }

    protected int peekaboo() {
        if (callCheck())
            return reverse;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return reverse;
        return numbers[total--];
    }

}
