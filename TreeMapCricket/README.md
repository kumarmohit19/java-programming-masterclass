# TreeMap Cricket

## COLLECTIONS IN JAVA – TREEMAP – CRICKET

There is a set of cricket player details for matches. You have to perform certain operations with respect to the query using TreeMap in Java.

You will be given two datasets. For the query types 1 and 2, the first parameter **(cricketDataset)** contains **position** of the player in the match, **name of the player and the score of the player in a match**. For the query type 3, the first parameter **(cricketDataset)** contains the **number of matches**. The second parameter **(query)** contains the **query** to perform. These datasets are of string type and are passed using the **getQuery()** function. Split the string and to get the respective parameters.

You have to implement the following three functions in class library:

- createPlayerPositionMap(String cricketDataset)

- createPlayerScoreMap(String cricketDataset)

- createMatchesMap(String cricketDataset)

- getQuery(String cricketDataset,String query)

### Query Type 1:

Return the list of players with position and their names from starting position to end position. Input should be start position and end position. The result should be "<player position> <player name>\n...and so on".

### Query Type 2:

Return the list of players with position and their names more than specified threshold score. Input should be threshold score. Your result should be "<player position> <player name>\n...and so on".

### Query Type 3:

Return the efficient opener of all the matches depends upon the average score score of a player by calculate the total score of all matches divided by number of matches played. Your result should be "The Efficient Opener is <player name>".

Note: The opener is the player who played first position in a match.

**Sample Input:**

**cricketDataset for query type 1 and 2 =** 3,Dhoni,120|1,Virat,103|5,Jadeja,40|2,Rohit,70|4,Pandya,30

3 - position of the player, Dhoni - name of the player, 120 - score of the player

**_Note:_** In **cricketDataset**, players are seperated by "|", player details(player's position, name and score) are seperated by ",". In a **query** string, the first character refers the query type, the second character refers the conditional string depends on the query type. For query

**Type 1: query =** 1 3 5 (3 - start position, 5 - end position)

**Sample output:**
3 Dhoni  
4 Pandya  
5 Jadeja

**Type 2: query =** 2 50 (50 - threshold score)

**Sample output :**  
1 Virat  
2 Rohit  
3 Dhoni

**cricketDataset for query type 3 =** 3,Rohit,100|2,Virat,56|1,Dhoni,150\n3,Rahul,90|2,Virat,100|1,Rohit,99\n1,Rahul,50|2,Virat,64|3,Rohit,78\n1,Dhoni,95|2,Virat,30|3,Rohit,45\n3,Jadeja,43|2,Virat,54|1,Rohit,40|4,Dhoni,59

**Calculation:**  
Dhoni - 150+95/2 - 122.5  
Rohit - 95+78+40/3 - 71  
Rahul - 50/1 - 50

**Type 3: query =** 3 (only type of the query will be given)

**Sample output:**
The Efficient Opener is Dhoni

Use **createPlayerPositionMap(String cricketDataset)** to return the TreeMap of query type 1. The key should be the position of the player, and the value should be the name of the player.

Use **createPlayerScoreMap(String cricketDataset)** to return the TreeMap of query type 2. The key should be the name of the player, and the value should be the score of the player.

Use **createMatchesMap(String cricketDataset)** to return the TreeMap of query type 3.

Use **getQuery(String cricketDataset,String query)** to return the result string with respect to the query type.
