/*
 * Copyright OpenNTF 2013
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package org.openntf.domino.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openntf.domino.iterators.VectorIterator;

// TODO: Auto-generated Javadoc
/**
 * The Class Vector.
 * 
 * @param <E>
 *            the element type
 */
public class Vector<E> extends java.util.Vector<E> implements Collection<E> {
	
	/** The delegate_. */
	private final java.util.ArrayList<E> delegate_;
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new vector.
	 */
	public Vector() {
		delegate_ = new ArrayList<E>();
	}

	/**
	 * Instantiates a new vector.
	 * 
	 * @param source
	 *            the source
	 */
	public Vector(Collection<E> source) {
		delegate_ = new ArrayList<E>(source);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#add(java.lang.Object)
	 */
	@Override
	public boolean add(E arg0) {
		return delegate_.add(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#add(int, java.lang.Object)
	 */
	@Override
	public void add(int arg0, E arg1) {
		delegate_.add(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#addAll(java.util.Collection)
	 */
	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		return delegate_.addAll(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#addAll(int, java.util.Collection)
	 */
	@Override
	public boolean addAll(int arg0, Collection<? extends E> arg1) {
		return delegate_.addAll(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#addElement(java.lang.Object)
	 */
	@Override
	@Deprecated
	public void addElement(E arg0) {
		delegate_.add(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#capacity()
	 */
	@Override
	public int capacity() {
		return delegate_.size();
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#clear()
	 */
	@Override
	public void clear() {
		delegate_.clear();
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#clone()
	 */
	@Override
	public Object clone() {
		return delegate_.clone();
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#contains(java.lang.Object)
	 */
	@Override
	public boolean contains(Object arg0) {
		return delegate_.contains(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#containsAll(java.util.Collection)
	 */
	@Override
	public boolean containsAll(Collection<?> arg0) {
		return delegate_.containsAll(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#copyInto(java.lang.Object[])
	 */
	@Override
	@Deprecated
	public void copyInto(Object[] arg0) {
		System.arraycopy(this.toArray(), 0, arg0, 0, this.size());
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#elementAt(int)
	 */
	@Override
	@Deprecated
	public E elementAt(int arg0) {
		return delegate_.get(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#elements()
	 */
	@Override
	@Deprecated
	public Enumeration<E> elements() {
		return Collections.enumeration(delegate_);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#ensureCapacity(int)
	 */
	@Override
	public void ensureCapacity(int arg0) {
		delegate_.ensureCapacity(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object arg0) {
		return delegate_.equals(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#firstElement()
	 */
	@Override
	public E firstElement() {
		return delegate_.get(0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#get(int)
	 */
	@Override
	public E get(int arg0) {
		return delegate_.get(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#hashCode()
	 */
	@Override
	public int hashCode() {
		return delegate_.hashCode();
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#indexOf(java.lang.Object, int)
	 */
	@Override
	@Deprecated
	public int indexOf(Object arg0, int arg1) {
		int i;
		if (arg0 != null) {
			for (i = arg1; i < this.size(); ++i) {
				if (arg0.equals(delegate_.toArray()[i]))
					return i;
			}
		} else {
			for (i = arg1; i < this.size(); ++i) {
				if (delegate_.toArray() == null) {
					return i;
				}
			}
		}
		return -1;

	}

	/* (non-Javadoc)
	 * @see java.util.Vector#indexOf(java.lang.Object)
	 */
	@Override
	public int indexOf(Object arg0) {
		return delegate_.indexOf(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#insertElementAt(java.lang.Object, int)
	 */
	@Override
	@Deprecated
	public void insertElementAt(E arg0, int arg1) {
		delegate_.add(arg1, arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return delegate_.isEmpty();
	}

	/**
	 * Gets the mod count.
	 * 
	 * @return the mod count
	 */
	public int getModCount() {
		return modCount;
	}

	/* (non-Javadoc)
	 * @see java.util.AbstractList#iterator()
	 */
	@Override
	public Iterator<E> iterator() {
		return new VectorIterator(this, modCount);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#lastElement()
	 */
	@Override
	@Deprecated
	public E lastElement() {
		return delegate_.get(size() - 1);
		// return delegate_.lastElement();
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#lastIndexOf(java.lang.Object, int)
	 */
	@Override
	@Deprecated
	public int lastIndexOf(Object arg0, int arg1) {
		return delegate_.lastIndexOf(arg0);
		// return delegate_.lastIndexOf(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#lastIndexOf(java.lang.Object)
	 */
	@Override
	public int lastIndexOf(Object arg0) {
		return delegate_.lastIndexOf(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.AbstractList#listIterator()
	 */
	@Override
	public ListIterator<E> listIterator() {
		return delegate_.listIterator();
	}

	/* (non-Javadoc)
	 * @see java.util.AbstractList#listIterator(int)
	 */
	@Override
	public ListIterator<E> listIterator(int arg0) {
		return delegate_.listIterator(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#remove(int)
	 */
	@Override
	public E remove(int arg0) {
		return delegate_.remove(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#remove(java.lang.Object)
	 */
	@Override
	public boolean remove(Object arg0) {
		return delegate_.remove(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#removeAll(java.util.Collection)
	 */
	@Override
	public boolean removeAll(Collection<?> arg0) {
		return delegate_.removeAll(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#removeAllElements()
	 */
	@Override
	public void removeAllElements() {
		delegate_.clear();
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#removeElement(java.lang.Object)
	 */
	@Override
	public boolean removeElement(Object arg0) {
		return delegate_.remove(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#removeElementAt(int)
	 */
	@Override
	public void removeElementAt(int arg0) {
		delegate_.remove(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#retainAll(java.util.Collection)
	 */
	@Override
	public boolean retainAll(Collection<?> arg0) {
		return delegate_.retainAll(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#set(int, java.lang.Object)
	 */
	@Override
	public E set(int arg0, E arg1) {
		return delegate_.set(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#setElementAt(java.lang.Object, int)
	 */
	@Override
	@Deprecated
	public void setElementAt(E arg0, int arg1) {
		// TODO make work, since it's a replace
		delegate_.remove(arg1);
		delegate_.add(arg1, arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#setSize(int)
	 */
	@Override
	@Deprecated
	public void setSize(int arg0) {
		// TODO NTF - absolutely certain that this implementation is wrong
		if (arg0 == size()) {
			return;
		}
		ensureCapacity(arg0);
		if (size() > arg0) {
			Arrays.fill(this.elementData, arg0, size(), null);
		}
		this.elementCount = arg0;
		this.modCount += 1;
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#size()
	 */
	@Override
	public int size() {
		return delegate_.size();
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#subList(int, int)
	 */
	@Override
	public List<E> subList(int arg0, int arg1) {
		return delegate_.subList(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#toArray()
	 */
	@Override
	public Object[] toArray() {
		return delegate_.toArray();
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#toArray(T[])
	 */
	@Override
	public <T> T[] toArray(T[] arg0) {
		return delegate_.toArray(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#toString()
	 */
	@Override
	public String toString() {
		return delegate_.toString();
	}

	/* (non-Javadoc)
	 * @see java.util.Vector#trimToSize()
	 */
	@Override
	public void trimToSize() {
		delegate_.trimToSize();
	}

}
