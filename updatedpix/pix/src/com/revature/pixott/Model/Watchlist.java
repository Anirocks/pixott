package com.revature.pixott.Model;

public class Watchlist {
	private String Movie;
	private int no;
	
	public Watchlist() {
		
	}

	public Watchlist(String movies, int no) {
		super();
		Movie = movies;
		this.no = no;
	}

	public String getMovies() {
		return Movie;
	}

	public void setMovies(String movies) {
		Movie = movies;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Movie == null) ? 0 : Movie.hashCode());
		result = prime * result + no;
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
		Watchlist other = (Watchlist) obj;
		if (Movie == null) {
			if (other.Movie != null)
				return false;
		} else if (!Movie.equals(other.Movie))
			return false;
		if (no != other.no)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("%d %s",no,Movie);
	}

	
	
	

}
