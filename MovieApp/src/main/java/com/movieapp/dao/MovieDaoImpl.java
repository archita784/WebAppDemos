package com.movieapp.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.movieapp.model.Movie;

public class MovieDaoImpl implements MovieDao {

	@Override
	public void addOneMovie(Movie movie) {
		String sql = "insert into Movie values(?,?,?,?,?,?,?,?,?)";
		Connection connection=DBConnection.openconnection();
		PreparedStatement statement=null;
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, movie.getTitle());
			statement.setInt(2, movie.getMovieId());
			statement.setString(3, movie.getLanguage());
			statement.setString(4, movie.getGenre());
			statement.setString(5, movie.getDiscription());
			statement.setString(6, movie.getDirector());
			statement.setString(7, movie.getActor());
			statement.setInt(8, movie.getDuration());
			statement.setInt(9, movie.getRating());
			statement.execute();
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
		DBConnection.closeconnection();
		}
	}

	@Override
	public int updateOneMovie(int movieId, int rating) {
		String sql = "update Movie set rating=? where movieId=?";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		int result=0;
		try {
			statement = connection.prepareStatement(sql);
			statement.setDouble(1,rating);
			statement.setInt(2, movieId);

			result=statement.executeUpdate();
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());

				}
			DBConnection.closeconnection();
		}
		return result;
	}

	@Override
	public int deleteOneMovie(int movieId) {
		String sql = "delete from Movie where movieId=?";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		int result=0;
		try {
			statement = connection.prepareStatement(sql);

			statement.setInt(1, movieId);

			result=statement.executeUpdate();
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());

				}
			DBConnection.closeconnection();
		}
		return result;
	}

	@Override
	public List<Movie> findAllMovies() {
		String sql = "select * from movie";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		List<Movie> MovieList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				String title = rs.getString("title");
				int movieId = rs.getInt(2);
				String language=rs.getString("language");
				String genre=rs.getString("genre");
				String discription=rs.getString("discription");
				String director=rs.getString("director");
				String actor=rs.getString("actor");
				int duration=rs.getInt(8);
				int rating=rs.getInt(9);
				Movie movie=new Movie(title,movieId,language,genre,discription,director,actor,duration,rating);
				MovieList.add(movie);
			}
			} catch(SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			if(statement!=null)
				try {
					statement.close();
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();

		}
		return MovieList;
	}

	@Override
	public List<Movie> findMovieByChoice(String choice) {
		String sql = "select * from movie where title like ? or language like ?  or genre like ? or director like ? or actor like ?";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		List<Movie> movieList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
			statement.setString(1, "%"+choice+"%");
			statement.setString(2, "%"+choice+"%");
			statement.setString(3, "%"+choice+"%");
			statement.setString(4, "%"+choice+"%");
			statement.setString(5, "%"+choice+"%");
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				String title = rs.getString("title");
				int movieId = rs.getInt(2);
				String language=rs.getString("language");
				String genre=rs.getString("genre");
				String discription=rs.getString("discription");
				String director=rs.getString("director");
				String actor=rs.getString("actor");
				int duration=rs.getInt(8);
				int rating=rs.getInt(9);
				Movie movie=new Movie(title,movieId,language,genre,discription,director,actor,duration,rating);
				movieList.add(movie);
			
		}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			if(statement!=null)
				try {
					statement.close();
				}catch(SQLException e){
					System.out.println(e.getMessage());
				
				}
			DBConnection.closeconnection();
		}
		
		return movieList;
	}

	@Override
	public Movie findMovieById(int movieId) {
		String sql = "select * from movie where movieId=?";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		Movie movie = null;
		try {
			statement = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
			statement.setInt(1, movieId);
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
				String title = rs.getString("title");
				int movieId1 = rs.getInt(2);
				String language=rs.getString("language");
				String genre=rs.getString("genre");
				String discription=rs.getString("discription");
				String director=rs.getString("director");
				String actor=rs.getString("actor");
				int duration=rs.getInt(8);
				int rating=rs.getInt(9);
				movie=new Movie(title,movieId1,language,genre,discription,director,actor,duration,rating);
				
			}			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			if(statement!=null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();		
	}
		return movie;
	

	}

}
