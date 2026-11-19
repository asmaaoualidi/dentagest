package com.dentagest.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class Caisse {
    private Long idCaisse;
    private BigDecimal solde;
    private LocalDate dateOuverture;
    private String statut;
    private Long idCabinet;
}