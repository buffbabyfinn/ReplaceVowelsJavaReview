import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class VowelReplace {
  public static void main( String[] args ) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
        HashMap model = new HashMap();
        model.put("template", "templates/hello.vtl" );

        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());
    };

    get("/replaced", (request, response) -> {
        HashMap model = new HashMap();
        model.put("template", "templates/replaced.vtl" );

        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());
    };
  }
}
