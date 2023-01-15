package Fstt.lsi.services;
import java.util.List;
import Fstt.lsi.entities.Transaction;

import org.springframework.stereotype.Service;
public interface TransactionService {
	public Transaction saveTransaction(Transaction t);
	public List<Transaction> listAllTransactions();
	public List<Transaction> getTransactionByUser(String address);
}



