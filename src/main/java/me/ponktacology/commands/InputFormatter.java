package me.ponktacology.commands;

import java.util.Locale;
import java.util.regex.Pattern;

public class InputFormatter {

    // This pattern matches everything until a whitespace occurs
    private static final Pattern PATTERN = Pattern.compile("^[^ ]*");

    public static String makeCommandLowercase(String original) {
        final var matcher = PATTERN.matcher(original);
        final var output = new StringBuilder();
        var lastIndex = 0;
        while (matcher.find()) {
            output.append(original, lastIndex, matcher.start())
                    .append(matcher.group(lastIndex).toLowerCase(Locale.ROOT));
            lastIndex = matcher.end();
        }
        if (lastIndex < original.length()) {
            output.append(original, lastIndex, original.length());
        }
        return output.toString();
    }
}
