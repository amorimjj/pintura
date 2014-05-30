/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pintura;

import weka.classifiers.lazy.IBk;
import weka.core.Instance;

/**
 *
 * @author Jeferson Amorim <amorimjj@gmail.com>
 */
class Analizador {
    protected DatabaseReader reader;
    
    Analizador(DatabaseReader reader)
    {
        this.reader = reader;
    }
    
    private double classificar(Instance analizado) throws Exception
    {
        IBk knn = new IBk(3);
        knn.buildClassifier(reader.data);
        return knn.classifyInstance(analizado);
    }
    
    protected int analizar(double reparo, int espessura, double adesao) throws Exception
    {
        Instance analizado = new Instance(3);
        analizado.setDataset(reader.data);
        analizado.setValue(0, reparo);
        analizado.setValue(1, espessura);
        analizado.setValue(2, adesao);
        return (int) classificar(analizado);
    }
}
