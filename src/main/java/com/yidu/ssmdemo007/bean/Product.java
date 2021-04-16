package com.yidu.ssmdemo007.bean;

public class Product {
    private int pid;
    private  String pname;
    private  int pnum;
    private  String price;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPnum() {
        return pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(int pid, String pname, int pnum, String price) {
        this.pid = pid;
        this.pname = pname;
        this.pnum = pnum;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pnum=" + pnum +
                ", price='" + price + '\'' +
                '}';
    }
}
