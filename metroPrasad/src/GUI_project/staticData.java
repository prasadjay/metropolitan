/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_project;

/**
 *
 * @author PRASAD
 */
public class staticData{
    
    private static String tempData="";
    
     
    staticData()
    {}
    
    public static String getTempProjectData()
    {
        return tempData;
    }
    
    public static void setTempProjectData(String temp)
    {
        tempData = temp;
    }
}

