public class testClass {
    public static void main(String[] args) {
        Solution<Integer,Double,String> solo = new Solution<Integer,Double,String>();

        solo.newArrayList(54);
        solo.newArrayList(228);
        solo.newArrayList(1337);

        solo.newHashSet(1);
        solo.newHashSet(0);
        solo.newHashSet(-1);

        solo.newHashMap(90.10,"botwa");
        solo.newHashMap(2.0, "zashkwar");
        solo.newHashMap(100.1,"compton");

        solo.print();


    }
}
