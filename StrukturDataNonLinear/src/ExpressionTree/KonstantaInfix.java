/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExpressionTree;

/**
 *
 * @author old
 */
class KonstantaInfix {

    char operator[] = {'+', '-', '*', '/', '^'};
    char operand[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 
        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
        'U', 'V', 'W', 'X', 'Y', 'Z',
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private char data;

    public KonstantaInfix() {
        data = ' ';
    }

    public void setData(char data_in) {
        data = data_in;
    }

    public boolean isOperator() {
        for (int i = 0; i < operator.length; i++) {
            if (data == operator[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean isOperand() {
        for (int i = 0; i < operand.length; i++) {
            if (data == operand[i]) {
                return true;
            }
        }
        return false;

    }
}