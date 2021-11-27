This Project is an implementation/solution of a question using mentioned tools only 


**Question**: 


**Finding Secret Code using Packages**

Two friends A and B are conversing on the phone. Although it looks like a normal conversation, they are secretly sharing a **password**. There are some numbers mentioned in the conversation in **digit form**. You have to get all the numbers from the conversation, check if the number is **Keith composite** or not, and then concatenate those numbers. Additionally, the numbers **1 to 9** present in **text form**(one, two, three, etc) must be transformed into numeric form. Add all those numbers and concatenate the sum finally to the previously extracted Keith composite number. Find the **secret code** and return it in string format by using **Packages**.

Perform the operations in two forms, **numeric** and string in two different packages.

Create a folder **code** in the **Java** folder (**/projects/challenge/FindSecretCode/src/main/java/**). In the code folder, create two folders **numbers** and **string**. The code/numbers refers the **code.numbers** package, and the code/string refers the **code.string** package.  

**String operations** - Add digits that are in text form (e.g. **three**), and extract digits that are in numeric form (e.g. **56**). This logic should be written in the **ExtractString.java** file inside the **code.string** package.

**Numeric operations** - Check if the extracted numbers are **Keith composite** or not. This logic should be written in **NumberFinder.java** file inside the **code.numbers** package.

Call the function containing the numeric and string operations in the **getInput(String conversation)** function, present the **KeithClass.java** file by importing those packages, and return the resultant secret code in string format.

The variable **conversation** contains the input (conversation between A and B) in string format.

**Sample Input:**

**A**: Hello, Priya 3 speaking. Is this Aditi? **B**: Yeah Priya! I am there 28. **A**: How are you dear three? **B**: I am fine 19. What about you Priya 75? **A**: Glad to hear that! Me too fine! seven. Aditi how are your five holidays going? **B**: Great Priya! I am enjoying well! 

**Sample Output:**

287512

**Explanation:**

From the input data, the digits deciphered are 3, 28, 19, 75. Out of these, 28 and 75 are Keith composite numbers. The numbers in text form are seven and five, and the sum of these numbers is 12. The concatenation of these numbers is 287512, which is the secret code.

A **Keith number** is an n-digit integer N  such that if a Fibonacci-like sequence (in which each term in the sequence is the sum of the n previous terms) is formed with the first n terms taken as the decimal digits of the number N, N itself occurs as a term in the sequence. For example, 197 is a Keith number since it generates the sequence 1, 9, 7,1+9+7=17, 9+7+17=33, 7+17+33=57, 17+33+57=107, 33+57+107=197, ... (Keith). Keith numbers are also called repfigit (repetitive fibonacci-like digit) numbers.

A **composite number** is a positive integer that is not a prime number (contains factors other than 1 and itself).

**Note:** Naming conventions must be adhered to.