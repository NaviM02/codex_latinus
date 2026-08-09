package com.navi.semantic;

public final class TypeSystem {

    public static final String BOOLEAN = "boolean";
    public static final String NUMERUS = "numerus";
    public static final String DECIMALIS = "decimalis";
    public static final String LITTERA = "littera";
    public static final String TEXTUM = "textum";
    public static final String VOID = "void";

    private TypeSystem() {
    }

    public static boolean isPrimitive(String type) {
        return type.equals(BOOLEAN)
            || type.equals(NUMERUS)
            || type.equals(DECIMALIS)
            || type.equals(LITTERA)
            || type.equals(TEXTUM);
    }

    public static int rank(String type) {
        return switch (type) {
            case BOOLEAN -> 1;
            case LITTERA -> 2;
            case NUMERUS -> 3;
            case DECIMALIS -> 4;
            case TEXTUM -> 5;
            default -> -1;
        };
    }

    public static String promote(String left, String right) {
        if (!isPrimitive(left) || !isPrimitive(right)) {
            return null;
        }

        return rank(left) >= rank(right) ? left : right;
    }

    public static boolean canAssign(String target, String source) {
        if (target.equals(source)) {
            return true;
        }

        if (!isPrimitive(target) || !isPrimitive(source)) {
            return false;
        }

        return rank(source) <= rank(target);
    }
}