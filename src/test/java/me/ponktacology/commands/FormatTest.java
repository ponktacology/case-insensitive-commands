package me.ponktacology.commands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatTest {

    @Test
    public void testLowercaseFormat() {
        assertEquals(
                InputFormatter.makeCommandLowercase("/siema eNiU kochany kOlOrowy"),
                "/siema eNiU kochany kOlOrowy"
        );
        assertEquals(
                InputFormatter.makeCommandLowercase("/sIemA eNiU kochany kOlOrowy"),
                "/siema eNiU kochany kOlOrowy"
        );
        assertEquals(
                InputFormatter.makeCommandLowercase("/sIemA      eNiU      kochany      kOlOrowy"),
                "/siema      eNiU      kochany      kOlOrowy"
        );
    }

    @Test
    public void testLowercaseFormatWithNamespace() {
        assertEquals(
                InputFormatter.makeCommandLowercase("/naMeSpace:sIemA  eNiU kochany kOlOrowy"),
                "/namespace:siema  eNiU kochany kOlOrowy"
        );
        assertEquals(
                InputFormatter.makeCommandLowercase("/namespace:sIemA  eNiU kochany kOlOrowy"),
                "/namespace:siema  eNiU kochany kOlOrowy"
        );
        assertEquals(
                InputFormatter.makeCommandLowercase("/nAmeSpace:sIemA      eNiU      kochany      kOlOrowy"),
                "/namespace:siema      eNiU      kochany      kOlOrowy"
        );
    }
}
