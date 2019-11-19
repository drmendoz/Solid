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
public interface Payments {
    
        void pay(String method, Book book) ;
		
		
	 void pay_card(String card, Book book);
		/*
		 * change state to true
		 */
		
	 void pay_cash(String money, Book book) ;
		/*
		 * change state to true
		 */	
        
         void pay_pal(String pal, Book book) ;
		/*
		 * change state to true
		 */
	
}
