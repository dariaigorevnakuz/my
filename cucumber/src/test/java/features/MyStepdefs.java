package features;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import org.junit.Assert;

import java.math.BigDecimal;

public class MyStepdefs {

    private static BigDecimal cash = new BigDecimal(120_000);

        @Дано("^на счете пользователя имеется (\\d+) рублей$")
                public void first(int arg0) {
            Assert.assertEquals(0, cash.compareTo(new BigDecimal(arg0)));
        }

        @Когда("^пользователь снимает со счета (\\d+) рублей$")
        public void second(int arg0) {
            cash = cash.subtract(new BigDecimal(arg0));
        }
}
