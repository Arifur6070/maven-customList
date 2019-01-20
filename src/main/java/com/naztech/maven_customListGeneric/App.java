package com.naztech.maven_customListGeneric;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       CustomList<Book> list = new CustomList<>();
       list.add(new Book("feluda", "Satyajit Roy", 300));
       list.add(new Book("Misir Ali", "Humayun Ahmed", 300));
       CustomList<Book> list2 = new CustomList<>();
       list2.add(new Book("Sherlock Holmes", "Sir Conan Doyale ", 300));
       list2.add(new Book("Byomkesh Bakshi", "Sharadhindho chaterjiee", 300));
       
       Book b = new Book("Misir Ali", "Humayun Ahmed", 300);
       
       list.addAll( list2);
      
    }
}
