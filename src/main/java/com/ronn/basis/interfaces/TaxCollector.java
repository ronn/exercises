package com.ronn.basis.interfaces;

public class TaxCollector {

    public static void main(String[] args) {
        TaxPayer[] taxPayers = {
                new EmployedPerson("Billy", "ssn-1123"),
                new MomPopShop("Coffeshop", "corp-id")
        };

        double taxesCollectedAmt = 0;

        for (TaxPayer taxPayer : taxPayers){
            taxesCollectedAmt += taxPayer.payTaxes();
        }

        System.out.printf("Taxes collected: $%.2f", taxesCollectedAmt);
    }
}
