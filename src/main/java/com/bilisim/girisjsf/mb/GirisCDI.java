
package com.bilisim.girisjsf.mb;

import com.bilisim.personelweb.dao.GirisDAO;
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
        boolean sonuc = GirisDAO.giriseYetkilimi(kullanici, sifre);
        if (sonuc) {
            return "menu.xhtml";
            
        } else {
            return "giris.xhtml";
        }
    
    
    
    }
    
    
}
