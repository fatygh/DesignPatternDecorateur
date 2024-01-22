package deco;

import produits.Boisson;

public class Chantilly extends  DecorateurBoisson{

    public Chantilly(Boisson boisson){
        super(boisson);
    }

    public String getDescription(){
        return  boisson.getDescription()+" Au Chantilly";
    }
    @Override
    public double cout() {
        return 8.9+boisson.cout();
    }
}
