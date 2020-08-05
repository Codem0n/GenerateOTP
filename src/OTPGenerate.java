package com.codemon;
public class OTPGenerate {
    public static void main(String[] args)
    {
        System.out.println(generateOTP());
    }
        private static int generateOTP()
        {
        int otp = (int) (Math.random()*1000000);
                return otp;
    }
}
