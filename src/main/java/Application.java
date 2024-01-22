import deco.Chocolat;
import deco.Lait;
import deco.Noisette;
import deco.Vanille;
import produits.Boisson;
import produits.Deca;
import produits.Espresso;
import produits.Sumatra;

import java.io.*;
import java.util.zip.ZipOutputStream;

public class Application {
    public static void main(String[] args) throws Exception {

        Boisson boisson;
        boisson =new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------------");

         boisson=new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("---------------");
        boisson =new Noisette(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------------");

         boisson =new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("---------------");


          Boisson b=new Vanille(new Chocolat(new Chocolat(new Chocolat(new Sumatra()))));
        System.out.println(b.getDescription());
        System.out.println(b.cout());
/*
        BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream(new File("Data.csv"))));
        String str=br.readLine();

        OutputStream os= new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(new File("doc.zip"))));
        os.write(345);*/
    }
}
