import java.util.Scanner;

public class Day3 {
    public static void main(String args[]) {

        Double balance = 12000.0;
        Integer withDrawAmount = 2505;

        if (withDrawAmount < 0)
            System.out.println("Withdraw amount should not be -ve & min 100Rs");
        else if (withDrawAmount % 100 != 0)
            System.out.println("Amount should be multiple of 100");
        else if (balance >= withDrawAmount) {
            balance -= withDrawAmount; // short hand for balance = balance - withDrawAmount;
            System.out.println("Transaction successful!, Remaining balance = " + balance);
        } else {
            System.out.println("Insufficent balance, available balance:" + balance);
        }

        // cab fare calculator
        Double baseFare = 50.0;
        Double slabOneRate = 10.0; // up to 5km
        Double slabTwoRate = 8.0; // beyond 5km
        Double slabKm = 5.0;
        Double rideDistance = 5.5;
        Double totalFare = baseFare;

        if (rideDistance >= slabKm) {
            totalFare += (slabOneRate * slabKm) + (slabTwoRate * (rideDistance - slabKm));
        } else
            totalFare += slabOneRate * rideDistance;

        System.out.println("You total bill: " + totalFare);
        // for loop exercises
        for (int table = 2; table < 3; table++) {
            double result = 0.0;

            for (int index = 1; index <= 10; index++) {
                result += table * index;
                System.out.println(table + "*" + index + " = " + table * index);
            }
            System.out.println(result);
        }
// block struture in java
        { // outer block
            Integer outerData = 100;
            { // inner block
                Integer innerData = 200;
                System.out.println(outerData);
            }
            //System.out.println(innerdata);
        }
        // Array
        int data = 100;
        int[] number = new int[10];
        Integer[] wrappedNumbers = new Integer[10];
        int size = 10;

        double[] doubleArray = new double[size];
        Character[] name = new Character[10];

        int[] results = {10, 20, 30};

        System.out.println(results[2]);
        System.out.println(results.length);
        Integer[][] result = new Integer[10][10];
        Integer[][] attendance = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Integer[][][] threeD = new Integer[2][2][2];

//        Integer newData = scanner.nextInt();
//        Double doubleDat = scanner.nextDouble();
        // create array of double and store the values
        Scanner scanner = new Scanner(System.in);
        System.out.println("i/p number of subjects:");
        int numberOfSubjects = scanner.nextInt();
        Double[] scores = new Double[numberOfSubjects];
        for (int index = 0; index < numberOfSubjects; index++) {
            System.out.println("i/p score of subject :" + (index + 1));
            scores[index] = scanner.nextDouble();
        }
        Double percentage = 0.0;
        for (Double score : scores) {
            percentage += score;
            System.out.println(score);
        }
        percentage /= numberOfSubjects;
        System.out.println("% = " + percentage);
        // Temperature monitor system
        // store N days of temperature
        // Find days when tmp > 40 C
        // Find average temp
        // find how many days were colder than average
        Double[] temperatures = {30.0, 40.0, 50.0, 60.0};
        Integer days = temperatures.length;
        Integer highTemperatureDays = 0;
        Double totalTemperature = 0.0;
        Double threshould = 40.0;
        for (Double dayTemperature : temperatures) {
            totalTemperature += dayTemperature;
            if (dayTemperature > threshould) highTemperatureDays++;
        }
        Double averageTemperature = totalTemperature / days;
        Integer colderDays = 0;
        for (Double dayTemperature : temperatures) {
            if (dayTemperature < averageTemperature) colderDays++;
        }
        System.out.println("Higher temperature days:" + highTemperatureDays);
        System.out.println("Average temperature :" + averageTemperature);
        System.out.println("Colder temperature days having < average :" + colderDays);


//        if(){
//
//            if(){
//
//            }
//        }
//
//        if(){
//
//        }
//        else {
//
//        }
//
//        if(){
//
//        }
//        else if(){
//
//        }else {
//
//        }
//
//        for(int i=0;i<10;i++){
//            if(?)break;
//            if(?)continue;
//            // next instruction
//        }// enf of for loop
//     // next instruction
//
//        for(int i =0;i<10;i++){
//
//            for(int j=0;j<10;j++){
//                System.out.println("Ford");
//            }
//        }
//        switch (option){
//            case 1:
//                switch (option2){
//                    case 1:
//                        break;
//                    case 2:
//                        break;
//                    default:
//                }
//                break;//
//            case 2:
//                break;
//            default:
//        }
//        Integer numbers[] = new Integer[10];
//
//        for(Integer number:numbers){ // for each
//
//        }

        System.out.println("End of my application !");
    }
}
