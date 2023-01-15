package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @Test
    void localizationServiceTest() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String locale = localizationService.locale(Country.RUSSIA);
        String expected = "Добро пожаловать";
        assertEquals(expected, locale);
    }
}