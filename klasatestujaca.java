package com.mojaaplikacja.pakiet3;
import com.mojaaplikacja.pakiet1.Osoba;
import com.mojaaplikacja.pakiet2.Student;
import com.mojaaplikacja.pakiet2.Wykladowca;

public class Test {

    public static void main(String[] args) {

        // Testowanie klasy Osoba
        Osoba osoba = new Osoba("Jan", "Kowalski");
        osoba.wyswietlDane();
        System.out.println();

        // Testowanie klasy Student
        Student student = new Student("Anna", "Nowak", 123456);
        student.wyswietlSzczegoly();
        System.out.println();

        // Testowanie klasy Wykladowca
        Wykladowca wykladowca = new Wykladowca("Adam", "Smith", "Informatyka");
        wykladowca.wyswietlSzczegoly();
    }
}
