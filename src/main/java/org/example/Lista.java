package org.example;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Integer> listaNumeros;
    private Integer qtdVezesDigitar;

    Lista (Integer qtdVezesDigitar) {
        this.listaNumeros = new ArrayList<>(qtdVezesDigitar);
        this.qtdVezesDigitar = qtdVezesDigitar;
    }
    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }
}
