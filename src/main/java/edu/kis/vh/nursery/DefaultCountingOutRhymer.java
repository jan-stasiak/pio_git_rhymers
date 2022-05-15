package edu.kis.vh.nursery;

/**
 * Klasa tworząca wyliczanki. Działanie przypomina stos. Zawiera w sobie tablice zawierającą wyliczankę oraz metody potrzebne do jej obsługi.
 */
public class DefaultCountingOutRhymer {

    private static final int SIZE_OF_TAB = 12;
    private static final int ERROR = -1;
    private final int[] numbers = new int[SIZE_OF_TAB];


    /**
     * Gets total.
     *
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    private int total = ERROR;

    /**
     * Metoda dodaje element do tablicy
     * Następnie dokonuje postinkrementacje zmiennej total
     *
     * @param in the in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Metoda sprawdza, czy tablica jest pusta
     *
     * @return the boolean
     */
    public boolean callCheck() {
        return total == ERROR;
    }

    /**
     * Metoda sprawdza, czy tablica jest pełna
     *
     * @return the boolean
     */
    public boolean isFull() {
        return total == SIZE_OF_TAB -1 ;
    }

    /**
     * Metoda sprawdza, czy tablica jest pusta.
     * Jeżeli tablica nie jest pusta, to metoda zwraca wartość z tablicy number o indekscie total (ostatnią wartość)
     *
     * @return the int
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    /**
     * Metoda sprawdza, czy tablica jest pusta.
     * Jeżeli tablica nie jest pusta, to metoda zwraca wartość tablicy number o indeksie total (ostatnią wartość)
     * Następnie dokonuje postdekrementacje zmiennej total
     *
     * @return the int
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
