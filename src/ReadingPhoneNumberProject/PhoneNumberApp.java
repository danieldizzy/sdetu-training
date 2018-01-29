package ReadingPhoneNumberProject;

import java.io.*;

public class PhoneNumberApp {
    public static void main(String[] args) {


        //This will read a text file and will retrieve a phone Number
        String filepath = "C:\\Users\\Sh3berw0k\\Desktop\\JavaTut\\Refresher\\PhoneNumber.txt";
        File file = new File(filepath);
        String phoneNum = null;
        String[] phoneNums = new String[4];


        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i<phoneNums.length; i++) {
                phoneNums[i] = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("c");
        } catch (IOException e) {
            System.out.println("Could not read file");
        }
        //Valid Phone Number
        //10 Digits long
        //Area Code cannon start in 0 or 9
        //911 Emergency Exception
        for (int i= 0; i<phoneNums.length; i++) {
            phoneNum = phoneNums[i];
            try {
                if (phoneNum.length() != 10) {
                    throw new TenDigitsException(phoneNum);
                }


                //Checks if the Area code contains a beginning zero
                if ((phoneNum.substring(0, 1).equals("0")) || (phoneNum.substring(0, 1).equals("9"))) {
                    throw new AreaCodeException(phoneNum);
                }
                //Iterating through the values to check for a 911 Sequence
                for (int n = 0; n < phoneNum.length() - 2; n++) {
                    if (phoneNum.substring(n, (n + 1)).equals("9")) {
                        if (phoneNum.substring(n + 1, n + 3).equals("11")) {
                            throw new EmergencyException(phoneNum);
                        }
                    }
                }
                System.out.println(phoneNum);
            } catch (TenDigitsException e) {
                System.out.println("ERROR: Phone number is not 10 digits");
                System.out.println(e.toString());
            } catch (AreaCodeException e) {
                System.out.println("ERROR: Phone number has invalid area code beginning with 0: " + phoneNum);
                System.out.println(e.toString());
            } catch (EmergencyException e) {
                System.out.println("ERROR: Invalid 911 Sequence found");
                System.out.println(e.toString());
            }
        }
    }
}

class TenDigitsException extends Exception {
    String num;
    TenDigitsException(String num) {
        this.num = num;
    }
    @Override
    public String toString() {
        return ("TenDigitsException: " + num);
    }
}

class AreaCodeException extends Exception{
    String code;
    AreaCodeException(String code) {
        this.code = code;

    }
    @Override
    public String toString() {
        return ("AreaCodeException");
    }
}

class EmergencyException extends Exception{
    String emergencyCode;

    EmergencyException(String emergencyCode) {
        this.emergencyCode = emergencyCode;
    }
    @Override
    public String toString() {
        return ("Emergency Code Number");
    }
}
