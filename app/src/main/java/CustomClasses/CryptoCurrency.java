package CustomClasses;

/**
 * Created by christophercoverdale on 03/11/2017.
 */

public abstract class CryptoCurrency
{
    public double USDPrice;
    private String ticker = "BTC";

    public String getTickerSymbol()
    {
        return this.ticker;
    }
}
