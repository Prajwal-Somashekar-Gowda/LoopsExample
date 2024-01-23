public class Main {

    public static void main(String[] args){
                    //0   1   2   3   4
        char[] arr ={'a','b','c','d','e'};

        for(int i = 0;i<5;i++){
            System.out.println("i: "+ i);
            System.out.println(arr[i]);
        }
        //foreach loop
        for(char ch: arr){
            System.out.println(ch);
        }

        int charint = 0;

        while ( (char)charint != 'g'){
            System.out.println("int: "+ charint);
            charint++;
        }
        System.out.println("char: "+ (char)charint);


        //do-while 
        int index = 0;

        do{
            System.out.println(index++);
            System.out.println("idiot");
        }while (index < 0);
        System.out.println("index: " + index);





    }
}
