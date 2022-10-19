import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        LISTS
            - ARRAYLISTS
                - List<type> list1 = new ArrayList<type>()
                - List<type> list1 = new ArrayList()
                - ArrayList<type> list1 = new ArrayList()
                - list1.add(index, object)
                Obs.: List é uma interface p/ ArrayList
                - VECTOR
                    - Mais pesado que ArrayList
                    - Thread-safe collection
                    - Vários threads podem acessá-lo simultaneamente
                - LINKEDLIST
                    - Melhor performance em add() e remove()
                    - Pior em get() e set()
            - SETS
                Set<String> set1 = new HashSet<>();
                set1.add();
                Obs.: Deve usar iterator ou foreach!
            - MAPS
                Map<String, Object> map1 = new HashMap<>();
                map1.put("Larry", obj1);
                println(map1.get("Larry").getNome());

        COLLECTIONS
            - Comparable interface
            - sort()
            - max/min(Collection)
            - reverse(List)
        */

        //Sem tipo
        List list1 = new ArrayList();
        list1.add(0, "Java");
        list1.add("Python");
        list1.add(77);
        list1.add(35.9);

        System.out.println(list1);

        //Com tipo (devem ser objetos!!)
        List<String> list2 = new ArrayList();
        list2.add(0, "Inatel");
        list2.add(0, "MIT");
        list2.add(0, "Stanford");
        list2.add(0, "Harvard");
        list2.add(0, "5");

        Collections.sort(list2);
        System.out.println(list2);

        Conta conta1 = new Conta("Larry", 10000, 35000.0);
        Conta conta2 = new Conta("Darry", 20000, 215000.0);
        Conta conta3 = new Conta("Marry", 30000, 85000.0);

        List<Conta> list3 = new ArrayList<>();
        list3.add(conta1);
        list3.add(conta2);
        list3.add(conta3);

        Collections.sort(list3);
        System.out.println(list3);

        System.out.println("----------------------------");
        System.out.println("COFRE INTELIGENTE");

        //Instancias e adição de Moedas no Cofrinho
        Cofre cofrinho1 = new Cofre();
        Moeda moeda1 = new Moeda(0.05);
        Moeda moeda2 = new Moeda(1.0);
        Moeda moeda3 = new Moeda(0.5);

        cofrinho1.addMoeda(moeda1);
        cofrinho1.addMoeda(moeda2);
        cofrinho1.addMoeda(moeda3);

        //Ordenação
        cofrinho1.ordenaMoedas();

        //Maior valor
        Moeda moeda_Max = cofrinho1.getMoedaMaiorValor();
        System.out.println("Maior moeda: " + moeda_Max.getValor());

        //Quantidade de Moedas
        System.out.println("Quantidade de Moedas: " + cofrinho1.getQuantMoedas());

        //Valor total do Cofrinho
        System.out.println("Valor total: " + cofrinho1.getValorTotal());

        System.out.println("----------------------------");
        System.out.println("Collection Performance");

        //Medições inserção e busca
        double i_list;
        double i_set;
        double i_map;
        double s_list;
        double s_set;
        double s_map;

        double i_list_f;
        double i_set_f;
        double i_map_f;
        double s_list_f;
        double s_set_f;
        double s_map_f;

        double i_list_t;
        double i_set_t;
        double i_map_t;
        double s_list_t;
        double s_set_t;
        double s_map_t;

        //Números aleatórios a inserir
        Random rand_num = new Random();

        //List
        List<Integer> test_list = new ArrayList<>();

        //Set
        Set<Integer> test_set = new HashSet<>();

        //Map
        Map<Integer, Integer> test_map = new HashMap<>();

        //Inserting values
            //List
        i_list = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            test_list.add(rand_num.nextInt());
        }
        i_list_f = System.currentTimeMillis();
        i_list_t = i_list_f - i_list;

            //Set
        i_set = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            test_set.add(rand_num.nextInt());
        }
        i_set_f = System.currentTimeMillis();
        i_set_t = i_set_f - i_set;

            //Map
        i_map = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            test_map.put(rand_num.nextInt(), rand_num.nextInt());
        }
        i_map_f = System.currentTimeMillis();
        i_map_t = i_map_f - i_map;

        //Searching
        Iterator<Integer> i1 = test_list.iterator();
        s_list = System.currentTimeMillis();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        s_list_f = System.currentTimeMillis();
        s_list_t = s_list_f - s_list;

        s_set = System.currentTimeMillis();
        Iterator<Integer> i2 = test_set.iterator();
        while (i2.hasNext()){
            System.out.println(i2.next());
        }
        s_set_f = System.currentTimeMillis();
        s_set_t = s_set_f - s_set;

        s_map = System.currentTimeMillis();
        for (Map.Entry<Integer, Integer> entry: test_map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        s_map_f = System.currentTimeMillis();
        s_map_t = s_map_f - s_map;

        //Output
        System.out.println("--------------------------------");
        System.out.println("Tempo de inserção List: " + i_list_t);
        System.out.println("Tempo de inserção Set: " + i_set_t);
        System.out.println("Tempo de inserção Map: " + i_map_t);

        System.out.println("Tempo de busca List: " + s_list_t);
        System.out.println("Tempo de busca Set: " + s_set_t);
        System.out.println("Tempo de busca Map: " + s_map_t);
    }
}