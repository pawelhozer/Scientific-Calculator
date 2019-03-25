package model;

public class MathematicalCharacters {

    private String name;
    private String code;

    public MathematicalCharacters(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return name;
    }
}
