package com.softtek.MenuRestaurante.dto;

import com.softtek.MenuRestaurante.model.Ingrediente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlatoDTO {

    private String nombre;
    private List<Ingrediente> lista_ingredientes;
    private Integer cantidad_calorias;
    @Setter
    private String ingrediente_mas_calorico;

    public String getIngrediente_mas_calorico() {
        return lista_ingredientes.stream().max((i1, i2) -> i1.getCantidad_calorias().compareTo(i2.getCantidad_calorias())).get().getNombre();
    }

}
