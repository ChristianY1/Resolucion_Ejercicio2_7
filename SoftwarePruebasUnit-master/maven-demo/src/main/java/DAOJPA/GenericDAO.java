package DAOJPA;

import java.util.List;

public interface GenericDAO<T, ID> {
	
	void create(T entity);
	public List<T> find();

}
