/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pintura;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Jeferson Amorim <amorimjj@gmail.com>
 */
public class RequestHelper {
    
    public static double getParameterFromRequest(HttpServletRequest request, String key)
    {
        if ( request.getParameter(key) != null )
            return Double.parseDouble(request.getParameter(key));
        
        return -1;
    }
    
}
