package Fstt.lsi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Fstt.lsi.entities.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String>{

}