package santa.claus.delivery;

import java.util.List;

public class RudolphsSleighLoader implements SleighLoader {

    @Override
    public void packSleigh(Sleigh s, List<Present> pl) {
        var i = pl.iterator();
        do {
            var p = i.next();
            try {
                s.pack(p);
            } catch (Exception e) {
                // Grrh!!
            }
        } while (i.hasNext());
    }

}
