import java.util.logging.Level;
import java.util.logging.Logger;
import utfpr.ct.dainf.if62c.pratica.Matriz;
import utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException;
import utfpr.ct.dainf.if62c.pratica.MatrizesIncompativeisException;
import utfpr.ct.dainf.if62c.pratica.ProdMatrizesIncompativeisException;
import utfpr.ct.dainf.if62c.pratica.SomaMatrizesIncompativeisException;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica51 {

    public static void main(String[] args){
        
        Matriz m1 = null;
        try {
            m1 = new Matriz(0, 1);
        } catch (MatrizInvalidaException ex) {
        }
        Matriz m2 = null;
        try {
            m2 = new Matriz(-1, 1);
        } catch (MatrizInvalidaException ex) {

        }
        Matriz m3 = null;
        try {
            m3 = new Matriz(2, 3);
        } catch (MatrizInvalidaException ex) {

        }
        Matriz m4 = null;
        try {
            m4 = new Matriz(2, 3);
        } catch (MatrizInvalidaException ex) {

        }
        Matriz m5 = null;
        try {
            m5 = new Matriz(4, 5);
        } catch (MatrizInvalidaException ex) {

        }
        Matriz m6 = null;
        try {
            m6 = new Matriz(5, 3);
        } catch (MatrizInvalidaException ex) {

        }
        
        if (m1 != null && m2 != null) {
            try {
                System.out.println("\n soma m1 + m2\n"+m1.soma(m2));
            } catch (MatrizesIncompativeisException ex) {
//                System.out.println("Erro: " + ex.getMessage());
                
            }
        }
        
        if (m3 != null && m4 != null) {
            try {
                System.out.println("\nsoma m3 + m4\n"+m3.soma(m4));
            } catch (SomaMatrizesIncompativeisException ex) {
                
            }
        }
        
        if (m3 != null && m5 != null){
            try {
                System.out.println("\nsoma m3 + m5"+m3.soma(m5));
            } catch (SomaMatrizesIncompativeisException ex) {

            }
        }
        
        if (m3 != null && m4 != null) {
            try {
                System.out.println("Multiplicação m3 * m4\n"+m3.prod(m4));
            } catch (MatrizesIncompativeisException ex) {
                //
                //JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                System.out.println("Erro: " + ex.getMessage());
                //Logger.getLogger(Pratica51.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (m5 != null && m6 != null) {
            try {
                System.out.println("Multiplicação m5 * m6\n"+m5.prod(m6));
            } catch (ProdMatrizesIncompativeisException ex) {
                Logger.getLogger(Pratica51.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}