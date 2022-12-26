import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;


public class SelenideDragAndDrop {
    @Test
    void selenideHomework2_2() {
        //открыть https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //Перенести прямоугольник А на место В
        //через action не работает, блоки меняют или не меняют место в зависимости от расположения курсора
        // actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(300, 0).release().perform();
        //через dragAndDrop работает всегда
        $("#column-a").dragAndDropTo("#column-b");
        //Проверить, что прямоугольники действительно поменялись
        $("#column-a header").shouldHave(text("B"));
        $("#column-b header").shouldHave(text("A"));
    }
}
