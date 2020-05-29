/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KamusForm;

/**
 *
 * @author Farhan
 */
public class Model1 {
    String Jawa,English;

    public Model1(String Jawa, String English) {
        this.Jawa = Jawa;
        this.English = English;
    }

    public String getJawa() {
        return Jawa;
    }

    public void setJawa(String Jawa) {
        this.Jawa = Jawa;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String English) {
        this.English = English;
    }

    Object getKey() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
