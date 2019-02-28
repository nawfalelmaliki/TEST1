package fr.nolito;
import java.util.Scanner;
import java.util.*;
public class PrintName {

    String nom ;
    String prenom;
    int nombre;
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
        System.out.println("votre nom est"+p.get_nom());
    }
}
