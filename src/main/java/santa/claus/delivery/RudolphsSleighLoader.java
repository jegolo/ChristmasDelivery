package santa.claus.delivery;

import org.acme.commons.Present;
import org.acme.logistics.Sleigh;
import org.acme.logistics.SleighLoader;

import java.util.List;

public class RudolphsSleighLoader implements SleighLoader {

    @Override
    public List<Present> packSleigh(Sleigh s, List<Present> pl) {
        var i = pl.iterator();
        do {
            var p = i.next();
            try {
                s.pack(p);
            } catch (Exception e) {
                // Grrh!!
            }
        } while (i.hasNext());
        return null;
    }

}
