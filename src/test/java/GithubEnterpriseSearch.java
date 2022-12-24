import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class GithubEnterpriseSearch {
    @Test
    void selenideHomework2() {
        //открыть Github
        open("https://github.com");
        //выбрать меню Solutions
        $(".Header-old").$(byText("Solutions")).hover();
        //нажать Enterprise
        $(".Header-old").$(byText("Enterprise")).click();
        //проверить заголвок "Build like the best"
        $(".application-main").shouldHave(text("Build like the best"));

    }
}
