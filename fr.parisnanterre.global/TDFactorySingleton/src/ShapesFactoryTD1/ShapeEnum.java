package ShapesFactoryTD1;

public enum ShapeEnum {
    CONE ("cone"),
    CUBOID ("cuboid"),
    RECTANGLE ("rectangle"),
    SPHERE ("sphere"),
    SQUARE ("square");

    private final String e;

    ShapeEnum(String e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return e;
    }

}
