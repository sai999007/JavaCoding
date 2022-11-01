public class PrintAtoZ {

    public static void main(String[] args) {
        char i ;

        System.out.println("The Alphabet from A to Z are ");

        for(i='A';i<='Z';i++){
            System.out.println(i);
        }

        for (i = 'a'; i <= 'z'; i++) {
            // Print the alphabet
            System.out.println(i);
        }

        for(i='Z';i>='A';i--){
            System.out.print(i);
        }
        System.out.print("\n");
        for(i='z';i>='a';i--){

            System.out.print(i);
        }
        System.out.print("\n");
        System.out.print(i);


        for(int k = 65; k <= 90; k++)
        {
//            System.out.printf("%c ", k);

            System.out.print( k);
        }


        for(int k = 1; k <= 115; k++)
        {
            System.out.printf("%c ", k);
//            System.out.println("");

//            System.out.printf( k);
        }

    }


}
