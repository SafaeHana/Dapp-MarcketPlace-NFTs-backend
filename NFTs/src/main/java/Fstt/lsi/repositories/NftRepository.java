package Fstt.lsi.repositories;

import Fstt.lsi.entities.Nft;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NftRepository extends MongoRepository<Nft, String>{
	
	Nft findBytoken_ID(String NftId);		
	@Query("{'verified' : true}")
	List<Nft> findByVerified();
	
	@Query("{'verified' : false}")
	List<Nft> findByVerified1();
	
	@Query("{'sold' : true}")
	List<Nft> findBySold();
	
	@Query("{'sold' : false}")
	List<Nft> findBySold1();
	
	@Query("{'sold' : true,'userId' : ?0}")
	List<Nft> findSoldByUserId(String id);
	
	@Query("{'sold' : false,'userId' : ?0}")
	List<Nft> findNonSoldByUserId(String id);
	
	@Query("{'verified' : true,'userId' : ?0}")
	List<Nft> findVerifiedByUserId(String id);
	
	@Query("{'verified' : false,'userId' : ?0}")
	List<Nft> findNonVerifiedByUserId(String id);
	
	@Query("{'verified' : true,'sold' : false}")
	List<Nft> findVerifiedAndNonSold();
	
	@Query("{'verified' : true,'sold' : false,'userId' : ?0}")
	List<Nft> findVerifiedAndNonSoldByUserId(String id);
	


}