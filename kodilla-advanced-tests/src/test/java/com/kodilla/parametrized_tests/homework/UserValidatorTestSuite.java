package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    //Tests for username

    @ParameterizedTest
    @ValueSource(strings = {"Magda", "k.a", "O-p", ".-_", "user.01_"})
    public void shouldReturnTrueForUsernameMatchingToRegex(String username){
        boolean result = userValidator.validateUsername(username);

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"al", "kaja,>", "b", "k0>", "<l"})
    public void shouldReturnFalseForUsernameNotMatchingToRegex(String username){
        boolean result = userValidator.validateUsername(username);

        assertFalse(result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseForUsernameNullOrEmpty(String username){
        boolean result = userValidator.validateUsername(username);

        assertFalse(result);
    }

    //Tests for e-mail

    @ParameterizedTest
    @ValueSource(strings = {"Asia.01@wp.pl", "a_b@ole.com", "c-b@g.c", "c.1.a-_@wp.pl", "a.b@gmail.com.pl", "abc@91.com"})
    public void shouldReturnTrueForEmailMatchingToRegex(String email){
        boolean result = userValidator.validateEmail(email);

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"al", "kaja.b", "a.b@", "c_d@wp", "ak@wp.plplpll", "a,>@sw.com", "ala@wp.pl1"})
    public void shouldReturnFalseForEmailNotMatchingToRegex(String email){
        boolean result = userValidator.validateEmail(email);

        assertFalse(result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseForEmailNullOrEmpty(String email){
        boolean result = userValidator.validateEmail(email);

        assertFalse(result);
    }
}