/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john
 */
public class CheckPalindrome {

    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }
        word = word.toLowerCase();

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                word = word.substring(1, word.length() - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(CheckPalindrome.isPalindrome("Deleveled"));
    }

}
