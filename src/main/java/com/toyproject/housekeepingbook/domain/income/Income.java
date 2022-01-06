package com.toyproject.housekeepingbook.domain.income;


import com.toyproject.housekeepingbook.domain.BasicInfo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Income extends BasicInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long basicInfoId;

    private IncomeCategory category;

    public Income(Long basicInfoId, IncomeCategory category) {
        this.basicInfoId = basicInfoId;
        this.category = category;
    }
}
