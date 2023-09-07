package com.mojaaplikacja.pakiet2;
import com.mojaaplikacja.pakiet1.Osoba;

/**
 * Klasa reprezentująca wykładowcę, rozszerzająca klasę Osoba.
 */
public class Wykladowca extends Osoba {
    private String specjalizacja;

    /**
     * Konstruktor inicjalizujący obiekt klasy Wykladowca.
     * @param imie Imię wykładowcy.
     * @param nazwisko Nazwisko wykładowcy.
     * @param specjalizacja Specjalizacja wykładowcy.
     */
    public Wykladowca(String imie, String nazwisko, String specjalizacja) {
        super(imie, nazwisko);
        this.specjalizacja = specjalizacja;
    }

    /**
     * Pobiera specjalizację wykładowcy.
     * @return Specjalizacja wykładowcy.
     */
    public String getSpecjalizacja() {
        return specjalizacja;
    }

    /**
     * Wyświetla szczegóły wykładowcy.
     */
    public void wyswietlSzczegoly() {
        wyswietlDane();
        System.out.println("Specjalizacja: " + specjalizacja);
    }
}
