package CustomClasses.Exchanges;

import CustomClasses.Coins.Bitcoin;

/**
 * Created by christophercoverdale on 03/11/2017.
 */

public class Coinbase extends Exchange
{
    public Coinbase()
    {
        this.initSuperClassCoins();
        this.exchangeName = "Coinbase";
        this.URL = String.format("https://api.coinbase.com/v2/prices/%s-USD/spot", bitcoin.ticker);
        this.header = "Authorization: Bearer abd90df5f27a7b170cd775abf89d632b350b7c1c9d53e08b340cd9832ce52c2c";
    }

    private void initSuperClassCoins()
    {
        this.bitcoin = new Bitcoin();
        this.coins.add(this.bitcoin.id, this.bitcoin);
    }


    @Override
    public String getUpdatedPrice(int coinID) {
        return null;
    }
}
