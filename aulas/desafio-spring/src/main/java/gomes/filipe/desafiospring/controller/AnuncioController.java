package gomes.filipe.desafiospring.controller;

import gomes.filipe.desafiospring.dto.AnuncioDTO;
import gomes.filipe.desafiospring.entity.Anuncio;
import gomes.filipe.desafiospring.service.AnuncioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/anuncios")
public class AnuncioController {

    @Autowired
    private AnuncioService service;

    @PostMapping(value = "/cadastra")
    public ResponseEntity<AnuncioDTO> cadastro(@RequestBody AnuncioDTO objetoDesserializado) {
        Anuncio anuncio = converte(objetoDesserializado);
        service.cadastrar(anuncio);
        return ResponseEntity.ok(objetoDesserializado);
    }

    @GetMapping(value = "/list")
    public List<AnuncioDTO> lista() {
        List<Anuncio> listaDeAnuncios = service.listagem();
        List<AnuncioDTO> listaDTOs = converte(listaDeAnuncios);
        return listaDTOs;
    }

    private Anuncio converte(AnuncioDTO dto) {
        return new Anuncio(dto.getCodigo(), dto.getTitulo(), dto.getPreco(), dto.getQuantidade());
    }

    private List<AnuncioDTO> converte(List<Anuncio> anuncios) {
        List<AnuncioDTO> listaDeAnunciosDTO = new ArrayList<>();
        for (Anuncio anuncio : anuncios) {
            listaDeAnunciosDTO.add(new AnuncioDTO(anuncio.getCodigo(), anuncio.getTitulo(), anuncio.getPreco(), anuncio.getQuantidade()));
        }
        return listaDeAnunciosDTO;
    }
}
