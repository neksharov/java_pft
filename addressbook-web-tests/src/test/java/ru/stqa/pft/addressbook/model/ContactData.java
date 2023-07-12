package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public final class ContactData {
    private final String name;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String title;
    private final String company;
    private final String address;
    private final String homephone;
    private final String mobilephone;
    private final String workphone;
    private final String email1;
    private final String email2;

    public ContactData(String name, String middlename, String lastname, String nickname, String title,
                       String company, String address, String homephone, String mobilephone, String workphone,
                       String email1, String email2) {
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.homephone = homephone;
        this.mobilephone = mobilephone;
        this.workphone = workphone;
        this.email1 = email1;
        this.email2 = email2;
    }

    public String name() {
        return name;
    }

    public String middlename() {
        return middlename;
    }

    public String lastname() {
        return lastname;
    }

    public String nickname() {
        return nickname;
    }

    public String title() {
        return title;
    }

    public String company() {
        return company;
    }

    public String address() {
        return address;
    }

    public String homephone() {
        return homephone;
    }

    public String mobilephone() {
        return mobilephone;
    }

    public String workphone() {
        return workphone;
    }

    public String email1() {
        return email1;
    }

    public String email2() {
        return email2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (ContactData) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.middlename, that.middlename) &&
                Objects.equals(this.lastname, that.lastname) &&
                Objects.equals(this.nickname, that.nickname) &&
                Objects.equals(this.title, that.title) &&
                Objects.equals(this.company, that.company) &&
                Objects.equals(this.address, that.address) &&
                Objects.equals(this.homephone, that.homephone) &&
                Objects.equals(this.mobilephone, that.mobilephone) &&
                Objects.equals(this.workphone, that.workphone) &&
                Objects.equals(this.email1, that.email1) &&
                Objects.equals(this.email2, that.email2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, middlename, lastname, nickname, title, company, address, homephone, mobilephone, workphone, email1, email2);
    }

    @Override
    public String toString() {
        return "ContactData[" +
                "name=" + name + ", " +
                "middlename=" + middlename + ", " +
                "lastname=" + lastname + ", " +
                "nickname=" + nickname + ", " +
                "title=" + title + ", " +
                "company=" + company + ", " +
                "address=" + address + ", " +
                "homephone=" + homephone + ", " +
                "mobilephone=" + mobilephone + ", " +
                "workphone=" + workphone + ", " +
                "email1=" + email1 + ", " +
                "email2=" + email2 + ']';
    }

}