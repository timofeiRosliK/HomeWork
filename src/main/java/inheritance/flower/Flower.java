package inheritance.flower;

public class Flower {
    protected String name;
    protected Bud bud;


    public Flower(String name, Bud bud) {
        this.bud = bud;
        this.name = name;

    }

    public void flowerBloom() {
        for (int i = 0; i < bud.petals.length; i++) {
            if (bud.petals[i].shape != null) {
                System.out.println(bud.petals[i].shape);
            }else{
                System.out.println("Flower was not bloomed");
            }
        }

    }

        public void flowerWilt() {
            if (bud.color == Color.BLACK) {
                System.out.println("Wilted flower");
            }else {
                System.out.println("Flower was not wilted");
            }
        }

        public void colorBud() {
            System.out.println("Color bud is " + bud.color);
        }


    }


