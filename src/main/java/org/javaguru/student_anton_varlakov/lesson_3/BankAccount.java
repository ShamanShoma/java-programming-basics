package org.javaguru.student_anton_varlakov.lesson_3;

import java.util.Scanner;

class BankAccount {

    private String owner;

    private int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    public BankAccount(String owner) {
        this.owner = owner;
        this.money = 0;
    }

    public BankAccount(int money) {
        this.money = money;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public void delMoney() {
        this.money -= money;
    }

}
