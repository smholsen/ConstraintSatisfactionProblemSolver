package ov5;


public class Main {

    public static void main(String[] args) {
        Ov.CSP prob = new Ov().createMapColoringCSP();
        prob.backtrackingSearch();
    }

}
