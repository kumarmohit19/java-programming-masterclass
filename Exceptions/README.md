# Exceptions

Shubha wants to send a secret message to her partner Monisha. As part of the design phase, she creates an **Encrypter** class to handle input validation and encryption, and later implements a simple string manipulation method as a placeholder for real encryption.

Define a user-defined exception to the **InvalidMessageException** class which extends the **Exception** class.

Implement an **Encrypter** class which implements the **String encryptMessage(String name) static** method.

The method must perform the following tasks:

- Should validate the message by calling the **validate(message)** method provided in the **Validator** class.
- If message validation is successful, the message string should be reversed, and the uppercase letters must be converted to lowercase letters. This new string should then be returned as the encrypted message.
- If message validation fails, the method should display an exception of the **InvalidMessageException** class with the message **InvalidMessageException: Try again with valid message.** For custom messages, overload the **toString** method in **InvalidExceptionMessage** with your custom message.
- The locked stub code in the editor provides complete implementation of the **Validator** class, and validates the implementation of the **Encrypter** class.

**Constraints:**

- The message should not contain more than **100** characters.

**Input Format for Custom Testing:**

Encrypted name

**Sample Case 0**

**Sample Input:**

Kate Winslet

**Sample Output:**

telsniw etak

**Explanation:**

The name validation is successful, therefore, the string is reversed and converted to lowercase.

**Sample Case 1**

**Sample Input:**

Kate Wins?let

**Sample Output:**

InvalidMessageException: Try again with valid message

**Explanation:**

Invalid characters were found in the name, therefore, the exception is displayed with the message **Try again with valid message.**
