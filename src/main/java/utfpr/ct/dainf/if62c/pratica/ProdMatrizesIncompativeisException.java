/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Fernando
 */
public class ProdMatrizesIncompativeisException extends MatrizesIncompativeisException {
    
    public ProdMatrizesIncompativeisException(Matriz m1, Matriz m2){
        super("Multiplicação", m1, m2);
    }
}
