package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraToppings;
    private int extraCheese;
    private int bagPrice;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        if (isVeg)
        {
            this.price=300;
            this.extraToppings=70;
        }
        if (!isVeg)
        {
            this.price=400;
            this.extraToppings=120;
        }
        extraCheese=80;
        bagPrice=20;
        isExtraCheeseAdded=false;
        isExtraToppingsAdded=false;
        isPaperBagAdded=false;
        this.bill= "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese()
    {
        // your code goes here
        if(!isExtraCheeseAdded)
        {
            this.isExtraCheeseAdded=true;
            this.price=price+extraCheese;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded)
        {
            this.price=price+this.extraToppings;
            this.isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!isPaperBagAdded)
        {
            this.price=price+bagPrice;
            this.isPaperBagAdded=true;
        }

    }

    public String getBill(){
        // your code goes here
        if (!isBillGenerated)
        {
            if (isExtraCheeseAdded)
            {
                bill=bill+"Extra Cheese Added: "+extraCheese+"\n";
            }
            if (isExtraToppingsAdded)
            {
                bill=bill+"Extra Toppings Added: "+this.extraToppings+"\n";
            }
            if (isPaperBagAdded)
            {
                bill=bill+"Paperbag Added: "+bagPrice+"\n";
            }
            bill=bill+"Total Price: "+price+"\n";
            isBillGenerated=true;

        }
        return this.bill;
    }
}