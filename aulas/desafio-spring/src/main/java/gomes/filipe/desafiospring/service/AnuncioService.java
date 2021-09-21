package gomes.filipe.desafiospring.service;

import gomes.filipe.desafiospring.controller.AnuncioPersistence;
import gomes.filipe.desafiospring.entity.Anuncio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnuncioService {

    private AnuncioPersistence persistence = new AnuncioPersistence();

    private boolean codigoNaoUtilizado(String codigo) {
        for (Anuncio anuncio : persistence.listagem()) {
            if (anuncio.getCodigo().equals(codigo)) {
                return false;
            }
        }
        return true;
    }

    public void cadastrar(Anuncio anuncio) {
        if (codigoNaoUtilizado(anuncio.getCodigo())) {
            anuncio.setId(persistence.listagem().size() + 1L);
            persistence.cadastro(anuncio);
        } else {
            throw new RuntimeException("Código já utilizado");
        }
    }

    public List<Anuncio> listagem() {
        return persistence.listagem();
    }

}
