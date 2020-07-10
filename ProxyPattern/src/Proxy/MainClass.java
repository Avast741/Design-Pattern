/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;
import java.lang.reflect.Proxy;

public class MainClass {
    public static void main(String[] args){
        
        //If the transaction succeed
        boolean check = true;
        Validation validAccount = new Validation(check);
        CreditCardProxy proxyCC = new CreditCardProxy(validAccount);
        System.out.println("If the account valid : ");
        proxyCC.pay();
        
        System.out.println("_________________________________________");
        
        //If the transaction fail
        boolean check2 = false;
        Validation validAccount2 = new Validation(check2);
        CreditCardProxy proxyCC2 = new CreditCardProxy(validAccount2);
        System.out.println("If the account non valid : ");
        proxyCC2.pay();
    }
}