package Fstt.lsi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Fstt.lsi.entities.Nft;
import Fstt.lsi.repositories.NftRepository;


public class NftServiceImpl {
	@Autowired
	NftRepository NftRepository;

	public Nft save(Nft n) {
		return NftRepository.save(n);
	}

	public List<Nft> getAllNfts() {
		return NftRepository.findAll();
	}
	public void delete(Nft nft) {
		NftRepository.delete(nft);
	}
	
	Optional<Nft> findBytoken_ID(String NftId) {
		return NftRepository.findById(NftId);
	}		
	List<Nft> findNftByVerified() {
		return NftRepository.findByVerified();
	}
	
	List<Nft> findNonVerified1() {
		return NftRepository.findByVerified1();
	}
	
	List<Nft> findNftVerifiedByUserId(String id) {
		return NftRepository.findVerifiedByUserId(id);
	}
	
	List<Nft> findNftNonVerifiedByUserId(String id) {
		return NftRepository.findNonVerifiedByUserId(id);
	}
	


}
