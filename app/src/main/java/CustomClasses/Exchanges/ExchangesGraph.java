package CustomClasses.Exchanges;
import java.util.HashMap;

/**
 * Created by christophercoverdale on 03/11/2017.
 */

public class ExchangesGraph
{
    private HashMap<String, Exchange> exchangesTable;

    public ExchangesGraph()
    {
        this.exchangesTable = new HashMap<String, Exchange>();
        this.initAllExchanges();

    }

    private void initAllExchanges()
    {
        Coinbase coinbase = new Coinbase();
        this.exchangesTable.put(coinbase.exchangeName, coinbase);
    }

    public Exchange getExchange(String exchange)
    {
        return this.exchangesTable.get(exchange);
    }

}
