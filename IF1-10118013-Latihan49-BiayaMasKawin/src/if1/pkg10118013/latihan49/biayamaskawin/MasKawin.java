/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan49.biayamaskawin;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Rifian
 */
public class MasKawin {
    private final double mahar = 15.7;  
    private final double harga = 570000;

    public double getMahar() {
        return mahar;
    }

    public double getHarga() {
        return harga;
    }
    
    public double hargaMahar(){
        return mahar * harga;
    }
    public void tampilMahar(){
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        rupiah.setDecimalFormatSymbols(formatRp);
        
        System.out.println("Jumlah Emas : " + getMahar() + " gram");
        System.out.printf("Harga Emas : %s%n",rupiah.format(getHarga())+" /gram");
        System.out.printf("Total Harga : %s%n" , rupiah.format(hargaMahar()));
    }
}
