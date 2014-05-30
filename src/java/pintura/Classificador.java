/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pintura;

/**
 *
 * @author Jeferson Amorim <amorimjj@gmail.com>
 */
public class Classificador {
    
    private static final String[] classes = {"Microreparo", "Reparo", "Repintura", "Rejateamento"};
    
    public static String classificar(double reparo, int espessura, double adesao) throws Exception
    {
        DatabaseReader database = new DatabaseReader();
        Analizador analizador = new Analizador(database);
        int classe = analizador.analizar(reparo, espessura, adesao);
        return classes[classe];
    }
    
}
