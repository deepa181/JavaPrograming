public class Main {
    public static void main(String[] args) {
        double myDoubleVariable = 20.00d;
        double mySecDoubleVariable = 80.00d;
        double totalSumDouble = (myDoubleVariable + mySecDoubleVariable) * 100.00d;
        double remainder = totalSumDouble % 40.00d;

        System.out.println("\n myDoubleVariable =" + myDoubleVariable);
        System.out.println("\n mySecDoubleVariable =" + mySecDoubleVariable);
        System.out.println("\n totalSumDouble =" + totalSumDouble);
        System.out.println("\n remainder =" + remainder);

        boolean boolVar = (remainder == 0) ? true : false;

        System.out.println("\n Boolean Variable =" + boolVar);

        if(!boolVar)
        {
            System.out.println("\n Got Some water");
        }
    }
}