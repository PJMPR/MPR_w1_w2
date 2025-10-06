# 🧪 Test-Driven Development w Javie — Walidator numeru PESEL

## 🎯 Cel projektu

Celem projektu jest praktyczne poznanie metodyki **Test-Driven Development (TDD)** w języku **Java**.
Podczas zajęć uczestnicy krok po kroku stworzyą prosty, ale realistyczny projekt — **walidator numeru PESEL**,
stosując cykl **Red → Green → Refactor**.

Projekt nie korzysta z żadnych zewnętrznych bibliotek (np. mocków) – cała logika mieści się w jednej klasie domenowej.

---

## 🧩 Czym jest TDD?

**Test-Driven Development (TDD)** to podejście do tworzenia oprogramowania, w którym rozwój kodu napędzany jest przez testy jednostkowe.

### 🔁 Cykl TDD

1. **RED** – napisz test, który *na pewno nie przejdzie* (bo funkcjonalność jeszcze nie istnieje).
2. **GREEN** – zaimplementuj *minimalny kod*, który sprawi, że test przejdzie.
3. **REFACTOR** – popraw kod (czytelność, struktura, nazwy), nie zmieniając jego zachowania.

> 👉 Dzięki temu kod powstaje w małych krokach, jest dobrze przetestowany, czysty i zrozumiały.

### 💡 Zalety TDD

* Wymusza przemyślenie wymagań zanim powstanie implementacja.
* Daje natychmiastowy feedback o poprawności kodu.
* Zwiększa pewność przy refaktoryzacji.
* Buduje nawyk pisania czytelnych testów jednostkowych.

---

## 🧠 Temat projektu: Walidator numeru PESEL

Każdy PESEL składa się z **11 cyfr** i zawiera:

* datę urodzenia (6 pierwszych cyfr),
* numer porządkowy i płeć,
* cyfrę kontrolną na końcu.

W projekcie stworzymy klasę:

```java
public class PeselValidator {
    boolean isValid(String pesel);
    Optional<LocalDate> extractBirthDate(String pesel);
    Optional<Boolean> isMale(String pesel);
}
```

### Funkcjonalności:

1. Sprawdzanie poprawności formatu PESEL (długość, tylko cyfry).
2. Weryfikacja sumy kontrolnej.
3. Odczytywanie daty urodzenia z numeru.
4. Określanie płci na podstawie 10. cyfry.

Każda z tych funkcji zostanie wprowadzona etapami w cyklu **TDD**.

---

## 🔧 Struktura projektu (Maven)

```
pesel-tdd/
├─ pom.xml
└─ src
   ├─ main
   │  └─ java/edu/pjwstk/tdd/PeselValidator.java
   └─ test
      └─ java/edu/pjwstk/tdd/
         ├─ PeselValidatorBasicTest.java
         ├─ PeselChecksumTest.java
         └─ PeselBirthDateTest.java
```

---

## 💡 Uruchamianie testów

Aby uruchomić testy JUnit:

```bash
mvn -q test
```


