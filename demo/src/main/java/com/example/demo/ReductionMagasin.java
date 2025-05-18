package com.example.demo;

public class ReductionMagasin {


    public boolean estElligibleReduction(double montantArticle, boolean carteMembre) {
        if (montantArticle <= 100.0) {
            return true;
        }
        else if(montantArticle <= 80 ) {
            if(carteMembre == true) {
                return true;
            }else{
                return false;
            }

        } else if(montantArticle >= 80  && carteMembre == true) {
            return true;
        }



        return false;
    }

}




