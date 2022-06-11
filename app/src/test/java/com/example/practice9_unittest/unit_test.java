package com.example.practice9_unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class unit_test {

    @Test
    public void validationUser_isCorrect() {
        user user_ex = new user("vadim.gainiev@mail.ru", "q!1w@2Er3t",
                "q!1w@2Er3t");
        validation validation_ex = new validation();

        boolean result = validation_ex.validate_user(user_ex);

        boolean validate1 = validation_ex.validate_email(user_ex.Email);
        boolean validate2 = validation_ex.validate_password(user_ex.Password);
        boolean validate3 = validation_ex.validate_passwords_match(user_ex.Password,
                user_ex.ConfirmPassword);

        assertTrue(result);
    }

    @Test
    public void validationEmail_isCorrect() {
        String email = "example@gmail.com";
        validation validation_ex = new validation();

        boolean result  = validation_ex.validate_email(email);

        assertTrue(result);
    }

    @Test
    public void validationPassword_isCorrect() {
        String password = "P@ssw0rd";
        validation validation_ex = new validation();

        boolean result  = validation_ex.validate_password(password);

        assertTrue(result);
    }

    @Test
    public void validationPassword_matches() {
        String password = "P@ssw0rd";
        String passwordConfirmation = "P@ssw0rd";
        validation validation_ex = new validation();

        boolean result = validation_ex.validate_passwords_match(password, passwordConfirmation);

        assertTrue(result);
    }
}
