package com.company;

public class Main {

    public static void main(String[] args) {
        //Abstractlar gibi newlenemezler çünkü içinde yok
//             ICustomerDal customerDal=new ICustomerDal() {
//                 @Override
//                 public void add() {
//
//                 }
//             }

        //interfaceler imza taşırlar
        //Referans tutar
        //ICustomerDal customerDal=new OracleCustomerDal();

        //CustomerManager daki customerDal artık Oracle olmuş oldu
        CustomerManager  customerManager=new CustomerManager(new OracleCustomerDal());

        customerManager.add();


    }
}
