
package com.bilisim.girisjsf.mb;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "girisCDI")
@RequestScoped
public class GirisCDI {
    
    private String  kullanici;
    private String  sifre;
    
    public GirisCDI() {
    }

    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    public String girisKontrol()
    {
    
    
    return "menu.xhtml";
    }
    
    
}
