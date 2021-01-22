package com.purplepizza.categorycrud.entities;

import java.io.Serializable;
import java.time.Instant;

public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Instant createdAT;
	
	public Category() {
	}

	public Category(Long id, String name, Instant createdAT) {
		super();
		this.id = id;
		this.name = name;
		this.createdAT = createdAT;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getCreatedAT() {
		return createdAT;
	}

	public void setCreatedAT(Instant createdAT) {
		this.createdAT = createdAT;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
