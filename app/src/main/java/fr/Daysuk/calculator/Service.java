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
    public double getPercent(){
        nb1 = 0;
        if (Stringtocalc.isEmpty()) {
        }else{
            String[] Stringtocalctab = Stringtocalc.split("");
            if (Stringtocalctab[0].equals("X") || Stringtocalctab[0].equals("-") || Stringtocalctab[0].equals("+") || Stringtocalctab[0].equals("/")){
                return 0;
            }
        nb1 = Double.parseDouble(Stringtocalc);
        System.out.println(nb1);

            nb1 = nb1 / 100;
        }
        return nb1;
    }

    public double getResult() {
        double result = 0;
        String operator = "";
        Boolean issecond = false;
        nb1 = 0;
        nb2 = 0;
        nb1string = "0";
        nb2string = "0";
        String[] Stringtocalctab = Stringtocalc.split("");
        if (Stringtocalctab[0].equals("X") || Stringtocalctab[0].equals("-") || Stringtocalctab[0].equals("+") || Stringtocalctab[0].equals("/")){
            return 0;
    }
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
                } else {
                    nb1string = nb1string + Stringtocalctab[x];
                }
            }


        }
        nb1 = Double.parseDouble(nb1string);
        nb2 = Double.parseDouble(nb2string);
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