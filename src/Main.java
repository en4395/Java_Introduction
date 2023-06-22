public class Main {

    //Generic method
    public static <T> void func1(T input){
        System.out.println("Your input is of "+input.getClass());
    }

    public static void main(String [] args) {
       //Data types
        Boolean myBool =  true;
        int num1 = 23;
        float num2 = 3.4f;
        String password = "e3$op10f!";

        System.out.println("Boolean \"myBool\" stores: "+myBool);
        System.out.println("Integer \"num1\" stores: " +num1);
        System.out.println("Float \"num2\" stores: "+num2);
        System.out.println("String \"password\" stores "+password+"\n");

        //Calling the generic method
        func1(password);
        func1(num1);
        func1(num2);
        func1(myBool);

        //Generic class instantiation
        System.out.println("ArrayOfSomething has a static variable "+ArrayOfSomething.version);
        String arrayToCopy[] = {"Apples", "Pears", "Bananas", "Red peppers", "\n"};
        ArrayOfSomething<String> testObject= new ArrayOfSomething<>(arrayToCopy);
        testObject.printArray();

        //Lambdas
        NotScaredOfLambdas.sayHi(); //Calling the functional interface's static method
        //Implementing the abstract method of functional interface NotScaredOfLambdas
        //The lambda expression begins with parameters: () or (parameter1, parameter2, parameter3, ...)
        //Arrow connects parameters and implementation
        NotScaredOfLambdas nsol = () -> System.out.println("I'm not scared of lambdas");

        for(int i = 0; i<5; i++){
            nsol.method1(); //Call method1
        }

        //Another instance of NotScaredOfLamdas
        NotScaredOfLambdas inst2 = () -> System.out.println("Lambdas are fine. I'm not scared of lambdas");
        inst2.method1();
    }
}