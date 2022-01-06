package com.toyproject.housekeepingbook.domain.income;


import com.toyproject.housekeepingbook.domain.BasicInfo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Income extends BasicInfo {

    @Enumerated(EnumType.STRING)
    private IncomeCategory category;

    public Income(IncomeCategory category) {
        this.category = category;
    }
}
