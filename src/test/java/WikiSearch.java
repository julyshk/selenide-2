import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class WikiSearch {

        @Test
        void selenideHomework1() {
        //открыть страницу selenide в Github
                open("https://github.com/selenide/selenide");
        // перейти в раздел Wiki
                $("#wiki-tab").click();
        //проверить, что в списке страниц (Pages) есть страница SoftAssertions
                $("#wiki-pages-box").$(byText("Show 2 more pages…")).click();
                $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        //открыть страницу SoftAssertions
                $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        //проверьте что внутри есть пример кода для JUnit5
                $(".markdown-body").shouldHave(text("JUnit5"));


        }

}