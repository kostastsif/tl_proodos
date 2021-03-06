package com.example.tl_proodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals extends AppCompatActivity {
    public static String toRoman(int Int) {
        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
        roman_numerals.put("X", 10);
        roman_numerals.put("IX", 9);
        roman_numerals.put("VIII", 8);
        roman_numerals.put("VII", 7);
        roman_numerals.put("VI", 6);
        roman_numerals.put("V", 5);
        roman_numerals.put("IV", 4);
        roman_numerals.put("III", 3);
        roman_numerals.put("II", 2);
        roman_numerals.put("I", 1);
        String res = "";
        for(Map.Entry<String, Integer> entry : roman_numerals.entrySet()){
            int matches = Int/entry.getValue();
            res += repeat(entry.getKey(), matches);
            Int = Int % entry.getValue();
        }
        return res;
    }
    public static String repeat(String s, int n) {
        if(s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}