package Fstt.lsi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Fstt.lsi.entities.Category;

import Fstt.lsi.repositories.CategoryRepository;

@Service
public class CollectionServiceImpl implements CollectionService{
	@Autowired
	private CategoryRepository collecRepo;
	
	//retourner tous les NFTs de la BD
	@Override
	public
	Category getCategory(String id){
		// TODO Auto-generated method stub
		return collecRepo.findById(id).get();

	}
	public List<Category> getAllCategories(){
		// TODO Auto-generated method stub
		return  collecRepo.findAll();
	}
	   
}