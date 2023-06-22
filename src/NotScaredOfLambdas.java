/*My favourite resource about lambdas is https://dev.java/learn/lambdas/first-lambdas/
Note that NotScaredOfLambdas has only one abstract method, making it a functional interface
The type of a lambda expression must be a functional interface*/
public interface NotScaredOfLambdas{
    void method1();
    //method1 is an abstract method–it is declared in the interface but not implemented

    static void sayHi(){
        System.out.println("\nHi!");
    }
    //sayHi() is another example of a static method

}
