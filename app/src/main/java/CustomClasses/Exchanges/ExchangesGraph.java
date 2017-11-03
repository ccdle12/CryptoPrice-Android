package CustomClasses.Exchanges;
import java.util.HashMap;

/**
 * Created by christophercoverdale on 03/11/2017.
 */

public class ExchangesGraph
{
    private static ExchangesGraph instance = null;
    private static HashMap<String, Exchange> exchangesTable;


    private ExchangesGraph() {}

    public static ExchangesGraph instanceOfExchangesGraph()
    {
        if (instance == null)
        {
            instance = new ExchangesGraph();
            exchangesTable = new HashMap<>();
            initAllExchanges();
        }

        return instance;
    }


    private static void initAllExchanges()
    {
        Coinbase coinbase = new Coinbase();
        exchangesTable.put(coinbase.exchangeName, coinbase);
    }


    public Exchange getExchange(String exchange)
    {
        return exchangesTable.get(exchange);
    }

}
