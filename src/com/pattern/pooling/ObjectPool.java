package com.pattern.pooling;

import java.util.LinkedList;

/**
 * 
 * @author rohit
 * Abstract class of the ObjectPool
 * @param <T>
 */
public abstract class ObjectPool<T> {

	private LinkedList<T> locked, unlocked;
	private int size;

	public ObjectPool(int size) {
		locked = new LinkedList<T>();
		unlocked = new LinkedList<T>();
		this.size = size;
		createPoolObjectOnLaunch();
	}

	private void createPoolObjectOnLaunch() {
		for (int i = 0; i < size; i++) {
			T t = create();
			unlocked.add(t);
		}
	}

	protected abstract T create();

	public synchronized T getItem() {
		if (unlocked.size() > 1) {
			T item = unlocked.removeFirst();
			locked.add(item);
			return item;
		}
		if (locked.size() >= size) {
			return null;
		}
		T t = create();
		locked.add(t);
		return (t);
	}

	public synchronized void returnItem(T t) {
		locked.remove(t);
		unlocked.add(t);
	}

}
