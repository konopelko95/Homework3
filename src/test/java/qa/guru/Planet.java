package qa.guru;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;



public class Planet {

    static Interior i = new Interior();
    static Shell s = new Shell();

    public static void main() {
        s.setExosphere(10000);
        s.setMesosphere(690);
        s.setMesosphere(85);
        s.setStratosphere(50);
        s.setTroposhere(20);

        i.setCrust(140);
        i.setRigidMantle(660);
        i.setStifferMantle(2885);
        i.setOuterCore(5155);
        i.setInnerCore(6370);
    }
}
