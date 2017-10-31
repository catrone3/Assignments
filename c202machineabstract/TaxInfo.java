/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c202machineabstract;

/**
 *
 * @author wschottl
 */
public interface TaxInfo {
    final double BASIC_TAX = .03;
    final double LUXURY_TAX = .08;
    
    public double calcTax();
    
}
