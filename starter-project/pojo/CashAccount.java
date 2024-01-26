package pojo;

import java.math.BigDecimal;

public class CashAccount extends TradeAccount {
    
    private BigDecimal cashBalance;
    
public CashAccount(String id, BigDecimal cashBalance) {
        super(id);  // Calling the superclass constructor with the 'id' parameter
        this.cashBalance = cashBalance;
    }

public BigDecimal getCashBalance(){
  return this.cashBalance;
}

public void setCashBalance(BigDecimal cashBalance){
   this.cashBalance = cashBalance;
}

@Override 
public CashAccount Clone(){
    return new CashAccount(super.getId(), this.cashBalance);

}

}
