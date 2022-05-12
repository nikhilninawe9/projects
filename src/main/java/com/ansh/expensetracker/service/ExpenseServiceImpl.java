package com.ansh.expensetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ansh.expensetracker.model.Expense;
import com.ansh.expensetracker.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements IExpenseService {
	@Autowired
	private ExpenseRepository expenseRepository;

	@Override
	public List<Expense> getAllExpense() {
		List<Expense> expenseList = expenseRepository.findAll();
		return expenseList;
	}

}
