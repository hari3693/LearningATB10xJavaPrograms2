package static_keyword_ENUM_SIV_IV;

public enum colors {
    RED("red"), GREEN("green"), BLUE("blue");
    private String name;
    colors(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
