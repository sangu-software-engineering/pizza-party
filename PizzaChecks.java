public class PizzaChecks {
    // Checks the real rule in PizzaPartyPlanner rather than a copy,
    // so a change to the rule is always checked.
    static void check(int slicesWanted, int expectedPizzas) {
        int actual = PizzaPartyPlanner.countPizzasNeeded(slicesWanted);
        String status = "FAIL";
        if (actual == expectedPizzas) {
            status = "PASS";
        }
        System.out.println(status + ": countPizzasNeeded(" + slicesWanted + ") returned "
                + actual + ", expected " + expectedPizzas);
    }

    public static void main(String[] args) {
        check(0, 0);
        check(1, 1);
        check(8, 1);
        check(9, 2);
        check(16, 2);
        check(17, 3);
    }
}
