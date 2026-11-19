package com.dentagest.dto;

import com.dentagest.domain.Facture;
import com.dentagest.domain.Paiement;
import com.dentagest.domain.SituationFinanciere;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class SituationDetailDto {
    private SituationFinanciere situation;
    private List<Facture> factures;
    private List<Paiement> paiements;
}