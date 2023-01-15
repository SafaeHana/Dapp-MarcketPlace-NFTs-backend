package Fstt.lsi.services;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.http.ResponseEntity;

import Fstt.lsi.entities.Nft;

public interface NftService {
		//retourner un nft par son ID
	        public Nft findNftById(String tokenId);
		//retourner tous les nfts de la BD
			public List<Nft> getAllNfts();
		//save tous les nfst de la BD
			public Nft save(Nft n);
		//delete les nfts de la BD

			public void delete(Nft nft);
			
			Nft findBytoken_ID(String NftId);		
			List<Nft> findNftByVerified();
			
			List<Nft> findNonVerified1();
			
			List<Nft> findNftVerifiedByUserId(String id);
			
			List<Nft> findNftNonVerifiedByUserId(String id);
			
			

			
			
	
}
