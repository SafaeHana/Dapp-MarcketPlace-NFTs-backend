package Fstt.lsi.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Fstt.lsi.repositories.TransactionRepository;
import Fstt.lsi.entities.Transaction;

@Service
public class TransactionServiceImp {
	@Autowired
	private TransactionRepository transactionRepository;
	
	public Transaction saveTransaction(Transaction t) {
	
		return transactionRepository.save(t);
	}

	public List<Transaction> listAllTransactions() {
	
		return transactionRepository.findAll();
	}


	public List<Transaction> getTransactionByUser(String buyerAddress) {
	
		return transactionRepository.findAllBybuyerAddress(buyerAddress);
	}
}

