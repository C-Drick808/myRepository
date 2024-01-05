import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

class hello{
   public static void main(String[] args) {
      assertThat(new DecimalFormat("", new DecimalFormatSymbols(Locale.ENGLISH))
                .parse("1234567.89"))
                .isEqualTo(1234567.89);
        assertThat(new DecimalFormat("", new DecimalFormatSymbols(Locale.ITALIAN))
                .parse("1.234.567,89"))
                .isEqualTo(1234567.89);
   }
}