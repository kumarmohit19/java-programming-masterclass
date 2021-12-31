# Classes and objects - Billing

Create a **cash register** for a fruit store that enables to complete purchases (applying offers, if any), etc.

**Project Setup**

**Class:**

**Register:** Singleton class

- Maintains a list of items for sale and their prices.
- Initiates and completes a checkout by returning a total bill amount.

**Methods:**

- Register getInstance() - static method
- String getTotalBill(Map<String,Integer> itemDetails)

**Function Description**

1. Create the function **_getInstance_** _in Register class_. Return the singleton instance of a register class using the register variable which was declared and initiated to null.

2. Complete the function _getTotalBill_ in the editor below. The function must state what must be returned.

   _getTotalBill_ has the following parameter(s):

   _itemDetails_ : a key/value pair of string key and integer value

The register contains the list of items and their prices. In this exercise, the list of items and their prices are:

| Item   | Price |
| ------ | ----- |
| apple  | 2.0   |
| orange | 1.5   |
| mango  | 1.2   |
| grape  | 1.0   |

<details style="margin: 5px;">
<summary style="background-color: #333; padding: 5px; ">
<b >Input Format For Custom Testing</b>
</summary>
<p>
It contains the string which have the list of purchased items (fruits) and their quantity

<b>Note : The order of the fruit's details may vary</b>

</p>
</details>

<details style="margin: 5px;">
<summary style="background-color: #333; padding: 5px; ">
<b>Sample Case 0</b>
</summary>
<b>Sample Input</b>

`apple 30 orange 10 mango 20`

<b>Sample Output</b>

`99.0`

</details>
<details style="margin: 5px;">
<summary style="background-color: #333; padding: 5px; ">
<b>Sample Case 1</b>
</summary>
<b>Sample Input For Custom Testing</b>

`orange 10 grape 52 apple 14`
<b>Sample Output</b>

`95.0`
