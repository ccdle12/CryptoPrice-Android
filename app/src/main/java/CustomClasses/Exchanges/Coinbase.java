package CustomClasses.Exchanges;

import com.google.gson.JsonElement;

import CustomClasses.Coins.Bitcoin;
import CustomClasses.Coins.CryptoCurrency;
import CustomClasses.Coins.Ethereum;
import CustomClasses.Coins.Litecoin;
import Utils.PFJsonParserUtils;
import Utils.PFNetworkUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by christophercoverdale on 03/11/2017.
 */

public class Coinbase extends Exchange
{

    public Coinbase()
    {
        this.initSuperClassCoins();
        this.exchangeName = "Coinbase";
    }

    private void initSuperClassCoins()
    {
        this.bitcoin = new Bitcoin();
        this.litecoin = new Litecoin();
        this.ethereum = new Ethereum();

        this.coins.add(this.bitcoin.id, this.bitcoin);
        this.coins.add(this.ethereum.id, this.ethereum);
        this.coins.add(this.litecoin.id, this.litecoin);

        this.coinCount = this.coins.size();
    }


    @Override
    public void exchangeUpdatePrice(String exchange, int coinID)
    {
        CryptoCurrency coin = this.coins.get(coinID);

        Call<JsonElement> call = PFNetworkUtils.getUpdatedPriceCoinBase(coin.ticker);
        call.enqueue(new Callback<JsonElement>()
        {
            @Override
            public void onResponse(Call<JsonElement> call, Response<JsonElement> response)
            {
                double USDPrice = PFJsonParserUtils.parseCoinBaseJson(response);
                coin.USDPrice = USDPrice;

                exchangeDelegate.exchangeStateHasChanged(exchange, coinID);
            }

            @Override
            public void onFailure(Call<JsonElement> call, Throwable t)
            {

            }
        });
    }

}
