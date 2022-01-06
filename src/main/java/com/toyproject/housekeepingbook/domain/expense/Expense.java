package com.toyproject.housekeepingbook.domain.expense;

import com.toyproject.housekeepingbook.domain.BasicInfo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Expense extends BasicInfo {

    @Enumerated(EnumType.STRING)
    private ExpenseCategory category;

    public Expense(ExpenseCategory category) {
        this.category = category;
    }
}
