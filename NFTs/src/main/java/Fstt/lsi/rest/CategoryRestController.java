package Fstt.lsi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Fstt.lsi.entities.Category;
import lombok.RequiredArgsConstructor;
import Fstt.lsi.repositories.CategoryRepository;
import Fstt.lsi.services.CollectionService;
//import FSTT.lsi.request.nftrequest;

@RequestMapping("/nft/collection")

@RequiredArgsConstructor

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryRestController {
	
	@Autowired
	public CollectionService collecService;
	
	@Autowired
	public CategoryRepository collecRepository;
	
	@GetMapping("/getAll")
	public List<Category> listCollection() {
		return (collecService.getAllCategories() );
		
	}
	
	@GetMapping("/get/{id}")
	public Category getCollection(@PathVariable("id") String id) {
		return (collecService.getCategory(id) );
		
	}
	
	@PostMapping("/create")
	public String addCollection(String label) {
		 Category c = new Category(label);
		 collecRepository.save(c);
		 return "Category registered successfully!";
	     }
	 
	@PostMapping("/update/{id}")
    public Category updateCollection(@PathVariable("id") String id,String label) {
    	 Category c = collecRepository.findById(id).get();
    	 c.setLabel(label);
    	 collecRepository.save(c);
    	 System.out.println("category updated successfully!");
    	 return c; 
     }
	
	 @PostMapping("/delete/{id}")
     public String deleteCollection(@PathVariable("id") String id) {
    	 Category c=collecRepository.findById(id).get();
    	 collecRepository.delete(c);
    	 return "category deleted successfully!";
     }
}