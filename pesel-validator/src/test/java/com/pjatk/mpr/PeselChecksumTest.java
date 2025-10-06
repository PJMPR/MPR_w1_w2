package com.pjatk.mpr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PeselChecksumTest {

//    private final PeselValidator validator = new PeselValidator();
//
//    @ParameterizedTest
//    @ValueSource(strings = {
//            "44051401458", // klasyczny przykład: 1944-05-14
//            "99022812357", // 1999-02-28 (losowy numer serii, poprawny checksum)
//            "03322412348"  // 2003-12-24 -> miesiąc 32 (20 + 12) – poprawny checksum
//    })
//    void shouldAcceptValidChecksum(String pesel) {
//        assertTrue(validator.isValid(pesel));
//    }
//
//    @ParameterizedTest
//    @ValueSource(strings = {
//            "44051401459", // zła ostatnia cyfra
//            "99022812350",
//            "03322412340"
//    })
//    void shouldRejectInvalidChecksum(String pesel) {
//        assertFalse(validator.isValid(pesel));
//    }
//
//    @Test
//    void stillRejectsWhenLengthOrDigitsAreWrongEvenIfChecksumWouldMatch() {
//        assertFalse(validator.isValid("4405140145"));     // 10 znaków
//        assertFalse(validator.isValid("4405140145X"));    // nie-cyfry
//    }
}

