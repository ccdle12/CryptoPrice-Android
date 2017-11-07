package CustomClasses.Exchanges;

import java.util.ArrayList;

import CustomClasses.Coins.Bitcoin;
import CustomClasses.Coins.CryptoCurrency;
import CustomClasses.Coins.Ethereum;
import CustomClasses.Coins.Litecoin;

/**
 * Created by christophercoverdale on 03/11/2017.
 */

public abstract class Exchange implements ExchangeUpdateState
{

    public String exchangeName;
    public int coinCount = 3;

    public Bitcoin bitcoin;
    public Litecoin litecoin;
    public Ethereum ethereum;

    ExchangeDelegate exchangeDelegate;

    public ArrayList<CryptoCurrency> coins = new ArrayList<>();

    public void setDelegate(ExchangeDelegate exchangeDelegate)
    {
        this.exchangeDelegate = exchangeDelegate;
    }
}
