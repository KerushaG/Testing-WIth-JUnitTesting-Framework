package mytest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoanTest {
	@Test
	public void testPaymentMethods() {
		double annualInterestRate = 2.5;
		int numberOfYears = 5;
		double loanAmount = 1000;
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
		
		assertTrue(loan.getMonthlyPayment() == getMonthlyPayment(annualInterestRate, numberOfYears, loanAmount));
		
		assertTrue(loan.getTotalPayment() == getTotalPayment(annualInterestRate, numberOfYears, loanAmount));
	}
	
	private double getMonthlyPayment(double annualInterestRate, int numberOfYears, double loanAmount) {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12 )));
		return monthlyPayment ;
	}
		
	public double getTotalPayment(double annualInterestRate, int numberOfYears, double loanAmount) {
		return getMonthlyPayment(annualInterestRate, numberOfYears, loanAmount) * numberOfYears * 12;
	}
		
	void test() {
		fail("Not yet implemented");
	}
}