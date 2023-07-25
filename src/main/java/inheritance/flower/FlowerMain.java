package inheritance.flower;

public class FlowerMain {
    public static void main(String[] args) {
        Petal[] rose = {new Petal(Shape.STAR), new Petal(Shape.STAR)};
        Petal[] sunflower = {new Petal(), new Petal()};
        Bud roseBud = new Bud(rose, Color.RED);
        Bud sunFlowerBud = new Bud(sunflower, Color.BROWN);
        Bud wiltedFlower = new Bud(sunflower, Color.BLACK);
        Flower flower = new Flower("Rose", roseBud);
        Flower flower1 = new Flower("Sunflower",sunFlowerBud);
        Flower flower2 = new Flower("Wilted Flower", wiltedFlower);
        flower.flowerBloom();
        flower.flowerWilt();
        flower.colorBud();
        flower1.flowerBloom();
        flower2.flowerWilt();
    }

}
