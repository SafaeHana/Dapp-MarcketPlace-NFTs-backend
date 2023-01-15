package Fstt.lsi.services;

import java.util.List;

import Fstt.lsi.entities.Category;

public interface CollectionService {
	
	//returner tous les NFTs de la BD
			
	
			
			Category getCategory(String id);
			List<Category> getAllCategories();
			
}