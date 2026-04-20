/*
*@author:Tulika Sharad
*@version:1.0
*/
public class HelloApp_5 {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;
        for(String name : args){
            if(!first){
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }
        if (first == true) {
            System.out.println("Hello, World!");
            } else {
            System.out.println("Hello, " + nameBuilder.toString() + "!");
            }
    }
}