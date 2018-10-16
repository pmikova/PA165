package cz.muni.fi.pa165.currency;

import java.math.BigDecimal;
import java.util.Currency;


/**
 * This is base implementation of {@link CurrencyConvertor}.
 *
 * @author petr.adamek@embedit.cz
 */
public class CurrencyConvertorImpl implements CurrencyConvertor {

    private final ExchangeRateTable exchangeRateTable;
    //private final Logger logger = LoggerFactory.getLogger(CurrencyConvertorImpl.class);

    public CurrencyConvertorImpl(ExchangeRateTable exchangeRateTable) {
        this.exchangeRateTable = exchangeRateTable;
    }

    @Override
    public BigDecimal convert(Currency sourceCurrency, Currency targetCurrency, BigDecimal sourceAmount) {
        ExchangeRateTable exchangeRateTable = new ExchangeRateTable() {
            @Override
            public BigDecimal getExchangeRate(Currency sourceCurrency, Currency targetCurrency) throws ExternalServiceFailureException {
                if (sourceCurrency.equals(null) || targetCurrency.equals(null)){
                    throw new ExternalServiceFailureException("Null arguments!!!!!!");
                }
                else{
                return new BigDecimal(1);
            }
            }

        };
        return exchangeRateTable.getExchangeRate(sourceCurrency, targetCurrency).multiply(sourceAmount);
    }

}
