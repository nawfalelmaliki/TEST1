package fr.nolito;
import java.util.Scanner;
import java.util.*;
public class PrintName {

    String nom ;
    int nombre;
    int a;
    public  void set_nom(String  xx)
    {
        nom=xx;
    }
    public String get_nom()
    {

        return this.nom;
    }
    public static void main(String[] args){
        PrintName p = new PrintName();
        p.set_nom("nawfal");
        System.out.println("votre nom est"+p.get_nom());
    }
}
