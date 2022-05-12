package com.ansh.expensetracker.service;

import java.util.List;

import com.ansh.expensetracker.model.Expense;

public interface IExpenseService {
	List<Expense> getAllExpense();
}
