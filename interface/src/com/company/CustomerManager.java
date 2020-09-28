package com.company;

public class CustomerManager {
    //1.yöntem
    //Bu kullanıma doğrudur ama kod yazarken hata vermez çalıırken hata verir

//    ICustomerDal customerDal;
//    public void add(){
//        //İş kodları yazılır
//        //Müşteriyi eklemek için veriler girilcek örneğin onların doğru olup olmadığı kontrol edilir
//        customerDal.add();
//    }

    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }

    public void add(){
      customerDal.add();
    }


}
