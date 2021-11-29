package santa.claus.delivery;

public class ToyMachine {

    public Toy createToy() {
        return new Toy( Math.random() * 500);
    }

}
