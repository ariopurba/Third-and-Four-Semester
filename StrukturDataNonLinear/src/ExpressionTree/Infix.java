/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExpressionTree;

/**
 *
 * @author old
 */
public class Infix {

    char ung[];
    KonstantaInfix karinfix = new KonstantaInfix();
    StackTree opr;
    StackTree opd;

    public Infix(char ung_in[]) {
        ung = ung_in;
    }

    public int valensi(char data_in) {
        if (data_in == '^') {
            return 3;
        } else if ((data_in == '*') || (data_in == '/')) {
            return 2;
        } else if ((data_in == '+') || (data_in == '-')) {
            return 1;
        } else if ((data_in == '(')) {
            return 0;
        } else {
            return -1;
        }
    }

    public TreeNode gabung() {
        TreeNode phn = opr.Pop();
        phn.rightNode = opd.Pop();
        phn.leftNode = opd.Pop();
        return phn;
    }

    public TreeNode buatPohon() {
        char kar;
        TreeNode treeKar;
        TreeNode cek;
        opr = new StackTree();
        opd = new StackTree();

        for (int i = 0; i < ung.length; i++) {
            kar = ung[i];
            karinfix.setData(kar);
            if (kar != ' ') {
                treeKar = new TreeNode(kar);
                if (kar == '(') {
                    opr.Push(treeKar);
                } else if (kar == ')') {
                    cek = opr.Pop();
                    opr.Push(cek);
                    while (cek.data != '(') {
                        opd.Push(gabung());
                        cek = opr.Pop();
                        opr.Push(cek);
                    }
                    opr.Pop();
                } else if (karinfix.isOperator()) {
                    cek = opr.Pop();
                    opr.Push(cek);
                    while ((cek != null) && (valensi(kar) <= valensi(cek.data))) {
                        opd.Push(gabung());
                        cek = opr.Pop();
                        opr.Push(cek);
                    }
                    opr.Push(treeKar);
                } else if (karinfix.isOperand()) {
                    opd.Push(treeKar);
                } else {
                    return null;
                }
            }
        }

            cek = opr.Pop();
            opr.Push(cek);
            while (cek != null) {
                opd.Push(gabung());

                cek = opr.Pop();
                opr.Push(cek);
            }
            cek = opd.Pop();
            opr = null;
            opd = null;
            return cek;
        }
    }

