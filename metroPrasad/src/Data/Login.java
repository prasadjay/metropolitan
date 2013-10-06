/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author TDULAJ
 */
public class Login {
    
     static String logUser="E13/1";
     static int Pre_UI_type=1;  /*       1=modern ani, 2=Classi ani, 3=modern not ani, 4=Classi not ani     */
     
    
 public static void setLogUser(String name)
     {
         logUser=name;
     }
    
     public static String getLogUser()
     {
         return(logUser);
     }
     public static void setPre_UI_typeString(int ui)
     {
         Pre_UI_type=ui;
     }
    
     public static int getPre_UI_type()
     {
         return(Pre_UI_type);
     }
}