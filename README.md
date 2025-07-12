# Bootcamp Santander 2025 Backend Java
### DIO (Digital Innovation One)

Aqui postarei alguns exercícios e desafios do bootcamp.

### Links:
- [Bootcamp DIO](https://web.dio.me/track/fbf007ec-42df-4c8b-af3d-e8dea9448693)
- [Github Dio](https://github.com/digitalinnovationone/)

---

# Colinha Sobre POO (Gerado por IA)
# 🧭 Mapa de Conceitos da Programação Orientada a Objetos (POO) em Java

| Conceito         | Explicação simples                                                                                      | Exemplo em Java                                              |
|------------------|---------------------------------------------------------------------------------------------------------|---------------------------------------------------------------|
| **Classe**       | Molde / estrutura que define atributos e comportamentos (métodos) dos objetos.                          | `public class Pessoa { ... }`                                 |
| **Objeto**       | Instância da classe — um “objeto real” criado a partir do molde da classe.                              | `Pessoa p = new Pessoa();`                                    |
| **Instanciar**   | Ato de criar um objeto a partir de uma classe.                                                          | `new Pessoa()`                                                |
| **Atributo**     | Variável declarada dentro da classe, que define uma característica do objeto.                           | `private String nome;`                                        |
| **Método**       | Função dentro da classe que representa um comportamento do objeto.                                      | `public void falar() { ... }`                                 |
| **Getter**       | Método que **lê (retorna)** o valor de um atributo.                                                     | `public String getNome() { return nome; }`                    |
| **Setter**       | Método que **altera (define)** o valor de um atributo.                                                  | `public void setNome(String nome) { this.nome = nome; }`      |
| **Construtor**   | Método especial que roda ao criar o objeto (com `new`). Pode receber parâmetros para iniciar atributos. | `public Pessoa(String nome) { this.nome = nome; }`            |
| **Encapsulamento** | Prática de esconder os atributos (`private`) e controlar acesso com getters e setters.                | `private int idade;` + `getIdade()` / `setIdade()`            |
| **Pacote (package)** | Organização lógica dos arquivos Java, como uma pasta de classes relacionadas.                        | `package Aulas.OrientObjetos;`                                |

---

### ✅ Dicas:
- **Classe** é o molde; **objeto** é a coisa real.
- Sempre use `private` + getters/setters para praticar **encapsulamento**.
- Um `package` é como uma pasta onde você organiza suas classes.

---

### 💡 Curiosidade:
Java segue a lógica “**tudo é classe ou parte de uma classe**”. Até o método `main` está dentro de uma classe!

