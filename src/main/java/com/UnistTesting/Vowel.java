package com.UnistTesting;

public class Vowel {
    char[] vowels = {'a','o','u','e','i','y','A','O','U','E','I','Y'};

    public int vowelCount(String string){
        //throw new java.lang.UnsupportedOperationException("Not Implemented");
        if(string == null) return 0;
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(isVowel(string.charAt(i))) count++;
        }
        return count;
    }
    public boolean isVowel(char c){
        for (char x:vowels){
            if(c==x) return true;
        }
        return false;
    }
}
