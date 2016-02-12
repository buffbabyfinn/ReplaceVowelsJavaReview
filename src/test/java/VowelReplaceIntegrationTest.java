import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class VowelReplaceIntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
    public void checkVowelReplace() {
      goTo("http://localhost:4567");
      fill("#userString").with("The quick brown fox jumps over the lazy dog.");
      submit(".btn");
      assertThat(pageSource()).contains("Th- q--ck br-wn f-x j-mps -v-r th- l-zy d-g.");
    }


}
