package deco;

import produits.Boisson;

public class Noisette extends  DecorateurBoisson{

    public Noisette(Boisson boisson){
        super(boisson);
    }

    public String getDescription(){
        return  boisson.getDescription()+" Au Noisette";
    }
    @Override
    public double cout() {
        return 1.2+boisson.cout();
    }
}
