package santa.claus.delivery;

import static java.lang.Thread.sleep;

public class Elve implements Runnable {

    private final Sleight sleight;
    public boolean free;
    private Toy toy;
    private final ToyWrapper toyWrapper;

    public Elve(ToyWrapper wrapper, Sleight sleight) {
        this.toyWrapper = wrapper;
        this.sleight = sleight;
        this.free = true;
    }

    public synchronized void setToy(Toy toy) {
        this.toy = toy;
        free = false;
    }


    public void run() {
        while (sleight.hasCapacity()) {
            if (toy != null) {
                System.out.println("Add Toy");
                var wrappedToy = toyWrapper.wrapToy(toy);
                sleight.add(wrappedToy);
                toy = null;
                free = true;
            }
        }
    }


}
