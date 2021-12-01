package org.acme.logistics;

import org.acme.commons.Present;

import java.util.List;

public interface SleighLoader {

    void packSleigh(Sleigh sleigh, List<Present> presents);

}
