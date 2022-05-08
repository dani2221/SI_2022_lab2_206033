import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;


public class SILab2Test {
    @Test
    public void statementsTest() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(new LinkedList<>()));
        assertTrue(ex.getMessage().contains("greater than 0"));
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList(new String[]{"0", "0", "0"})));
        assertTrue(ex.getMessage().contains("perfect square"));
        assertEquals(Arrays.asList(new String[]{"#","#","2","#","4","#","2","#","2"}),SILab2.function(Arrays.asList(new String[]{"#","#","0","#","0","#","0","#","0"})));
    }

    @Test
    public void branchesTest() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(new LinkedList<>()));
        assertTrue(ex.getMessage().contains("greater than 0"));
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList(new String[]{"0", "0", "0"})));
        assertTrue(ex.getMessage().contains("perfect square"));
        assertEquals(Arrays.asList(new String[]{"#","#","2","#","4","#","2","#","2"}),SILab2.function(Arrays.asList(new String[]{"#","#","0","#","0","#","0","#","0"})));
        assertEquals(Arrays.asList(new String[]{"0","0","0","0","0","0","0","0","0"}),SILab2.function(Arrays.asList(new String[]{"0","0","0","0","0","0","0","0","0"})));
    }
}
