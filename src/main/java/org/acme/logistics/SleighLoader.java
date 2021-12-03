package org.acme.logistics;

import org.acme.commons.Present;

import java.util.List;

public interface SleighLoader {

    /**
     * Pack presents on sleigh.
     * @param sleigh the sleigh.
     * @param presents the presents which must carried
     * @return the rest which doesn't fit on the sleigh.
     */
    List<Present> packSleigh(Sleigh sleigh, List<Present> presents);

}
