package com.dentagest.domain;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class Charge {
    private Long idCharge;
    private String nom;
    private String type;
    private BigDecimal montantPrevu;
    private String periodicite;
    private Long idCabinet;
}
