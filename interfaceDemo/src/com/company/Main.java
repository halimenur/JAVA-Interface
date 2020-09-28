package com.company;

public class Main {

    public static void main(String[] args) {
	//Bir şirket için otomasyon yazılması
//   WorkerManager  workerManager=new WorkerManager(new OutSourceWorker());
//   workerManager.work();

        WorkerManager workerManager=new WorkerManager((IPayable) new Worker());
        workerManager.pay();

    }
}
