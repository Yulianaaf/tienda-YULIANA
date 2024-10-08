package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="Categoria")
public class categoria implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="id_categoria")
    private long idCategoria;
    
    private String descripcion;
    @Column (name="ruta_imagen")    
    private String rutaImagen;
    private boolean activo;
    
    

    public categoria() {
    }

    public categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
}
