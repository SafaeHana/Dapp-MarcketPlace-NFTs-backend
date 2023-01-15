package Fstt.lsi.entities;


import java.util.Date;
import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="NFTs")
public class Nft {
	
	@Id
	private String token_ID;
	private String image;
	private Boolean verified=false;
	private String name ;
	private String description ;
	private double priceusd ;
	private double priceeth ;
	private String sellerAddress;
	private Date sale_date;
	@DBRef
	private Category category;




	public void NFTs(String name, String description, String sellerAddress, double priceeth, double priceusd, String smartConAdress,Date sale_date,Fstt.lsi.entities.Category category) {
		//super();
		this.name = name;
		this.description = description;
		this.sellerAddress = sellerAddress;
		this.priceeth = priceeth;
		this.priceusd = priceusd;
		this.description = description;
		
		this.category = category;
	}


//_________________________

	public void setTokenId(String id) {
		this.token_ID=id;
		
	}
	public String getTokenId(String id) {
		return this.token_ID;
		
	}

//_________________________

	public String getNameNft() {
		// TODO Auto-generated method stub
		return this.token_ID;
	}



	public void setNameNft(String nameNft) {
		this.name=nameNft;
		
	}

//__________________________

	public  String getDescription() {
		return this.description;
	}



	public void setDescription(String description) {
		this.description=description;		
	}

//_________________________

	public double getPrice() {
		// TODO Auto-generated method stub
		return this.priceeth+this.priceusd;
	}



	public void setPrice(double price,double price2) {
		this.priceeth=price;	
		this.priceusd=price2;	
		
	}
//_________________________

	public String getSellerAddress() {
		return this.sellerAddress;
	}
	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress=sellerAddress;		
	}
//_________________________

	public Date getSale_date() {
		return this.sale_date;
	}
	public void setSale_date(Date date) {
	    this.sale_date=date;
	}
//______________________________________
	
	public Fstt.lsi.entities.Category getCategory() {
		return category;
	}
	public void setCategory(Fstt.lsi.entities.Category category) {
		this.category = category;
	}




}
