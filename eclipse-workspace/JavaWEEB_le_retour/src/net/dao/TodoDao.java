package net.dao;

import java.sql.SQLException;
import java.util.List;

import net.model.Todo;

public interface TodoDao {

	void insertTodo(Todo todo) throws SQLException, InstantiationException, IllegalAccessException;

	Todo selectTodo(long todoId) throws InstantiationException, IllegalAccessException;

	List<Todo> selectAllTodos() throws InstantiationException, IllegalAccessException;

	boolean deleteTodo(int id) throws SQLException, InstantiationException, IllegalAccessException;

	boolean updateTodo(Todo todo) throws SQLException, InstantiationException, IllegalAccessException;

}