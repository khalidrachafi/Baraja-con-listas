/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partea;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author khalid
 */
public class Naipe {

    Random random = new Random();

    public Palo palo;
    public int numCarta;

    public Naipe() {

        this.palo = paloAleatorio();
        this.numCarta = random.nextInt(1, 11);
    }

    private Palo paloAleatorio() {
        ArrayList<Palo> palos = new ArrayList<>();
        int aleatorio = random.nextInt(palos.size());
        return palos.get(aleatorio);
    }

    public Naipe(Palo palo, int numCarta) {

        this.palo = palo;
        if (numCarta < 1 || numCarta > 10) {
            throw new IllegalArgumentException("Has "
                    + "introducido un número incorrecto");
        }
        this.numCarta = numCarta;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(int numCarta) {

        if (numCarta >= 1 || numCarta <= 10) {
            this.numCarta = numCarta;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naipe{");
        sb.append("palo=").append(palo);
        if (numCarta == 8) {
            sb.append(", numCarta=").append("Sota");
        } else if (numCarta == 9) {
            sb.append(", numCarta=").append("Caballo");
        } else if (numCarta == 10) {
            sb.append(", numCarta=").append("Rey");
        } else {
            sb.append(", numCarta=").append(numCarta);
        }
        sb.append('}' + "\n");
        return sb.toString();
    }

}
