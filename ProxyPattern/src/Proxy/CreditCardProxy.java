/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;
public class CreditCardProxy implements Payment {
    
    private CreditCard creditCard;
    private Validation valid;
    
    public CreditCardProxy (Validation valid){
        this.valid = valid;
        creditCard = new CreditCard();
    }
    
    public void pay(){
        if(valid.isChecked())
        {
            creditCard.pay();
        }else{
            System.out.println("Transaction is Fail!");
        }
    }
}