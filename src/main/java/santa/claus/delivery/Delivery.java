package santa.claus.delivery;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Delivery {



    private Sleight sleight = new Sleight();
    private ToyMachine tm = new ToyMachine();
    private ToyWrapper tw = new ToyWrapper();
    private List<Elve> e = List.of(new Elve(tw, sleight));

    public Delivery() {
        e.stream().forEach(x -> {
            Thread t = new Thread(x);
            t.start();
        });
    }

    public void delivery() {

        //Parell Stream
        while (sleight.hasCapacity()) {
           Elve e1 = null;
           do {
               var i = e.iterator();
               //var e1 = e.stream().filter(e -> e.free).findFirst();
               while (i.hasNext()) {
                   var e = i.next();
                   if (e.free) {
                       e1 = e;
                   }
               }
           } while (e1 == null);
           e1.setToy(tm.createToy());
           System.out.println(sleight.getCurrentWeight());
       }
    }

    public static void main(String[] args) {
        var d = new Delivery();
        d.delivery();
    }

}
