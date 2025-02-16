
//Multiple classes can be defined within the same source file if needed for encapsulation purposes, like in this example:
public class MultipleClassesInSameFile {
    public static void main(String[] args) {
        System.out.println(generateMessage.generatemessage());
        System.out.println(generateAnotherMessage.generateAnotherMessage());

    }

    class generateMessage{
        static  String generatemessage(){
            return "this is one message";
        }
    }

    class generateAnotherMessage{
        static  String generateAnotherMessage(){
            return "this is another message";
        }
    }
}
