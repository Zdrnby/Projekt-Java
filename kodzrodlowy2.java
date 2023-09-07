package com.mojaaplikacja.pakiet2;
import com.mojaaplikacja.pakiet1.Osoba;

/**
 * Klasa reprezentująca studenta, rozszerzająca klasę Osoba.
 */
public class Student extends Osoba {
    private int numerIndeksu;

    /**
     * Konstruktor inicjalizujący obiekt klasy Student.
     * @param imie Imię studenta.
     * @param nazwisko Nazwisko studenta.
     * @param numerIndeksu Numer indeksu studenta.
     */
    public Student(String imie, String nazwisko, int numerIndeksu) {
        super(imie, nazwisko);
        this.numerIndeksu = numerIndeksu;
    }

    /**
     * Pobiera numer indeksu studenta.
     * @return Numer indeksu studenta.
     */
    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    /**
     * Wyświetla szczegóły studenta.
     */
    public void wyswietlSzczegoly() {
        wyswietlDane();
        System.out.println("Numer indeksu: " + numerIndeksu);
    }
}
