package santa.claus.delivery;

import org.acme.commons.Present;
import org.acme.logistics.OverweightException;
import org.acme.logistics.Sleigh;
import org.acme.logistics.SleighLoader;

import java.util.List;

public class GreedyKnapsackSleighLoader implements SleighLoader {
    @Override
    public List<Present> packSleigh(Sleigh sleigh, List<Present> presents) {
        return presents.stream().sorted(
                (x,y) -> ratePresent(x) <= ratePresent(y)?1:-1
        ).filter(
               present -> {
                   var result = true;
                   if (present.weight() <= sleigh.restCapacity()) {
                       sleigh.pack(present);
                       result=false;
                   }
                   return result;
               }
        ).toList();
    }

    private float ratePresent(Present present){
        return present.value() / present.weight();
    }



}
