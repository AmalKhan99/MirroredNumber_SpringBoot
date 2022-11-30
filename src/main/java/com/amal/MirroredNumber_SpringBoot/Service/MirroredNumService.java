package com.amal.MirroredNumber_SpringBoot.Service;

import org.springframework.stereotype.Service;

@Service
public class MirroredNumService {
    public boolean checkPalindrome(int number) {
        int temp = number;
        int sum=0;
        while (number > 0) {
            int r = number % 10;  //getting remainder
            sum = (sum * 10) + r;
            number = number / 10;
        }
        if (temp == sum)
           return true;
        else
            return false;
    }
}



