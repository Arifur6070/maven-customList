package com.naztech.maven_customListGeneric;

import java.util.Arrays;

//import org.omg.CORBA.PUBLIC_MEMBER;

public class CustomList<E> {
	int max_size;
	int increment=5;
	int length;
    Object[] array ;
	
	public CustomList() {
		super();
		this.max_size = 5;
		this.length = 0;
		this.array =new Object[5]; 
	}
	
	public E add( E e)
	{
		if(length == max_size)
		{
			allocate(increment);
		}
		array[length]=e;
		length++;
		return e;
	}
	
	public int size()
	{
		return length;
	}
	public boolean allocate(int increment)
	{
		max_size = max_size+increment;
		array = Arrays.copyOf(array, max_size);
		return true;
	}
	@SuppressWarnings("unchecked")
	public E get(int id)
	{
		if(id<0)
		{
			throw new RuntimeException("Invalid index position");
		}
		else if(id>=length)
		{
			throw new RuntimeException("Invalid index position");
		}
		else {
		return (E) array[id];
		}
	}
	

	public void clear()
	{
		length=0;
		array =  new Object[5];
	}
	
	public E remove(int position)
	{
		  if(position>=length || position < 0 ){
			  throw new RuntimeException("Invalid index");
			  }
		    @SuppressWarnings("unchecked")
			E element = (E) array[position];
		    --length;
		    System.arraycopy(array, position + 1, array, position, length - position);
		    return element;
	}
	
	
//	public void remove(E e)
//	{
//		int position=indexOf(e);
//		
//		 for(int i=0; i<length; i++)
//	       {
//	         if(array[i].equals(position))
//	         {
//	        	 System.arraycopy(array, position + 1, array, position, length - position);
//	        	 break;
//	         }
//	       }
//		 
//	}
	
	
	public CustomList<E> addAll(CustomList<E> list2) {
		if(list2.size()+length>max_size)
		{
			allocate(list2.size()+length - max_size);
		}
		System.arraycopy(toArray(list2), 0, array, this.size(), list2.size());
		length+=list2.size();
		return list2;
	}

private Object toArray(CustomList<E> list) {
	Object[] arr = new Object[list.size()];
	for(int i =0 ; i<list.size();i++)
		arr[i]=list.get(i);
	return arr;
}
//	public Boolean check(E e, CustomList<E> list)
//	{
//		for (int i=0;i<list.size();i++)
//		{
//			if(list.get(i).equals(e))
//			{
//				return false;
//			}
//			else {
//				return true;
//			}
//		}
//		
//	}

private int indexOf(E e)
{
	int index=0;
	for(int i=0;i<length-1;i++)
	{
		if(e==array[i])
		{
			index=i;
		}
		else {
			return -1;
		}
	}
	return index;
}

}

