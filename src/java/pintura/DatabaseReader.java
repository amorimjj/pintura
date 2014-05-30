/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pintura;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import weka.core.Instances;

/**
 *
 * @author Jeferson Amorim <amorimjj@gmail.com>
 */
class DatabaseReader {
    
    protected final String dataBaseFile = "/Users/amorimjj/devel/PinturaWeka/src/java/pintura/pintura.arff";   

    protected Instances data;
    
    DatabaseReader() throws IOException {
        FileReader arffFile = new FileReader(dataBaseFile);
        data = new Instances(arffFile);
        data.setClassIndex(3);
    }
    
}
