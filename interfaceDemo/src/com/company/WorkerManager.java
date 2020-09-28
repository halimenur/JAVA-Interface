package com.company;

public class WorkerManager {
    private IWorkable workable;
   private IPayable payable;
   private IEatable eatable;
    public WorkerManager(IWorkable workable){
        this.workable=workable;
    }
    public WorkerManager(IPayable payable){
        this.payable=payable;
    }
    public WorkerManager(IEatable eatable){
        this.eatable=eatable;
    }
    public  void work(){
        workable.work();
    }
    public  void pay(){
        payable.pay();
    }
    public  void eat(){
        eatable.eat();
    }
}
