package com.dentagest.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class MouvementCaisseDto {

    public enum Type { ENTREE, SORTIE }

    private LocalDateTime date;
    private String libelle;
    private Type type;
    private BigDecimal montant;
}
