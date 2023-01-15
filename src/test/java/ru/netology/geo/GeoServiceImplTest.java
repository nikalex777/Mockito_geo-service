package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {

    @Test
    void byIpTest() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Country expected = Country.RUSSIA;
        Country country = geoService.byIp(GeoServiceImpl.MOSCOW_IP).getCountry();
        assertEquals(expected, country);
    }
}