import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class PaperReamShopTest {

    @Test
    public void should_display_message() {
        new PaperReamShop();
    }

    @Test
    public void should_compute_price_for_france() {
        assertThat(new PaperReamShop().totalPrice(30d)).isEqualTo(36d);
    }

    @Test
    public void should_compute_another_price_for_france() {
        assertThat(new PaperReamShop().totalPrice(10d)).isEqualTo(12d);
    }

    @Test
    public void should_compute_price_given_the_tax_amount() {
        assertThat(new PaperReamShop().totalPrice(10d, .20)).isEqualTo(12d);
    }

    @Test
    public void should_compute_price_given_one_country_code() {
        assertThat(new PaperReamShop().totalPrice(20d, CountryCode.FR)).isEqualTo(24d);
    }

    @Test
    public void should_compute_price_given_IT_country_code() {
        assertThat(new PaperReamShop().totalPrice(20d, CountryCode.IT)).isEqualTo(24.4d);
    }

    @Test
    public void should_compute_price_given_PL_country_code() {
        assertThat(new PaperReamShop().totalPrice(20d, CountryCode.PL)).isEqualTo(24.6d);
    }

    @Test
    public void should_compute_price_given_other_country_code() {
        assertThat(new PaperReamShop().totalPrice(20d, CountryCode.ES)).isEqualTo(24.2d);
    }

    @Test
    public void should_compute_price_with_number_of_ream() {
        assertThat(new PaperReamShop().totalPrice(10, 20d, CountryCode.ES)).isEqualTo(242d);
    }

    @Test
    public void should_compute_reduce() {
        assertThat(new PaperReamShop().totalPrice(200, 20d, CountryCode.ES)).isEqualTo(4598d);
    }

    @Test
    public void should_compute_reduce_over_400() {
        assertThat(new PaperReamShop().totalPrice(400, 20d, CountryCode.ES)).isEqualTo(9002.4d);
    }

}
