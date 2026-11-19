package com.dentagest.domain;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class SituationFinanciere {
    private Long idSituation;
    private BigDecimal montantTotal;
    private BigDecimal montantPaye;
    private BigDecimal credit;
    private StatutSituation statut;
    private Long idDossier;
}
