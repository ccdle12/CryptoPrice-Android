package CustomClasses.Exchanges;

import java.util.ArrayList;

import CustomClasses.Coins.Bitcoin;
import CustomClasses.Coins.CryptoCurrency;

/**
 * Created by christophercoverdale on 03/11/2017.
 */

public abstract class Exchange implements CoinPriceUpdate
{
    String exchangeName;
    String URL;
    String header;

    public Bitcoin bitcoin;

    ArrayList<CryptoCurrency> coins = new ArrayList<>();
}
