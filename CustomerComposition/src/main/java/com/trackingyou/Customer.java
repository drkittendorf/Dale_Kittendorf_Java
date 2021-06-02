package com.trackingyou;

public class Customer {

    //name, contact, shipping, billing
    private String accountNumber;
    private Boolean rewardsMember;

    private Name name;
    private Billing billing;
    private Shipping shipping;
    private Contact contact;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Boolean getRewardsMember() {
        return rewardsMember;
    }

    public void setRewardsMember(Boolean rewardsMember) {
        this.rewardsMember = rewardsMember;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
