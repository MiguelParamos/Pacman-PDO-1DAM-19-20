/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author cenec
 */
public class Bolita extends Elemento {
    private boolean tipoBola;

    
    public boolean isTipoBola() {
        return tipoBola;
    }

    public void setTipoBola(boolean tipoBola) {
        this.tipoBola = tipoBola;
    }

    public Bolita(int x,int y,boolean tipoBola) {
        super(x,y,'•');
        this.tipoBola = tipoBola;
        
    }

    public int sumarPuntos()
   
    
}
