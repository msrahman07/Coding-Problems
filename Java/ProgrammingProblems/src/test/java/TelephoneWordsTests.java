import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import programming.problems.TelephoneWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TelephoneWordsTests {
    @Test
    @DisplayName("Example test for 23")
    public void letterCombination23() {
        TelephoneWords tw = new TelephoneWords();
        String digits = "23";
        List<String> expectedResult = new ArrayList<>
                (Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf"));
        Assertions.assertArrayEquals(expectedResult.toArray(), tw.letterCombination(digits).toArray());
    }

    @Test
    @DisplayName("Example test for 2")
    public void letterCombination2() {
        TelephoneWords tw = new TelephoneWords();
        String digits = "2";
        List<String> expectedResult = new ArrayList<>
                (Arrays.asList("a","b","c"));
        Assertions.assertArrayEquals(expectedResult.toArray(), tw.letterCombination(digits).toArray());
    }

    @Test
    @DisplayName("Example test for Empty")
    public void letterCombinationEmpty() {
        TelephoneWords tw = new TelephoneWords();
        String digits = "";
        List<String> expectedResult = new ArrayList<>
                (Arrays.asList());
        Assertions.assertArrayEquals(expectedResult.toArray(), tw.letterCombination(digits).toArray());
    }

    @Test
    @DisplayName("Example test for Empty")
    public void letterCombination2389() {
        TelephoneWords tw = new TelephoneWords();
        String digits = "2389";
        List<String> expectedResult = new ArrayList<>
                (Arrays.asList("adtw","adtx","adty","adtz","aduw","adux","aduy","aduz","advw","advx","advy","advz","aetw","aetx","aety","aetz","aeuw","aeux","aeuy","aeuz","aevw","aevx","aevy","aevz","aftw","aftx","afty","aftz","afuw","afux","afuy","afuz","afvw","afvx","afvy","afvz","bdtw","bdtx","bdty","bdtz","bduw","bdux","bduy","bduz","bdvw","bdvx","bdvy","bdvz","betw","betx","bety","betz","beuw","beux","beuy","beuz","bevw","bevx","bevy","bevz","bftw","bftx","bfty","bftz","bfuw","bfux","bfuy","bfuz","bfvw","bfvx","bfvy","bfvz","cdtw","cdtx","cdty","cdtz","cduw","cdux","cduy","cduz","cdvw","cdvx","cdvy","cdvz","cetw","cetx","cety","cetz","ceuw","ceux","ceuy","ceuz","cevw","cevx","cevy","cevz","cftw","cftx","cfty","cftz","cfuw","cfux","cfuy","cfuz","cfvw","cfvx","cfvy","cfvz"));
        Assertions.assertArrayEquals(expectedResult.toArray(), tw.letterCombination(digits).toArray());
    }
}
