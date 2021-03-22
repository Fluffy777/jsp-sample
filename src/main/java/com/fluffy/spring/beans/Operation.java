package com.fluffy.spring.beans;

public class Operation {
    private int one;
    private int two;
    private OperationType type;

    public enum OperationType {
        ADD,
        SUB,
        MUL,
        DIV;

        @Override
        public String toString() {
            switch (this) {
                case ADD:
                    return "Додавання";
                case SUB:
                    return "Віднімання";
                case MUL:
                    return "Множення";
                case DIV:
                    return "Ділення";
                default:
                    return "";
            }
        }
    }

    public Operation(int one, int two, OperationType type) {
        this.one = one;
        this.two = two;
        this.type = type;
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return one + typeToString() + two + " = " + getTextResult();
    }

    private String typeToString() {
        switch (type) {
            case ADD:
                return "+";
            case SUB:
                return "-";
            case MUL:
                return "*";
            case DIV:
                return "/";
            default:
                return "?";
        }
    }

    public String getTextResult() {
        switch (type) {
            case ADD:
                return String.valueOf(one + two);
            case SUB:
                return String.valueOf(one - two);
            case MUL:
                return String.valueOf(one * two);
            case DIV:
                if (two != 0) {
                    return String.valueOf((double) one / two);
                } else {
                    return "Помилка: two = 0";
                }
            default:
                return "?";
        }
    }
}
