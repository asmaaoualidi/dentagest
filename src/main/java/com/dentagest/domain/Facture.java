package com.dentagest.domain;


import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class Facture {
    private Long idFacture;
    private String numero;
    private LocalDate dateFacture;
    private BigDecimal montant;
    private StatutFacture statut;
    private Long idSituation;
    private Long idConsultation;
}
