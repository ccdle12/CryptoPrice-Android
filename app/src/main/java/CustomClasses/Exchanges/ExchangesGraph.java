package CustomClasses.Exchanges;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by christophercoverdale on 03/11/2017.
 */

public class ExchangesGraph
{
    private static ExchangesGraph instance = null;
    private static HashMap<String, Exchange> exchangesTable;
    public static ArrayList<Exchange> exchangesArrayList;


    private ExchangesGraph() {}

    public static ExchangesGraph instanceOfExchangesGraph()
    {
        if (instance == null)
        {
            instance = new ExchangesGraph();
            exchangesTable = new HashMap<>();
            exchangesArrayList = new ArrayList<>();

            initAllExchanges();
        }

        return instance;
    }


    private static void initAllExchanges()
    {
        Coinbase coinbase = new Coinbase();

        exchangesArrayList.add(coinbase);
        exchangesTable.put(coinbase.exchangeName, coinbase);
    }


    public Exchange getExchange(String exchange)
    {
        return exchangesTable.get(exchange);
    }

    public boolean containsExchange(String exchange)
    {
        return exchangesTable.containsKey(exchange);
    }

}
