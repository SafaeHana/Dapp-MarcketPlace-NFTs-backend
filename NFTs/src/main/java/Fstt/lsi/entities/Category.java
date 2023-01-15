package Fstt.lsi.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="Category")

	public class Category {
			@Id
			private String id;
			private String label;
			public Category(String label) {
				super();
				this.label = label;
			}
			public String getId() {
				return id;
			}
			public void setId(String id) {
				this.id = id;
			}
			public String getLabel() {
				return label;
			}
			public void setLabel(String label) {
				this.label = label;
			}
			@Override
			public String toString() {
				return "Category [id=" + id + ", label=" + label + "]";
			}
			
	}


