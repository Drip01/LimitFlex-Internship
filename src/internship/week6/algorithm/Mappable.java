package internship.week6.algorithm;

enum Geometry {LINE, POINT, POLYGON};
enum Color {BLACK, BLUE, GREEN, ORANGE, RED};
enum PointMarker {CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE};
enum LineMarker {DASHED, DOTTED, SOLID};

public interface Mappable {

    String DRIP_PROPERTY = """
             "properties": {%s} """;

    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toDRIP() {

        return """
                type: "%s", "label": " %s", "marker": "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable) {
        System.out.println(DRIP_PROPERTY.formatted(mappable.toDRIP()));
    }
}
