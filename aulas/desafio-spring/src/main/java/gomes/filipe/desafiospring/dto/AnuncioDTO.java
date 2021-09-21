package gomes.filipe.desafiospring.dto;

import java.math.BigDecimal;

public class AnuncioDTO {

    private String codigo;
    private String titulo;
    private BigDecimal preco;
    private Integer quantidade;

    public AnuncioDTO(String codigo, String titulo, BigDecimal preco, Integer quantidade) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
}
