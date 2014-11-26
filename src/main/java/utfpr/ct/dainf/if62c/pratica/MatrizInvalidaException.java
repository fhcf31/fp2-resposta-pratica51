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

public class MatrizInvalidaException extends Exception {
    private final int m;
    private final int n;
    
    public MatrizInvalidaException(int m, int n){
        super(String.format("A matriz de %d linhas e %d colunas não pode ser criada", 
               m, n));
        this.m = m;
        this.n = n;
    }
    
    public int getNumLinhas(){
        return m;
    }
    
    public int getNumColunas(){
        return n;
    }
    
}