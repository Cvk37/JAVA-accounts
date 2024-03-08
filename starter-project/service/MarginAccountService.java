package service;
import pojo.MarginAccount;
import repository.TradeAccountRepository;

import java.math.BigDecimal;

public class MarginAccountService implements TradeAccountService{

 public MarginAccountService(TradeAccountRepository trade){
   this.trade = trade;
 }

 private TradeAccountRepository trade;
 @Override
 public void deposit(String id, BigDecimal amount) {
  MarginAccount account = this.retrieveTradeAccount(id);
  account.setMargin(account.getMargin().add(amount));
  updateTradeAccount(account);
 }

 public void withdraw(String id,BigDecimal amount){
  MarginAccount account = this.retrieveTradeAccount(id);
  account.setMargin(account.getMargin().subtract(amount));
  updateTradeAccount(account);
 }
 public void createTradeAccount(MarginAccount account){
  this.trade.createTradeAccount(account);
 }
 public MarginAccount retrieveTradeAccount(String id){
  return (MarginAccount) this.trade.retrieveTradeAccount(id);
 }
 public void updateTradeAccount(MarginAccount account){
  this.trade.updateTradeAccount(account);
 }
 public void deleteTradeAccount(String id){
  this.trade.deleteTradeAccount(id);
 }

}