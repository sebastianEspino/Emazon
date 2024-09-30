package com.project.project.domain.model;

public class ArticleCategory {
    private Long idCategoria;
    private Long idArticulo;

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Long getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Long idArticulo) {
        this.idArticulo = idArticulo;
    }

    public ArticleCategory(Long idArticulo, Long idCategoria) {
        this.idArticulo = idArticulo;
        this.idCategoria = idCategoria;
    }
}
