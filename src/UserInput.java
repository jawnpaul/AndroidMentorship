/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john
 */
public class UserInput {

    public static class TextInput {

        String value = "";

        public void add(char c) {
            value += c;
        }

        public String getValue() {
            return value;
        }
    }

    public static class NumericInput extends TextInput {

        @Override
        public void add(char c) {
            if (c <= '9') {
                value += c;
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }

}
