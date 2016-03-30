package repository;

import java.util.ArrayList;
import java.util.List;

public abstract class Repository<TYPE> {

	private List<TYPE> data;

	public Repository() {
		data = new ArrayList<>();
	}

	public final void add(TYPE newData) {
		data.add(newData);
	}

	public final int size() {
		return getData().size();
	}

	protected final List<TYPE> getData() {
		return data;
	}
}
