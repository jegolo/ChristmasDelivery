package santa.claus.delivery;

public class ToyWrapper {

    public Package wrapToy(Toy toy) {
        return new Package(toy, Color.values()[(int) Math.round(Math.random() * (Color.values().length - 1))]);
    }
}
