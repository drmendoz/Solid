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
public class Book extends Articulo {
    String title;
	String author;
	String category;
	boolean state;

    public Book(String title, String author, String category, boolean state, String nomArticulo, float precio) {
        super(nomArticulo, precio);
        this.title = title;
        this.author = author;
        this.category = category;
        this.state = state;
    }
	
	
	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}
	String getAuthor() {
		return author;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	

}
