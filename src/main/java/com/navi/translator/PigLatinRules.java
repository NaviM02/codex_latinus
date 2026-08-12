package com.navi.translator;

import java.util.Set;

public final class PigLatinRules {
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public static String translateIdentifier(String identifier) {
        if (identifier == null || identifier.isEmpty()) {
            return identifier;
        }

        char first = Character.toLowerCase(identifier.charAt(0));

        if (VOWELS.contains(first)) {
            return identifier + "way";
        }

        int consonants = 0;

        while (consonants < identifier.length()) {
            char character = Character.toLowerCase(identifier.charAt(consonants));
            if (VOWELS.contains(character)) break;

            consonants++;
        }

        if (consonants == identifier.length()) {
            return identifier + "ay";
        }

        return identifier.substring(consonants) + identifier.substring(0, consonants) + "ay";
    }

    public static String translateKeyword(String keyword) {
        return switch (keyword) {
            case "esto" -> translateIdentifier("esto");
            case "series" -> translateIdentifier("series");
            case "estructura" -> translateIdentifier("estructura");
            case "actio" -> translateIdentifier("actio");
            case "ratio" -> translateIdentifier("ratio");
            case "si" -> translateIdentifier("si");
            case "aliter" -> translateIdentifier("aliter");
            case "dum" -> translateIdentifier("dum");
            case "facere" -> translateIdentifier("facere");
            case "per" -> translateIdentifier("per");
            case "reddere" -> translateIdentifier("reddere");
            case "perge" -> translateIdentifier("perge");
            case "interrumpe" -> translateIdentifier("interrumpe");
            case "variabiles" -> translateIdentifier("variabiles");
            case "verum" -> translateIdentifier("verum");
            case "falsus" -> translateIdentifier("falsus");
            case "finis" -> translateIdentifier("finis");
            default -> keyword;
        };
    }

    public static String translateType(String type) {
        return switch (type) {
            case "numerus" -> translateIdentifier("numerus");
            case "decimalis" -> translateIdentifier("decimalis");
            case "littera" -> translateIdentifier("littera");
            case "textum" -> translateIdentifier("textum");
            case "boolean" -> translateIdentifier("boolean");
            case "void" -> translateIdentifier("void");
            default -> translateIdentifier(type);
        };
    }

    public static String translateSectionKeyword(String keyword) {
        return translateIdentifier(keyword).toUpperCase();
    }
}