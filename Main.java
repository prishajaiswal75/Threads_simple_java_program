//Prisha Jaiswal
//AIML B1
//23070126095
class Main{
    public static void main(String args[]){
        //Mythread t = new MyThread();
        //t.start();
        new Thread(new MyThread(1,3,3000)).start();
        new Thread(new MyThread(100,50,1000)).start();
    }
}

