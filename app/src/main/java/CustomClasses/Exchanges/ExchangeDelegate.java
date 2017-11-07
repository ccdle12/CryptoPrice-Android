package CustomClasses.Exchanges;

/**
 * Created by christophercoverdale on 05/11/2017.
 */

public interface ExchangeDelegate
{
    void exchangeStateHasChanged(String exchange, int coinID);
}
