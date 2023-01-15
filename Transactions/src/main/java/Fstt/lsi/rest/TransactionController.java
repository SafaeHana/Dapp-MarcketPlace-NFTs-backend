package Fstt.lsi.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Fstt.lsi.entities.Transaction;
import Fstt.lsi.services.TransactionService;
import Fstt.lsi.repositories.TransactionRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/transactions")
public class TransactionController {
	
	private TransactionRepository transactionRepository;
	
	
	
	@Autowired
	private TransactionService TransactionService;
	
	

	@PostMapping("/addTransaction")
	public Transaction saveTransaction(@RequestBody Transaction transaction) {
		 return TransactionService.saveTransaction(transaction);
	}
	
	
	
	
	@GetMapping("/consulter")
	public List<Transaction> showAllProperties() {
		return transactionRepository.findAll();
	}


}