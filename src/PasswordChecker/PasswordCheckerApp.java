package PasswordChecker;

import java.io.*;

public class PasswordCheckerApp {
    public static void main(String[] args) {

        String filepath = "C:\\Users\\Sh3berw0k\\Desktop\\JavaTut\\Refresher\\PasswordChars.txt";
        File file = new File(filepath);
        //String password= null;
        String[] passwords = new String[13];


        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < passwords.length; i++) {
                passwords[i] = br.readLine();
                System.out.println(passwords[i]);
                passWordValidate(passwords[i]);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File could not be read");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR: Could not read password characters");
            e.printStackTrace();
        }

    }
//Password Validate Conditions
    public static void passWordValidate(String passwd) {
        try {
            if (!passwd.matches(".*[0-9].*]")) {
                throw new NumberInPassword(passwd);
            }
            if (!passwd.matches(".*[a-zA-Z+.*]")) {
                throw new LetterInPassword(passwd);
            }
            if (!passwd.contains("!") || (!passwd.contains("@") || (!passwd.contains("@")))) {
                throw new SpecialCharacterFound(passwd);
            }
            //System.out.println(passwd);
        } catch (NumberInPassword e) {
            System.out.println("EXCEPTION: NumberInPassword Exception");
            //System.out.println(e.toString());
        } catch (LetterInPassword e) {
            System.out.println("EXCEPTION :LetterInPassword Exception");
           //System.out.println(e.toString());
        } catch (SpecialCharacterFound e) {
            System.out.println("EXCEPTION: SpecialCharacterFound Exception");
            //System.out.println(e.toString());
        }
    }
}


//NoNumberInPassword Exception
class NumberInPassword extends Exception {
    String noumberpassword;

    NumberInPassword(String password) {
        this.noumberpassword = noumberpassword;
    }

    @Override
    public String toString() {
        return ("NumberInPassword Exception" + noumberpassword);
    }
}

//No Letter found in password
class LetterInPassword extends Exception {
    String letterpassword;

    LetterInPassword(String letterpassword) {
        this.letterpassword = letterpassword;
    }

    @Override
    public String toString() {
        return ("LetterInPassword Exception" + letterpassword);
    }
}
//Special character Exception
class SpecialCharacterFound extends Exception {
    String specialCharpass;

    SpecialCharacterFound(String specialChar) {
        this.specialCharpass = specialChar;
    }

    @Override
    public String toString() {
        return ("SpecialCharacterFound Exception " + specialCharpass);
    }
}

