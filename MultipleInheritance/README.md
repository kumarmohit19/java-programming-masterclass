# Multiple Inheritance

Create two interfaces: **HockeyTeam** and **FootballTeam**, and one class: **Sport**. The Sport class should implement both the interfaces **HockeyTeam** and **FootballTeam (Multiple Inheritance)**.

The **HockeyTeam** interface must contain the following methods:

- _public int calculateHockeyScore();_
- _public int findHighestGoalByIndividualInHockey();_

The **FootballTeam** must contain the following methods:

- _public int calculateFootballScore();_
- _public int findHighestGoalByIndividualInFootball();_

Class **Sport** must contain the variables **_int[] hockeyPlayers, int[] footballPlayers._**

- _Sport(int[] paramHockeyPlayers, int[] paramFootballPlayers)_: Constructor takes two arrays as parameters and initializes the empty array **hockeyPlayers** to store the first 11 integer values, and the empty array **footballPlayers** to store the last 11 integer values. Assign each value to each element in **hockeyPlayers** and **footballPlayers**.

- _public int calculateHockeyScore():_ Calculate the overall score by adding the scores of all individual hockeyPlayers in the hockey team, and return the overall score as an **integer**.

- _public int calculateFootballScore():_ Calculate the overall score by adding the scores of all individual footballPlayers in the football team, and return the overall score as an **integer**.

- _public int findHighestGoalByIndividualInHockey():_ Find the highest goal scorer in the hockey team, and return the number of goals scored as an **integer**.

- _public int findHighestGoalByIndividualInFootball():_ Find the highest goal scorer in the football team, and return the number of goals scored as an **integer**.

The locked code stub validates the implementation of the **Sport** class, and the **HockeyTeam** and **FootballTeam** interfaces.

## Input format for Custom Testing:

- The first line contains 11 space-separated integers (goals of players in the hockey team).
- The last line contains 11 space-separated integers (goals of players in the football team).

**Sample Input:**

```
2 0 0 0 1 1 0 0 0 1 0
2 1 0 3 0 0 0 0 0 0 0
```

**Sample Output:**

```
5
6
2
3
```

## Output Specification:

- The first line contains the overall score of the hockey team.
- The second line contains the overall score of the football team.
- The third line contains the goals scored by the highest goal scorer in the hockey team.
- The last line contains the goals scored by the highest goal scorer in the football team.
