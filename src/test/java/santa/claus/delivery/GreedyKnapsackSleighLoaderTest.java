package santa.claus.delivery;

import org.acme.commons.Present;
import org.acme.logistics.Sleigh;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GreedyKnapsackSleighLoaderTest {

    @Test
    public void testKnapsack() {
        //GIVEN
        var presents = List.of(
                new Present(5,8),
                new Present( 5, 8),
                new Present( 15, 20),
                new Present(15, 17),
                new Present(10, 10),
                new Present(6, 6),
                new Present(12, 10),
                new Present(30, 20),
                new Present(8, 5),
                new Present(11, 5)
        );
        var loader = new GreedyKnapsackSleighLoader();
        var sleigh = new Sleigh(30);
        //WHEN
        var rest = loader.packSleigh(sleigh, presents);
        //THEN
        assertEquals(3, sleigh.getPresents().size() );
        assertEquals( 7, rest.size());
        assertEquals( 36, sleigh.getPresents().stream().mapToInt(Present::value).sum());
    }

}