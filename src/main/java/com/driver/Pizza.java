package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private boolean hasExtraCheese;
    private boolean hasExtraToppings;
    private boolean hasPaperBag;

    private static final int VEG_BASE_PRICE = 300;
    private static final int NON_VEG_BASE_PRICE = 400;
    private static final int EXTRA_CHEESE_PRICE = 80;
    private static final int VEG_EXTRA_TOPPINGS_PRICE = 70;
    private static final int NON_VEG_EXTRA_TOPPINGS_PRICE = 120;
    private static final int PAPER_BAG_PRICE = 20;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.hasExtraCheese = false;
        this.hasExtraToppings = false;
        this.hasPaperBag = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if (!hasExtraCheese) {
            hasExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        if (!hasExtraToppings) {
            hasExtraToppings = true;
        }
    }

    public void addTakeaway(){
        if (!hasPaperBag) {
            hasPaperBag = true;
        }
    }

    public int calculateTotalPrice() {
        int totalPrice = isVeg ? VEG_BASE_PRICE : NON_VEG_BASE_PRICE;

        if (hasExtraCheese) {
            totalPrice += EXTRA_CHEESE_PRICE;
        }

        if (hasExtraToppings) {
            totalPrice += isVeg ? VEG_EXTRA_TOPPINGS_PRICE : NON_VEG_EXTRA_TOPPINGS_PRICE;
        }

        if (hasPaperBag) {
            totalPrice += PAPER_BAG_PRICE;
        }

        return totalPrice;
    }

    public String getBill(){
        StringBuilder bill = new StringBuilder();
        bill.append("Base Price Of The Pizza: ").append(isVeg ? VEG_BASE_PRICE : NON_VEG_BASE_PRICE).append("\n");
        if (hasExtraCheese) {
            bill.append("Extra Cheese Added: ").append(EXTRA_CHEESE_PRICE).append("\n");
        }
        if (hasExtraToppings) {
            bill.append("Extra Toppings Added: ").append(isVeg ? VEG_EXTRA_TOPPINGS_PRICE : NON_VEG_EXTRA_TOPPINGS_PRICE).append("\n");
        }
        if (hasPaperBag) {
            bill.append("Paperbag Added: ").append(PAPER_BAG_PRICE).append("\n");
        }
        bill.append("Total Price: ").append(calculateTotalPrice());
        return this.bill;
    }
}
