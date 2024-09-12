package br.com.moacyr.e_class_attribute_methods_static.d_challenge.entities;

public class Bill {

    private char gender;
    private int beer;
    private int barbecue;
    private int softDrink;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBeer() {
        return beer;
    }

    public void setBeer(int beer) {
        this.beer = beer;
    }

    public int getBarbecue() {
        return barbecue;
    }

    public void setBarbecue(int barbecue) {
        this.barbecue = barbecue;
    }

    public int getSoftDrink() {
        return softDrink;
    }

    public void setSoftDrink(int softDrink) {
        this.softDrink = softDrink;
    }

    public double cover(){

        if (feeding() > 30.0){

            return 0.0;
        }
        else{
            return 4.0;
        }
    }

    public double feeding(){

        return  this.beer * 5.0
                + this.softDrink * 3.0
                + this.barbecue * 7.0;

    }

    public double ticket(){

        if (this.gender == 'M'){

            return 10.0;
        }
        else{
            return 8.0;
        }
    }

    public double total(){

        return feeding() + cover() + ticket();
    }
}