package code401Challenges.LeftJoin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void testLeftJoin(){
        LeftJoin leftJoin = new LeftJoin();
        HashMap<String, String> one = new HashMap<>();
        HashMap<String, String> two = new HashMap<>();
        one.put("fond", "enamored");
        one.put("wrath", "anger");
        one.put("diligent", "employed");
        one.put("outfit", "garb");
        one.put("guide", "usher");
        two.put("fond", "averse");
        two.put("wrath", "delight");
        two.put("diligent", "idle");
        two.put("guide", "follow");
        two.put("flow", "jam");
        ArrayList<Object> expecedOutput = new ArrayList<Object>();
        expecedOutput.add(new ArrayList<String>(Arrays.asList("diligent", "employed", "idle")));
        expecedOutput.add(new ArrayList<String>(Arrays.asList("outfit", "garb", null)));
        expecedOutput.add(new ArrayList<String>(Arrays.asList("wrath", "anger", "delight")));
        expecedOutput.add(new ArrayList<String>(Arrays.asList("guide", "usher", "follow")));
        expecedOutput.add(new ArrayList<String>(Arrays.asList("fond", "enamored", "averse")));
        assertEquals(expecedOutput, leftJoin.joinHashMaps(one, two));
    }

}