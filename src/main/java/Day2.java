public class Day2 {

    public static void main(String args[]){

        Double data=105.0;
        System.out.println("modulus of 10 = "+ data%2);
        Double result = data / 2;
        System.out.println("result="+result);
        Integer value= 100;
        value--;
        System.out.println(value);
        Boolean isActive = false;
        System.out.println(!isActive);
        System.out.println(isActive);
        Double numberOne=500.0;
        Float numberTwo=505.0f;
        // he can go out if no RAIN AND HOMEWORK DONE
        Boolean isRaining = true;
        Boolean homeWorkDone = true;
        Boolean canHeGoOut = ! isRaining && homeWorkDone;
        System.out.println("can he go out ? : "+ canHeGoOut);
        // recharge phone if charge < 20% or no network
        Integer battery = 19;
        Boolean hasNetwork = true;
        Boolean needsRecharge = ( battery < 20) || (!hasNetwork);
        System.out.println("Needs recharge:"+needsRecharge);

        if(true){
            // true part
            System.out.println("true");
        }
        else
        {
            // flase part
            System.out.println("false");
        }

         Boolean isGrater = (50>40) ? true : false;
        System.out.println("is grater:"+ isGrater);

        Boolean neeedsUpper = true;
        String companyName = "ford";
        String name = neeedsUpper ? companyName.toUpperCase() : companyName.toLowerCase();

        System.out.println("company name :"+name);

        Integer finalResult = 100;

        if( finalResult instanceof Integer)
            System.out.println("its a integer ");
        else
            System.out.println("not a integer");
        String outPut = (finalResult instanceof Integer) ? "Integer":"not a Integer";

        Integer binary = 0b1111;
        Integer binaryResult = ~binary;
        System.out.println(Integer.toBinaryString(binaryResult));
        System.out.println(binary);
        System.out.println(binaryResult);
        Integer sampleData = 2;
        System.out.println(sampleData << 2);
        System.out.println(sampleData );
        System.out.println(sampleData >> 1);
        Integer binaryOne = 0b0001;
        Integer binaryTwo = 0b0011;
        Integer binaryAnd = binaryOne & binaryTwo;
        System.out.println("Binary AND i.e & :"+Integer.toBinaryString(binaryAnd));
        Integer binaryOr = binaryOne | binaryTwo;
        System.out.println("Binary OR i.e | :"+Integer.toBinaryString(binaryOr));
        System.out.println("Binary OR i.e | :"+binaryOr);

        // check if light number 3 is off or On
        byte roomLight = 0b00001011;
        byte light3Mask = 0b00000001;
        int light3On = light3Mask & (roomLight >> 2);
        System.out.println("Light 3 is :" + (light3On==1?"ON":"OFF"));

        byte light3AndMask = 0b00000100;
        int light3IsOn = roomLight & light3AndMask;
        System.out.println("light 3 is :"+ (light3IsOn==4 ? "ON":"OFF" ));
        // check if user has write permission on file; read=4,write=2,execute=1;
        byte userPermission = 0b0000;
        byte writeMask = 0b0010;
        int heCanWrite = userPermission & writeMask;
        if(heCanWrite==2){
            System.out.println("User has write permission");
        }
        else {
            System.out.println("User has no write permission , giving write access...");
            byte writePermit = 0b0010;
            userPermission = (byte) (userPermission | writePermit);
            System.out.println("Write access given to user !"+Integer.toBinaryString(userPermission));
        }




        // code continues
        System.out.println("Application ends here");



    }
}
