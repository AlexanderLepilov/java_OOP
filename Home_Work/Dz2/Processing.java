package Home_Work.Dz2;

import java.util.Scanner;

public class Processing extends FuncResult {
    public void Start() {

        Sourse sourse = new Sourse();
        Scan scan = new Scan();
        System.out.println("Для выхода - exit");
        System.out.println();
        System.out.println("Начало работы:");
        boolean flag = true;
        sourse.setNum(scan.scannerNum());
        while (flag) {
            sourse.setOperator(scan.scannerStr());
            if (sourse.getOperator().equals("+")) {
                sourse.setNum(addition(sourse.getNum(), scan.scannerNum()));
                System.out.println(sourse.getNum());
            } else if (sourse.getOperator().equals("-")) {
                sourse.setNum(substrction(sourse.getNum(), scan.scannerNum()));
                System.out.println(sourse.getNum());
            } else if (sourse.getOperator().equals("*")) {
                sourse.setNum(multiplication(sourse.getNum(), scan.scannerNum()));
                System.out.println(sourse.getNum());
            } else if (sourse.getOperator().equals("/")) {
                sourse.setNum(division(sourse.getNum(), scan.scannerNum()));
                System.out.println(sourse.getNum());
            } else {
                flag = false;
            }
        }
        // ((Scanner) scan.sc).close();
    }
}
