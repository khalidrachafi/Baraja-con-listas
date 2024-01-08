/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteb;

import java.util.ArrayList;
import partea.Naipe;
import partea.Palo;

/**
 *
 * @author khalid
 */
public class Baraja {

    private final ArrayList<Naipe> naipes;
    public static final int TOTAL_CARTAS = 40;

    public Baraja() {
        this.naipes = new ArrayList<>(TOTAL_CARTAS);
        creacionBaraja();
    }

    private void creacionBaraja() {
        int x = 0;
        for (Palo palo : Palo.values()) {
            for (int numCarta = 1; numCarta <= 10; numCarta++) {
                naipes.add(new Naipe(palo, numCarta));
                x++;
            }
        }
    }

    public ArrayList<Naipe> getNaipes() {
        return naipes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Naipe naipe : naipes) {
            sb.append(naipe).append("\n");
        }
        return sb.toString();
    }

    public void Barajar(int movimientos) {

        for (int i = 0; i < movimientos; i++) {
            
        }

    }

}
