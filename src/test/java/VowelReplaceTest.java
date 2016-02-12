import org.junit.*;
import static org.junit.Assert.*;

public class VowelReplaceTest {

  @Test
  public void replaceTheVowel_stringInputByUser_vowelsReplacedWithDashes() {
    VowelReplace vowelReplace = new VowelReplace();
     assertEquals("- m-n, - pl-n, - c-n-l: -lf-nz.", vowelReplace.replaceTheVowels("A man, a plan, a canal: Alfonz."));
  }

}
