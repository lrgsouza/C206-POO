import java.util.*;

public class Main {
    public static void main(String[] args) {
        int globalloop = 100000;
        long Ti;
        long Tf;
        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
        Map<Integer,Integer> hashMap = new HashMap<>();



        //inserindo Array
        Ti = System.currentTimeMillis();
        for (int i = 0; i < globalloop; i++) {
            arrayList.add(i);
        }
        //tempo add array
        Tf = System.currentTimeMillis();
        long tempo = Tf - Ti;
        System.out.println("Tempo de inserção Arraylist: "+tempo);

        //buscando array
        Ti = System.currentTimeMillis();
        for (int i = 0; i < globalloop; i++) {
            arrayList.contains(i);
        }
        //verificando tempo Array
        Tf = System.currentTimeMillis();
        tempo = Tf - Ti;
        System.out.println("Tempo de leitura Arraylist: "+tempo);

        //inserindo hash
        Ti = System.currentTimeMillis();
        for (int i = 0; i < globalloop; i++) {
            hashSet.add(i);
        }
        //verificando tempo
        Tf = System.currentTimeMillis();
        tempo = Tf - Ti;
        System.out.println("Tempo de inserção HashSet: "+tempo);

        //lendo hash
        Iterator<Integer> it = hashSet.iterator();
        Ti = System.currentTimeMillis();
        for (int i = 0; i < globalloop; i++) {
            hashSet.contains(i);
        }
        //verificando tempo
        Tf = System.currentTimeMillis();
        tempo = Tf - Ti;
        System.out.println("Tempo de leitura HashSet: "+tempo);


        //inserindo Map
        Ti = System.currentTimeMillis();
        for (int i = 0; i < globalloop; i++) {
            hashMap.put(i,i);
        }
        //verificando tempo
        Tf = System.currentTimeMillis();
        tempo = Tf - Ti;
        System.out.println("Tempo de inserção HashMap: "+tempo);


        //lendo Map
        Ti = System.currentTimeMillis();
        for (int i = 0; i < globalloop; i++) {
            hashMap.containsKey(i);
        }
        //verificando tempo
        Tf = System.currentTimeMillis();
        tempo = Tf - Ti;
        System.out.println("Tempo de leitura HashMap: "+tempo);






    }
}
