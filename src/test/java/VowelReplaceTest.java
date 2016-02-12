import org.junit.*;
import static org.junit.Assert.*;

public class VowelReplaceTest {

  @Test
  public void replaceTheVowel_stringInputByUser_vowelsReplacedWithDashes() {
    VowelReplace vowelReplace = new VowelReplace();
     assertEquals(true, vowelReplace.replaceTheVowels("vowels"));
  }

}
