package gomes.filipe.desafiospring.controller;

import gomes.filipe.desafiospring.entity.Anuncio;

import java.util.ArrayList;
import java.util.List;

public class AnuncioPersistence {

    private List<Anuncio> anuncios = new ArrayList<>();

    public void cadastro(Anuncio anuncio) {
        anuncio.setId(anuncios.size() + 1L);
        anuncios.add(anuncio);
    }

    public List<Anuncio> listagem() {
        return anuncios;
    }
}
