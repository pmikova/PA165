package cz.muni.fi.pa165.currency;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;

import javax.swing.plaf.ColorUIResource;
import java.math.BigDecimal;
import java.util.Currency;

public class CurrencyConvertorImplTest {

    @Test
    public void testConvert() throws ExternalServiceFailureException {
        // Don't forget to test border values and proper rounding.
        CurrencyConvertorImpl testConvertor = mock(CurrencyConvertorImpl.class);
        ExchangeRateTable table = mock(ExchangeRateTable.class);
        when(table.getExchangeRate(Currency.getInstance("USD"), Currency.getInstance("CHF"))).thenReturn(new BigDecimal("3"));
        when(table.getExchangeRate(Currency.getInstance("USD"), Currency.getInstance("CZK"))).thenReturn(new BigDecimal("22"));
        when(table.getExchangeRate(Currency.getInstance("CZK"), Currency.getInstance("CZK"))).thenReturn(new BigDecimal("1"));

        assert();

    }

    @Test
    public void testConvertWithNullSourceCurrency() {
        CurrencyConvertorImpl testConvertor = mock(CurrencyConvertorImpl.class);
        Currency currency1 = mock(Currency.class);
        Currency currency2 = null;



    }

    @Test
    public void testConvertWithNullTargetCurrency() {
        fail("Test is not implemented yet.");
    }

    @Test
    public void testConvertWithNullSourceAmount() {
        fail("Test is not implemented yet.");
    }

    @Test
    public void testConvertWithUnknownCurrency() {
        fail("Test is not implemented yet.");
    }

    @Test
    public void testConvertWithExternalServiceFailure() {
        fail("Test is not implemented yet.");
    }

}
