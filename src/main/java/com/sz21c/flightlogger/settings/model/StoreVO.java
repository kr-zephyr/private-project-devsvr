package com.sz21c.flightlogger.settings.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoreVO {
    private Integer id;
    private String  name;
    private String  siteUrl;    //TODO url pattern validate해야 함
    private Long    rowCreateTime;
    private Long    rowModifyTime;
}
