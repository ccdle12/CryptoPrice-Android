package CustomClasses;

/**
 * Created by christophercoverdale on 03/11/2017.
 */

public class Bitcoin extends CryptoCurrency
{
    public Bitcoin(double price)
    {
        this.USDPrice = price;
        this.ticker = "BTC";
    }
}
