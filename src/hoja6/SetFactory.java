/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja6;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
/**
 *
 * @author Diego Jacobs
 */
public class SetFactory {
    
    public Set GetSet (Integer op)
    {
        if (op == 1)
            return new HashSet();
        if (op == 2)
            return new TreeSet();
        if (op == 2)
            return new LinkedHashSet();
        else 
            return null;
    }
    
    
}
