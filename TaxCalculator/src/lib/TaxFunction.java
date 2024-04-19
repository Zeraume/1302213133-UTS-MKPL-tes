package lib;

public class TaxFunction {
    public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int monthsWorked, int annualDeductible, boolean isSingle, int numChildren) {
        // Tax calculation logic here
        int annualIncome = (monthlySalary + otherMonthlyIncome) * monthsWorked;
        int annualTaxableIncome = annualIncome - annualDeductible;
        int tax = 0;

        // Calculate tax based on taxable income
        if (annualTaxableIncome <= 50000000) {
            tax = calculateTaxBracket1(annualTaxableIncome);
        } else if (annualTaxableIncome <= 250000000) {
            tax = calculateTaxBracket2(annualTaxableIncome);
        } else if (annualTaxableIncome <= 500000000) {
            tax = calculateTaxBracket3(annualTaxableIncome);
        } else {
            tax = calculateTaxBracket4(annualTaxableIncome);
        }

        // Additional tax exemptions for married and children
        if (!isSingle) {
            tax -= 500000;
        }
        tax -= numChildren * 250000;

        // Ensure tax is not negative
        return Math.max(tax, 0);
    }

    private static int calculateTaxBracket1(int income) {
        return (int) (income * 0.05);
    }

    private static int calculateTaxBracket2(int income) {
        return (int) (2500000 + (income - 50000000) * 0.15);
    }

    private static int calculateTaxBracket3(int income) {
        return (int) (32500000 + (income - 250000000) * 0.25);
    }

    private static int calculateTaxBracket4(int income) {
        return (int) (95000000 + (income - 500000000) * 0.3);
    }
}

