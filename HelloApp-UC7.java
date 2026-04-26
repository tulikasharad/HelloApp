/*
*@author:Tulika Sharad
*@version:1.0
*/
public class HelloApp_7 {
    public static void main(String[] args) {
        String names = "World";
        if(args.length >0){
            names = String.join(", ", args);
        }
        
            System.out.println("Hello, "+names+ "!");
    }
}