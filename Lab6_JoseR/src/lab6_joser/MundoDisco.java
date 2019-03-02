/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_joser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel RC
 */
public class MundoDisco {

    private String tortuga;
    private ArrayList<Criatura> criaturas = new ArrayList();
    private File archivo = null;
    Criatura c;

    public MundoDisco() {

    }

    public MundoDisco(String path) {
        archivo = new File(path);
    }

    public String getTortuga() {
        return tortuga;
    }

    public void setTortuga(String tortuga) {
        this.tortuga = tortuga;
    }

    public ArrayList<Criatura> getCriaturas() {
        return criaturas;
    }

    public void setCriaturas(ArrayList<Criatura> criaturas) {
        this.criaturas = criaturas;
    }

    public void escribirArchivo() {

        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Criatura t : criaturas) {
                bw.write(t.getNombre() + "|");
                bw.write(t.getEnergia() + "|");
                bw.write(t.getAnosmax() + "|");
                bw.write(t.getRegion() + "|");
                bw.write(t.getVivas() + "|");

                for (int i = 0; i < t.getObjetos().size(); i++) {
                    bw.write("--" + t.getObjetos().get(i));
                }
                bw.write("|");
            }
            bw.flush();
        } catch (Exception ex) {

        }

    }

    public void cargararchivo() {
        Scanner sc = null;
        Scanner sc1 = null;
        criaturas=new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    c = new Criatura(sc.next(), sc.nextDouble(), sc.nextInt(), sc.next(), sc.nextInt());
                    criaturas.add(c);
                    
                }
            } catch (Exception ex) {

            }
            sc.close();
        }
    }

}
