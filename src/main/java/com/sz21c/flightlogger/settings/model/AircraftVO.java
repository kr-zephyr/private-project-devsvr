package com.sz21c.flightlogger.settings.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AircraftVO {
    private Integer id;
    private Integer purchaseId;
    private boolean commecialFlag;
    private String  name;
    private String  type;
    private String  developer;
    private Integer maxRange;
    private Integer maxSpeed;
    private Integer maxTakeoffDistance;
    private Long    rowCreateTime;
    private Long    rowModifyTime;
}
