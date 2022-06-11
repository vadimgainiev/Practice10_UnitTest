package com.example.practice9_unittest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validation {
    public static final Pattern VALID_EMAIL_PATTERN = Pattern.compile(
            "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$", Pattern.CASE_INSENSITIVE);

    public static final Pattern VALID_PASSWORD_PATTERN = Pattern.compile(
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&*^%]).{6,}$");

    public boolean validate_user(user toValidate) {
        return validate_email(toValidate.Email)
                && validate_password(toValidate.Password)
                && validate_passwords_match(toValidate.Password, toValidate.ConfirmPassword);
    }

    public boolean validate_email(String email) {
        Matcher matcher = VALID_EMAIL_PATTERN.matcher(email);
        return matcher.find();
    }

    public boolean validate_password(String password) {
        Matcher matcher = VALID_PASSWORD_PATTERN.matcher(password);
        return matcher.find();
    }

    public boolean validate_passwords_match(String password, String confirmPassword) {
        return password.trim().equals(confirmPassword.trim());
    }
}
