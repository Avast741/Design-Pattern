/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;
public class Validation {
    
    private boolean checked;
    
    public Validation (final boolean checked){
        this.checked = checked;
    }
    
    public boolean isChecked(){
        return checked;
    }
    
    public void setChecked(boolean checked){
        this.checked = checked;
    }
}
