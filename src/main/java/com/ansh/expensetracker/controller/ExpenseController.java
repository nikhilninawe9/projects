package com.ansh.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ansh.expensetracker.model.Expense;
import com.ansh.expensetracker.service.IExpenseService;

@RestController
public class ExpenseController {
	@Autowired
	private IExpenseService iexpenseService;

	@GetMapping("/expenses")
	public List<Expense> getAllExpenses() {
		List<Expense> expenses = iexpenseService.getAllExpense();
		return expenses;
	}
}
