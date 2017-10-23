package ShapesFactoryTD1;

public enum ShapeEnum {
    CONE("CONE"),
    CUBOID("CUBOID"),
    RECTANGLE("RECTANGLE"),
    SPHERE("SPHERE"),
    SQUARE("SQUARE");


    private final String typeShape;

    ShapeEnum(String typeShape) {
        this.typeShape = typeShape;
    }

    @Override
    public String toString() {
        return typeShape;
    }

}
