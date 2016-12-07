/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jessa
 */
class Sequence {

    public String sequence;
    public String title;

    Sequence(String title, String sequence) {
        this.title = title;
        this.sequence = sequence.toUpperCase();

    }

    public String getID() {
        try {
            return this.title.split("\\|")[1];
        } catch (Exception e) {
            return this.title;
        }
    }
}

