package CustomClasses.Exchanges;

import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by christophercoverdale on 05/11/2017.
 */

public interface CoinbaseApiService
{
    @GET("v2/prices/{coin}-USD/spot/")
    Call<JsonElement> updatePrices(@Path("coin") String coin);
}
