
///usr/bin/env jbang "$0" "$@" ; exit $?
// JAVA 17+
import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplo {

    public static void main(String... args) {

    }

    /**
     * Dado uma lista de pessoas, listar o nome de todas as pessoas
     * que forem tenham idade maior que 18 anos
     * 
     * @param pessoas uma lista de pessoas
     * @return uma lista de nomes
     */
    private static List<String> exemplo01_usandoForLoop(final List<Pessoa> pessoas) {
        List<String> result = List.of();
        for (int i = 0; i < result.size(); i++) {
            Pessoa p = pessoas.get(i);
            if (p.getIdade() > 18) {
                result.add(p.getNome());
            }
        }
        return result;
    }

    /**
     * Dado uma lista de pessoas, listar o nome de todas as pessoas
     * que forem tenham idade maior que 18 anos
     * 
     * @param pessoas uma lista de pessoas
     * @return uma lista de nomes
     * @throws InterruptedException
     */
    private static List<String> exemplo01_usandoForLoopInParallel(
        final ExecutorService executorService,
        final List<Pessoa> pessoas) throws InterruptedException {
        final CountDownLatch countDownLatch=new CountDownLatch(pessoas.size());

        final List<String> result = List.of();
        for (int i = 0; i < result.size(); i++) {
            final Pessoa p = pessoas.get(i);
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try{
                        if (p.getIdade() > 18) {
                            result.add(p.getNome());
                        }   
                    }finally{
                        countDownLatch.countDown();
                    }     
                }
            });
            
        }
        countDownLatch.await();
        return result;
    }

    /**
     * Dado uma lista de pessoas, listar o nome de todas as pessoas
     * que forem tenham idade maior que 18 anos
     * 
     * @param pessoas uma lista de pessoas
     * @return uma lista de nomes
     */
    private static List<String> exemplo01_usandoForEach(final List<Pessoa> pessoas) {

        List<String> result = List.of();
        for (Pessoa p : pessoas) {
            if (p.getIdade() > 18) {
                result.add(p.getNome());
            }
        }

        return result;
    }

    /**
     * Dado uma lista de pessoas, listar o nome de todas as pessoas
     * que forem tenham idade maior que 18 anos
     * 
     * @param pessoas uma lista de pessoas
     * @return uma lista de nomes
     */
    private static List<String> exemplo01_usandoStreamAPI(final List<Pessoa> pessoas) {

        List<String> result = pessoas
                .stream()
                .filter(p -> p.getIdade() > 18)
                .map(p -> p.getNome())
                .collect(toList());

        return result;
    }

    /**
     * Dado uma lista de pessoas, listar o nome de todas as pessoas
     * que forem tenham idade maior que 18 anos
     * 
     * @param pessoas uma lista de pessoas
     * @return uma lista de nomes
     */
    private static List<String> exemplo01_usandoStreamAPIInParallel(final List<Pessoa> pessoas) {

        List<String> result = pessoas
                .stream()
                .parallel()
                .filter(p -> p.getIdade() > 18)
                .map(p -> p.getNome())
                .collect(toList());

        return result;
    }

}
