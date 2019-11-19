/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author CltControl
 */
public class Cliente implements Payments{

    @Override
    public void pay(String method, Book book) {
             if(method == "card") {
			pay_card("numberCard", book);
		}else if ( method == "cash") {
			pay_cash( "money", book);
		}else if ( method == "pal") {
			pay_pal( "numberPaypal", book);
                }
    }

    @Override
    public void pay_card(String card, Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pay_cash(String money, Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pay_pal(String pal, Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
