package com.dentagest.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class Depense {
    private Long idDepense;
    private LocalDate dateDepense;
    private BigDecimal montant;
    private String description;
    private ModePaiement modePaiement;
    private Long idCharge;
    private Long idCaisse;
}