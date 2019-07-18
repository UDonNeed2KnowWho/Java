package com.sonnyLowe;

public class bankAccountChallenge {

    private int accountNum;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNum;

    // *******
    public void setAccountNum(int accountNum){
        this.accountNum = accountNum;
    }
    public int getAccountNum(){
        return this.accountNum;
    }
    // *******
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return this.balance;
    }
    // *******
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    // *******
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    // *******
    public void setPhoneNum(int phoneNum){
        this.phoneNum = phoneNum;
    }
    public int getPhoneNum(){
        return this.phoneNum;
    }
    // *******

    public static int addBalance(int addNum, int balance){
        balance = balance + addNum;
        return balance;
    }

    public static int takeBalance(int takeNum, int balance){
        balance = balance - takeNum;
        return balance;
    }


}
