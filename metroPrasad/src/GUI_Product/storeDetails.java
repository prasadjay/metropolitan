/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Product;

/**
 *
 * @author PRASAD
 */
public class storeDetails {
    
    private static String detailedProduct = " ";
    
    storeDetails()
    {}
    
    public static String getDetailedProduct()
    {
        return detailedProduct;
    }
    
    public static void setDetailedProduct(String temp)
    {
        detailedProduct = temp;
    }
    
}
