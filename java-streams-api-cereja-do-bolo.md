## API Streams do Java
a cereja do bolo da programação funcional



### For loop X Streams API



### For loop X Streams API

Para explorar essa comparação, primeiro, vamos criar um modelo que representa uma pessoa com a seguinte estrutura:
<!-- .element: class="r-fit-text"  -->

```java 
class Pessoa {

    private final String nome;
    private final int idade;
    private final List<Pessoa> primos;

    // skipping the constructor and getters
}
```
E agora, vamos tentar resolver alguns problema comuns que podem aparecer para esso nosso tipo `Pessoa`:
<!-- .element: class="fragment fade-in r-fit-text"  -->



### Exemplo 01



### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->



### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-trim
data-line-numbers
>
<script type="text/template">
    private List<String> exemplo01_usandoForLoop(
            final List<Pessoa> pessoas) {
        return null;
    }
</script>
</code>
</pre>



### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-trim
data-line-numbers="3"
>
<script type="text/template">
    private List<String> exemplo01_usandoForLoop(
            final List<Pessoa> pessoas) {
        List<String> result = List.of();
        return result;
    }
</script>
</code>
</pre>




### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-trim
data-line-numbers="4,5"
>
<script type="text/template">
    private List<String> exemplo01_usandoForLoop(
            final List<Pessoa> pessoas) {
        List<String> result = List.of();
        for (int i = 0; i < result.size(); i++) {
        }
        return result;
    }
</script>
</code>
</pre>




### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-trim
data-line-numbers="5"
>
<script type="text/template">
    private List<String> exemplo01_usandoForLoop(
            final List<Pessoa> pessoas) {
        List<String> result = List.of();
        for (int i = 0; i < result.size(); i++) {
            Pessoa p = pessoas.get(i);
        }
        return result;
    }
</script>
</code>
</pre>



### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-trim
data-line-numbers="6,7"
>
<script type="text/template">
    private List<String> exemplo01_usandoForLoop(
            final List<Pessoa> pessoas) {
        List<String> result = List.of();
        for (int i = 0; i < result.size(); i++) {
            Pessoa p = pessoas.get(i);
            if (p.getIdade() > 18) {
            }
        }
        return result;
    }
</script>
</code>
</pre>



### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-trim
data-line-numbers="7"
>
<script type="text/template">
    private List<String> exemplo01_usandoForLoop(
            final List<Pessoa> pessoas) {
        List<String> result = List.of();
        for (int i = 0; i < result.size(); i++) {
            Pessoa p = pessoas.get(i);
            if (p.getIdade() > 18) {
                result.add(p.getNome());
            }
        }
        return result;
    }
</script>
</code>
</pre>




### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-trim
data-line-numbers="0-11|6|7|0-11"
>
<script type="text/template">
    private List<String> exemplo01_usandoForLoop(
            final List<Pessoa> pessoas) {
        List<String> result = List.of();
        for (int i = 0; i < result.size(); i++) {
            Pessoa p = pessoas.get(i);
            if (p.getIdade() > 18) {
                result.add(p.getNome());
            }
        }
        return result;
    }
</script>
</code>
</pre>

Modo tradicional  <!-- .element: class="fragment fade-in"  --> 

Estilo Imperativo: descrevemos explícitamente COMO o programa deve fazer suas tarefas especificando cada instrução passo a passo<!-- .element: class="fragment fade-in" style="font-size:60%" --> 

Note:
Reescrevendo essas operações dessa forma:
- filtrar as pessoas que tenham a idade maior que 18; 
- mapear a pessoa pelo seu nome;<!



### Exemplo 01 - ForEach



### Exemplo 01 - ForEach

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos, usando ForEach:
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-trim
data-line-numbers="4"
>
<script type="text/template">
    private List<String> exemplo01_usandoForEach(
            final List<Pessoa> pessoas) {
        List<String> result = List.of();
        for (Pessoa p: pessoas);
            if (p.getIdade() > 18) {
                result.add(p.getNome());
            }
        }
        return result;
    }
</script>
</code>
</pre>

Modo tradicional: Estilo imperativo - é utilizado `Iterator` por baixo dos panos; 
<!-- .element: class="fragment fade-in"  --> 

Note:
Reescrevendo essas operações dessa forma:
- filtrar as pessoas que tenham a idade maior que 18; 
- mapear a pessoa pelo seu nome;<!




### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-line-numbers data-trim>
<script type="text/template">
    private List<String> exemplo01_usandoStreamAPI(
            final List<Pessoa> pessoas) {
        return null;
    }
</script>
</code>
</pre>




### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-trim
data-line-numbers="4"
>
<script type="text/template">
    private List<String> exemplo01_usandoStreamAPI(
            final List<Pessoa> pessoas) {
        List<String> result = pessoas
                .stream()
        return null;
    }
</script>
</code>
</pre>




### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-trim
data-line-numbers="5"
>
<script type="text/template">
    private List<String> exemplo01_usandoStreamAPI(
            final List<Pessoa> pessoas) {
        List<String> result = pessoas
                .stream()
                .filter(p -> p.getIdade() > 18)
        return null;
    }
</script>
</code>
</pre>
  



### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-trim
data-line-numbers="6"
>
<script type="text/template">
    private List<String> exemplo01_usandoStreamAPI(
            final List<Pessoa> pessoas) {
        List<String> result = pessoas
                .stream()
                .filter(p -> p.getIdade() > 18)
                .map(p -> p.getNome())
        return null;
        
    }
</script>
</code>
</pre>




### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-trim
data-line-numbers="7"
>
<script type="text/template">
    private List<String> exemplo01_usandoStreamAPI(
            final List<Pessoa> pessoas) {
        List<String> result = pessoas
                .stream()
                .filter(p -> p.getIdade() > 18)
                .map(p -> p.getNome())
                .collect(toList());
        return null;
        
    }
</script>
</code>
</pre>





### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-trim
data-line-numbers="8|1-9|3,8"
>
<script type="text/template">
    private List<String> exemplo01_usandoStreamAPI(
            final List<Pessoa> pessoas) {
        List<String> result = pessoas
                .stream()
                .filter(p -> p.getIdade() > 18)
                .map(p -> p.getNome())
                .collect(toList());
        return result;
    }
</script>
</code>
</pre>




### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-trim
data-line-numbers="3|1-8"
>
<script type="text/template">
    private List<String> exemplo01_usandoStreamAPI(
            final List<Pessoa> pessoas) {
        return pessoas
                .stream()
                .filter(p -> p.getIdade() > 18)
                .map(p -> p.getNome())
                .collect(toList());
    }
</script>
</code>
</pre>

Aqui estamos utilizando a API Streams!
<!-- .element: class="fragment fade-in"  -->




### Exemplo 01

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code data-trim
data-line-numbers="4|5|6|7|1-8"
>
<script type="text/template">
    private List<String> exemplo01_usandoStreamAPI(
            final List<Pessoa> pessoas) {
        return pessoas
                .stream()
                .filter(p -> p.getIdade() > 18)
                .map(p -> p.getNome())
                .collect(toList());
    }
</script>
</code>
</pre>

Aqui estamos utilizando a API Streams!
  
Note:
Uma vez que identificamos essas operações com os seus respectivos nomes (filter/map) nós teremos vais facilidade para entender a Stream API, tornando a leitura do código mais intuitiva:

Aqui no método `exemplo01_usandoStreamAPI`, podemos ver que fizermos o mesmo que o exemplo `exemplo01_usandoForLoop`. O que podemos ver que é fizemos isso de uma forma mais explícito. Uma vez que isso está explicita, sua leitura pode se tornar mais simples e com isso ter uma manutenção mais tranquila.





### E quanto ao pararelismo?



### Exemplo 02



### Exemplo 02

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos
<!-- .element: class="r-fit-text"  -->
Porém, utilizando paralelismo:
<!-- .element: class="fragment"  -->



### Exemplo 02

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos, porém, utilizando paralelismo:<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code  data-trim style="font-size: 70%;line-height: 1.0;"
data-line-numbers="3"
>
<script type="text/template">
    private List<String> exemplo01_usandoForLoopInParallel(
        final List<Pessoa> pessoas,
        final ExecutorService executorService) {
        final List<String> result = List.of();
        for (int i = 0; i < result.size(); i++) {
            Pessoa p = pessoas.get(i);
            if (p.getIdade() > 18) {
                result.add(p.getNome());
            }
        }
        return result;
    }
</script>
</code>
</pre>

Note:
- Para não complicar mais o que já é complicado, vamos receber um ExecutorService já definido como argumento do método



### Exemplo 02

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos, porém, utilizando paralelismo:<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code  data-trim style="font-size: 70%;line-height: 1.0;"
data-line-numbers="6|7,8,9,13,14|10,11,12"
>
<script type="text/template">
    private List<String> exemplo01_usandoForLoopInParallel(
        final List<Pessoa> pessoas,
        final ExecutorService executorService) {
        final List<String> result = List.of();
        for (int i = 0; i < result.size(); i++) {
            final Pessoa p = pessoas.get(i);
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    if (p.getIdade() > 18) {
                        result.add(p.getNome());
                    }     
                }
            });
            
        }
        return result;
    }
</script>
</code>
</pre>



### Exemplo 02

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos, porém, utilizando paralelismo:<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code  data-trim style="font-size: 70%;line-height: 1.0;"
data-line-numbers="4|4,22|3,4,22|3,4,16,22|4,11-17"
>
<script type="text/template">
    private List<String> exemplo01_usandoForLoopInParallel(
        final List<Pessoa> pessoas,
        final ExecutorService executorService) throws InterruptedException {
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
</script>
</code>
</pre>




### Exemplo 02

Dado uma lista de pessoas, listar o nome das pessoas com idade superior a 18 anos, porém, utilizando paralelismo:<!-- .element: class="r-fit-text"  -->

<pre data-id="code-animation">
<code  data-trim style="font-size: 70%;line-height: 1.0;"
data-line-numbers="|5|"
>
<script type="text/template">
    private List<String> exemplo01_usandoStreamAPIInParallel(
            final List<Pessoa> pessoas) {
        return pessoas
                .stream()
                .parallel()
                .filter(p -> p.getIdade() > 18)
                .map(p -> p.getNome())
                .collect(toList());
    }
</script>
</code>
</pre>

Aqui estamos utilizando a API Streams com processamento paralelo!
<!-- .element: class="fragment fade-in"  -->




### Legibilidade




### Legibilidade

<div class="fragment fade-in r-fit-text" style="color:white">- Tudo parece difícil quando não estamos familiarizados</div>
<div class="fragment fade-in r-fit-text" style="color:#9efffc">- Entender a complexidade pode trazer a familiaridade</div>
<div class="fragment fade-in r-fit-text" style="color:white">- Familiaridade: cada um terá a sua</div>
<div class="fragment fade-in r-fit-text" style="color:#9efffc">- O óbvio pra um pode não ser óbvio para o outro</div>
<div class="fragment fade-in r-fit-text" style="color:white">- Nem sempre familiaridade se traduz em facilidade de uso</div>
<div class="fragment fade-in r-fit-text" style="color:#9efffc">- Familiaridade é diferente de baixa complexidade</div>
</ul>



## Obrigado