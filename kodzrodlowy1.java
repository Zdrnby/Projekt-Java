package com.mojaaplikacja.pakiet1;

/**
 * Klasa reprezentująca ogólną osobę.
 */
public class Osoba {
    private String imie;
    private String nazwisko;

    /**
     * Konstruktor inicjalizujący obiekt klasy Osoba.
     * @param imie Imię osoby.
     * @param nazwisko Nazwisko osoby.
     */
    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    /**
     * Pobiera imię osoby.
     * @return Imię osoby.
     */
    public String getImie() {
        return imie;
    }

    /**
     * Pobiera nazwisko osoby.
     * @return Nazwisko osoby.
     */
    public String getNazwisko() {
        return nazwisko;
    }

    /**
     * Wyświetla dane osoby.
     */
    public void wyswietlDane() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
    }
}
