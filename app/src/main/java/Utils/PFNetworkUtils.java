package Utils;


import com.google.gson.JsonElement;

import CustomClasses.Exchanges.CoinbaseApiService;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by christophercoverdale on 04/11/2017.
 */

public final class PFNetworkUtils
{

    private PFNetworkUtils() {}


    public static Call<JsonElement> getUpdatedPriceCoinBase(String tickerSymbol)
    {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.coinbase.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CoinbaseApiService service = retrofit.create(CoinbaseApiService.class);
        Call<JsonElement> call = service.updatePrices(tickerSymbol);

        return call;
    }
}
