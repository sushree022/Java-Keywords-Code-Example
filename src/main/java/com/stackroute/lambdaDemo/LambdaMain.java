package com.stackroute.lambdaDemo;

public class LambdaMain {
    public static void main(String [] args)
    {
//        traditional method
        new Thread(new RunnableDemo()).start();
//        By ann
        new Thread(new RunnableDemo(){
            @Override
            public void run() {
                System.out.println("anno method");
            }
        });
//        by lambda expression
        new Thread(()->
        {System.out.println("ok");
            System.out.println("second line");
        }).start();
    }

}
