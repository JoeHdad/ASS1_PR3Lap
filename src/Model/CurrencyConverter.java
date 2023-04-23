/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class CurrencyConverter {
    private double usdToNisRate;
    
    public CurrencyConverter(double rate) {
        this.usdToNisRate = rate;
    }
    
    public double convertUsdToNis(double amount) {
        return amount * usdToNisRate;
    }
}
