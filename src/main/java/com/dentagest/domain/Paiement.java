package com.dentagest.domain;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class Paiement {
    private Long idPaiement;
    private LocalDateTime datePaiement;
    private BigDecimal montant;
    private ModePaiement modePaiement;
    private Long idFacture;
    private Long idCaisse;
}