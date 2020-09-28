package com.company;
//Bizim çalıanımız
public class Worker implements IWorkable,IEatable,IPayable {
    @Override
    public void work() {
       System.out.println("Bizim çalışanımız");
    }

    @Override
    public void eat() {
System.out.println("Yemekten faydalandı");
    }

    @Override
    public void pay() {
System.out.println("Parası verildi");
    }
}
