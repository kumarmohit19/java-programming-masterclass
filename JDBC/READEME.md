This Project is an implementation/solution of a question using mentioned tools only 


**Question**: 


In this question, you have to develop a JDBC code for the following scenario.

 

Consider three tables - Category, Product, and Orders, as shown as follows.



Use the db.sql file to create the tables.
The file should be executed automatically whenever the application runs.

 

Use the DbUtil class to create database connections. 

Complete the runDbScript() method in RunningScripts class to run the db.sql file.

Complete the following methods in DbOperations class:

 

public boolean insertCategory(String type): Takes a category type, inserts it into the category table, and returns a Boolean result
public ArrayList getCategoryById(int id): Returns an ArrayList containing the record data for the given id in the category table. For example, [2, 'Category1'] 
public ResultSet getAllCategory(): Returns all the records in the category table as a ResultSet
public boolean insertProduct(String name, float price, String type): Takes a product's name, price, and type (category), inserts it into the product table, and returns a Boolean result 
public ArrayList getProductById(int id): Returns an ArrayList containing the record data for the given id in the product table. For example, [2, 'Product1', 22.01, 2] 
public ResultSet getAllProduct(): Returns all the records in the product table as a ResultSet
public boolean insertOrder(String product_name, Date date): Takes a product's name and date, inserts it into the orders table, and returns a Boolean result
public ArrayList getOrderById(int id): Returns an ArrayList containing the record data for the given id in the orders table. For example, [2, 1, 02-01-2020]
public ResultSet getAllOrder(): Returns all the records in the orders table as a ResultSet