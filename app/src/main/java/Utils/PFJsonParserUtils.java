package Utils;

import com.google.gson.JsonElement;

import retrofit2.Response;

/**
 * Created by christophercoverdale on 05/11/2017.
 */

public class PFJsonParserUtils
{
    private PFJsonParserUtils() {}

    public static double parseCoinBaseJson(Response<JsonElement> response)
    {
        JsonElement data = response.body().getAsJsonObject().get("data");
        String amount = data.getAsJsonObject().get("amount").toString().replaceAll("^\"|\"$", "");

        double USDPrice = Double.valueOf(amount);

        return USDPrice;
    }
}
