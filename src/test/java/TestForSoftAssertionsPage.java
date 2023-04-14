import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class TestForSoftAssertionsPage {
    @Test
    void testForSoftAssertionsPage() {
        // Откройте страницу Selenide в Github
        Selenide.open("https://github.com/selenide/selenide");
        // Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(".filterable-active").shouldHave(text("SoftAssertions"));
        // Откройте страницу SoftAssertions
        $(byText("SoftAssertions")).click();
        // Проверьте что внутри есть пример кода для JUnit5
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}