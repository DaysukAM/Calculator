package fr.Daysuk.calculator;

public class Service {

    private String Stringtocalc;
    private String nb1string, nb2string;
    private double nb1 = 0, nb2 = 0;

    public Service(String Stringtocalc) {
        this.Stringtocalc = Stringtocalc;

    }

    public String getStringtocalc() {
        return Stringtocalc;
    }

    public double getResult() {
        double result = 0;
        String operator = "";
        Boolean issecond = false;
        nb1 = 0;
        nb2 = 0;
        nb1string = "";
        nb2string = "";
        String[] Stringtocalctab = Stringtocalc.split("");
        for (int x = 0; x < Stringtocalc.length(); x++) {
            if (Stringtocalctab[x].equals("X") || Stringtocalctab[x].equals("-") || Stringtocalctab[x].equals("+") || Stringtocalctab[x].equals("/"))

            {
                System.out.println(operator);
                operator = Stringtocalctab[x];
                System.out.println(operator);
                issecond = true;
            }else {
                if (issecond) {
                    nb2string = nb2string + Stringtocalctab[x];
                    nb2 = Integer.parseInt(nb2string);
                    System.out.println(nb2);
                } else {
                    nb1string = nb1string + Stringtocalctab[x];
                    nb1 = Integer.parseInt(nb1string);
                    System.out.println(nb1);
                }
            }


        }
        if (operator.equals("")){
            result = nb1;
        }else if (operator.equals("X")){
            result = nb1 * nb2;
        }else if (operator.equals("-")){
            result = nb1 - nb2;
        }else if (operator.equals("+")){
            result = nb1 + nb2;
        }else if (operator.equals("/")){
            result = nb1/nb2;
        }

        return result;
    }
}