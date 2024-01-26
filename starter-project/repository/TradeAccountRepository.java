package repository;

import java.util.HashMap;
import java.util.Map;

import pojo.TradeAccount;

public class TradeAccountRepository {
     private Map<String, TradeAccount> datastore = new HashMap<>();



public void createTradeAccount(TradeAccount TradeAccount){
   datastore.put(TradeAccount.getId(), TradeAccount.Clone());

}
public TradeAccount retrieveTradeAccount(String id){
   return this.datastore.get(id).Clone();
}

public void updateTradeAccount(TradeAccount TradeAccount){
datastore.put(TradeAccount.getId(), TradeAccount.Clone());
}

public void deleteTradeAccount(String id){
  this.datastore.remove(id);
}
}