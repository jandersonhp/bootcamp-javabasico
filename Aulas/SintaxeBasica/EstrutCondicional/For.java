package EstrutCondicional;
public class For {
    public static void main(String[] args) {
        // para i de 0 ate 100, imprime os impares
        for (var i = 0; i <= 100; i ++){
            // se i for par, ele não imprime
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
   
        }

    }

}
