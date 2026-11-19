package com.dentagest.dto;

import com.dentagest.domain.Caisse;
import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class ResumeCaisseDto {
    private Caisse caisse;
    private BigDecimal entrees;
    private BigDecimal sorties;
    private BigDecimal soldeCalcule;
    private boolean coherent;
    private List<MouvementCaisseDto> journal;
}