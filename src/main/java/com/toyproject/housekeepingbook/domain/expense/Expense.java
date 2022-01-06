package com.toyproject.housekeepingbook.domain.expense;

import com.toyproject.housekeepingbook.domain.BasicInfo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Expense extends BasicInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long basicInfoId;

    @Enumerated(EnumType.STRING)
    private ExpenseCategory category;

    public Expense(Long basicInfoId, ExpenseCategory category) {
        this.basicInfoId = basicInfoId;
        this.category = category;
    }
}
