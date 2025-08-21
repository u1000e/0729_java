package com.kh.chap04.model.vo;

import java.util.Objects;

public class Fish {
	
	private String taste;
	private String recipe;
	
	public Fish() {
		super();
	}
	public Fish(String taste, String recipe) {
		super();
		this.taste = taste;
		this.recipe = recipe;
	}
	
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getRecipe() {
		return recipe;
	}
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	
	@Override
	public String toString() {
		return "Fish [taste=" + taste + ", recipe=" + recipe + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(recipe, taste);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fish other = (Fish) obj;
		return Objects.equals(recipe, other.recipe) && Objects.equals(taste, other.taste);
	}
}
