package service;

import java.math.BigDecimal;

import pojo.CashAccount;

import repository.TradeAccountRepository;

public class CashAccountService implements TradeAccountService {

    private TradeAccountRepository trade;

    // Inject the TradeAccountRepository instance
    public CashAccountService(TradeAccountRepository trade) {
        this.trade = trade;
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        CashAccount account = this.retrieveTradeAccount(id);
        account.setCashBalance(account.getCashBalance().add(amount));
        updateTradeAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        // Implement withdrawal logic here
        CashAccount account = this.retrieveTradeAccount(id);
        account.setCashBalance(account.getCashBalance().subtract(amount));
        updateTradeAccount(account);

    }

  
     public void createTradeAccount(CashAccount account){
        this.trade.createTradeAccount(account);
     }
     
     public CashAccount retrieveTradeAccount(String id){
     return (CashAccount)this.trade.retrieveTradeAccount(id);
     }
     
     
    // update the account
    public void updateTradeAccount(CashAccount account) {
        this.trade.updateTradeAccount(account);
    }
    
    public void deleteTradeAccount(String id ){
}
}