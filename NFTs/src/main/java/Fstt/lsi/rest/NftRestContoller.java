package Fstt.lsi.rest;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import Fstt.lsi.entities.Nft;
import Fstt.lsi.repositories.NftRepository;
import Fstt.lsi.services.NftService;

@CrossOrigin(origins = "http://localhost:4200")
public class NftRestContoller {
	
	@Autowired
	private NftService nftService ;
	@Autowired
	private NftRepository nftRepository ;
	
	//@Autowired
	// userRestClient userfeign;
	
	@GetMapping("/getNft/{id}")
	public Nft getNft(@PathVariable("id") String id) {
		Nft p=nftService.findNftById(id);
		return p;
	}
	
	@PostMapping("/create")
	public Nft create( @RequestBody Nft n){;
	return nftService.save(n);
		
	}
	// update Nft rest api
	@PutMapping("/nfts/{id}")
	public ResponseEntity<Nft> updateNft(@PathVariable String id,@RequestBody Nft nft) {
			Nft existNft = nftService.findNftById(id);
			// get Nft from database by id
			
			existNft.setTokenId(id);
			existNft.setNameNft(nft.getNameNft());
			existNft.setDescription(nft.getDescription());
			existNft.setSellerAddress(nft.getSellerAddress());
			existNft.setSale_date(nft.getSale_date());
			
			// save updated Nft object
			Nft nft1 = nftService.save(existNft);
			return ResponseEntity.ok(nft1);
			
		}
	
	// delete Nft rest api
		@DeleteMapping("/nfts/{id}")
		public String delete(@PathVariable("id") String id) {
			Nft n= nftRepository.findById(id).get();
			
			nftRepository.delete(n);
			return "product deleted successfully!";
		}


}
