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

---

# 🧠 Atalhos úteis do VS Code para Java (Feito por IA)

## 🎯 Refatoração e Edição

| Atalho               | Ação                                                                  |
|----------------------|-----------------------------------------------------------------------|
| `F2`                 | Renomear símbolo (variável, método, classe etc.)                     |
| `Ctrl + .`           | Ações rápidas (ex: criar variável, método, extrair, implementar etc.)|
| `Alt + Shift + ↓`    | Duplicar linha abaixo                                                |
| `Alt + Shift + ↑`    | Duplicar linha acima                                                 |
| `Ctrl + D`           | Selecionar próxima ocorrência da palavra                             |
| `Ctrl + F2`          | Selecionar **todas** as ocorrências da palavra                       |

---

## 📚 Navegação no código

| Atalho               | Ação                                                      |
|----------------------|-----------------------------------------------------------|
| `F12`                | Ir para a **definição** de variável/método/classe         |
| `Ctrl + Clique`      | Mesmo que F12, mas com o mouse                            |
| `Ctrl + Shift + O`   | Ver todos os métodos/variáveis do arquivo (Outline)       |
| `Ctrl + Shift + P`   | Abrir a paleta de comandos (quase tudo que você quiser)   |
| `Ctrl + P`           | Abrir arquivo rapidamente (digite parte do nome)          |

---

## 🧪 Execução e Terminal

| Atalho               | Ação                                    |
|----------------------|-----------------------------------------|
| `Ctrl + F5`          | Rodar programa sem depuração            |
| `F5`                 | Rodar com depuração                     |
| `Ctrl + '` (crase)   | Abrir terminal integrado                |

---

## 💄 Organização de Código

| Atalho                  | Ação                                 |
|-------------------------|--------------------------------------|
| `Ctrl + K`, `Ctrl + F`  | Indentar / formatar o código         |
| `Ctrl + Shift + K`      | Excluir a linha atual                |

---

## ✅ Dica para Java:

### 🔧 Gerar Getters e Setters automaticamente:

- Clique com o botão direito dentro da classe
- Selecione: `Source Action...` → `Generate Getters and Setters`

Ou:

- `Ctrl + Shift + P` → **"Generate Getters and Setters"**

---

📌 **Dica final:** pratique esses atalhos aos poucos. Eles ajudam muito sua produtividade e organização com o tempo!
