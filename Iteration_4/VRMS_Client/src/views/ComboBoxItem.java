/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package views;

/**
 *
 * @author Antonio
 */
class ComboBoxItem {

    private String chiave;
    private String valore;

    ComboBoxItem() {
    }

    ComboBoxItem(String c, String v) {
        chiave = c;
        valore = v;
    }

    public void setChiave(String c) {
        chiave = c;
    }

    public void setValore(String v) {
        valore = v;
    }

    public String getChiave() {
        return chiave;
    }

    public String getValore() {
        return valore;
    }

    @Override
    public String toString() {
        return chiave + " " + valore;
    }
}
