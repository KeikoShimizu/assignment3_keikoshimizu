//Here's the SUPERCLASS
/**
* Write a description of class Circuit here.
*
* @author (your name)
* @version (a version number or a date)
*/

public class Circuit {
    public double getResistance(){ return 0; }
}


//... And the SUBCLASSES BELOW

//Subclass Resistor
/**
* Write a description of class Resistor here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Resistor extends Circuit { 
    private double resistance;

    public Resistor(double r) { resistance =r; }
    public double getResistance() { return resistance;  }
}


//Subclass Serial
/**
* Write a description of class Serial here.
*
* @author (your name)
* @version (a version number or a date)
*/

import java.util.ArrayList;

public class Serial extends Circuit {
    private ArrayList<Circuit> c = new ArrayList<Circuit>();
    double total=0;
    public Serial(Circuit a, Circuit b) { c.add(a); c.add(b);}
    public double getResistance() {
        for(int i=0; i < c.size(); i++)
        { total = c.get(i).getResistance()+total;}
    
        return total;
    }
}


//Subclass Parallel
/**
* Write a description of class Parallel here.
*
* @author (your name)
* @version (a version number or a date)
*/

import java.util.ArrayList;

public class Parallel extends Circuit {
    private ArrayList<Circuit> c = new ArrayList<Circuit>();
    double total = 0;
    public Parallel(Circuit a, Circuit b) { c.add(a);c.add(b);}
    public double getResistance() {
        for(int i=0; i < c.size(); i++){
        total = c.get(i).getResistance()+total;
        }
        return(1.0/total);
    }
}

System.out.println("Combined resistance: " + circuit1.getResistance());


//Subclass Circuit Demo
/**
* Write a description of class CircuitDemo here.
*
* @author (your name)
* @version (a version number or a date)
*/
// public class CircuitDemo {
//     public static void main(String[] args){
//         Circuit a = new Resistor(3.0);
//         Circuit b = new Resistor(6.0);
//         Circuit c = new Resistor(5.0);
//         Circuit d = new Serial(a,b);
//         Circuit f = new Parallel(c,d);

//         double R = f.getResistance();

//         System.out.println(" 5 ohm ");
//         System.out.println("|--------^^^^^^^^^^^^--------|");
//         System.out.println("||");
//         System.out.println("||");
//         System.out.println("|--^^^^^^------^^^^^^^------|");
//         System.out.println(" 3 ohm 6 ohm ");
//         System.out.println(" "+a.getResistance()+" & "+b.getResistance()+" are connected in series and "+c.getResistance()+" is connected in parallel");
//         System.out.printf(" total Resistance of the circcuit:%2f ohm", R);
//         System.out.println();
//     }
// }