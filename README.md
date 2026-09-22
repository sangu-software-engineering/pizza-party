# Pizza party

The running example for SANGU's Software Engineering course. It starts as a small planner that works out how many whole pizzas a party needs and grows, one week at a time, into a party-ordering application that is tested, containerised, delivered, and monitored. The [course website](https://sangu-software-engineering.github.io/about/#running-example) lists what the application gains each week.

## The code at any week

Each week's final state has a tag: `week-01`, `week-02`, and so on. To look at one, clone the repository and check out its tag:

```shell
git clone https://github.com/sangu-software-engineering/pizza-party.git
cd pizza-party
git checkout week-01
```

`git diff week-01 week-02` shows what a week changed, and `git checkout main` returns to the newest version. Git arrives in week 2; until then, browse the tags on GitHub or use the week 1 lesson's downloads.

## Run it

This version needs JDK 21 or newer. Compile both programs, then run the planner and its checks:

```shell
javac PizzaPartyPlanner.java PizzaChecks.java
java PizzaPartyPlanner
java PizzaChecks
```

The planner prints:

```text
Guests: 4
Slices wanted: 11
Pizzas to order: 2
Leftover slices: 5
Pizzas for an empty party: 0
```

`PizzaChecks` checks `countPizzasNeeded` against every valid row of the week 1 lesson's expected-results table. Every line should say PASS:

```text
PASS: countPizzasNeeded(0) returned 0, expected 0
PASS: countPizzasNeeded(1) returned 1, expected 1
PASS: countPizzasNeeded(8) returned 1, expected 1
PASS: countPizzasNeeded(9) returned 2, expected 2
PASS: countPizzasNeeded(16) returned 2, expected 2
PASS: countPizzasNeeded(17) returned 3, expected 3
```
