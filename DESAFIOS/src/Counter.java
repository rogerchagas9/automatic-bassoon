import java.time.LocalDateTime;

public class Counter {

public static void main(String[] args) {
    int a = 0;

    System.out.println();
    System.out.println("Inicio: " + LocalDateTime.now());
    while (a < 2147483647 ) {
        a++;   
        //System.out.println(a); 
    }
    System.out.println("Fim: " + LocalDateTime.now());
}

}
