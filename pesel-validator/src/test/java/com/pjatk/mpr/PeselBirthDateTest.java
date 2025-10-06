package com.pjatk.mpr;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PeselBirthDateTest {

//    private final PeselValidator validator = new PeselValidator();
//
//    @Test
//    void shouldExtractBirthDateFor1900s() {
//        // 1944-05-14 -> 440514...
//        Optional<LocalDate> date = validator.extractBirthDate("44051401458");
//        assertEquals(Optional.of(LocalDate.of(1944,5,14)), date);
//    }
//
//    @Test
//    void shouldExtractBirthDateFor2000s() {
//        // 2003-12-24 -> miesiąc 32 (20 + 12)
//        Optional<LocalDate> date = validator.extractBirthDate("03322412348");
//        assertEquals(Optional.of(LocalDate.of(2003,12,24)), date);
//    }
//
//    @Test
//    void shouldReturnEmptyForInvalidDate() {
//        // np. 31 lutego – checksum może się „zgadzać”, ale data nie istnieje
//        assertTrue(validator.extractBirthDate("99023112351").isEmpty());
//    }
//
//    @Test
//    void genderShouldBeDerivedFrom10thDigit() {
//        // 10. cyfra (indeks 9): parzysta = kobieta (false), nieparzysta = mężczyzna (true)
//        assertEquals(Optional.of(Boolean.TRUE),  validator.isMale("44051401458")); // ...1... -> M
//        assertEquals(Optional.of(Boolean.FALSE), validator.isMale("03322412348")); // ...2... -> K
//    }
//
//    @Test
//    void dateAndGenderEmptyForInvalidPesel() {
//        assertTrue(validator.extractBirthDate("invalid").isEmpty());
//        assertTrue(validator.isMale("invalid").isEmpty());
//    }
}

