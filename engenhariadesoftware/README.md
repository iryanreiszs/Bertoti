# Bertoti

# 1. Comentar com minhas palavras o primeiro trecho do livro Software Engineering at Google, Oreilly.

Trecho:
"What precisely do we mean by software engineering? What distinguishes “software engineering” from “programming” or “computer science”? And why would Google have a unique perspective to add to the corpus of previous software engineering literature written over the past 50 years? The terms “programming” and “software engineering” have been used interchangeably for quite some time in our industry, although each term has a different emphasis and different implications. University students tend to study computer science and get jobs writing code as “programmers.” “Software engineering,” however, sounds more serious, as if it implies the application of some theoretical knowledge to build something real and precise. Mechanical engineers, civil engineers, aeronautical engineers, and those in other engineering disciplines all practice engineering. They all work in the real world and use the application of their theoretical knowledge to create something real. Software engineers also create “something real,” though it is less tangible than the things other engineers create. Unlike those more established engineering professions, current software engineering theory or practice is not nearly as rigorous. Aeronautical engineers must follow rigid guidelines and practices, because errors in their calculations can cause real damage; programming, on the whole, has traditionally not followed such rigorous practices. But, as software becomes more integrated into our lives, we must adopt and rely on more rigorous engineering methods. We hope this book helps others see a path toward more reliable software practices."

Comentário:
O trecho destaca que o trabalho do engenheiro de software, assim como o de outros engenheiros, também resulta em algo “real”, mas a grande diferença é que esse produto é intangível — não pode ser tocado ou visto fisicamente como uma ponte, um avião ou uma máquina. O software existe no mundo digital, e por isso muitas vezes não se percebe o mesmo rigor ou responsabilidade que se espera de outras engenharias. No entanto, o impacto do software é enorme e cada vez mais presente em todos os aspectos da vida, o que torna essencial adotar práticas mais rigorosas e estruturadas, semelhantes às das engenharias tradicionais. Mesmo sendo intangível, o software tem consequências muito concretas quando falha — o que reforça a importância de encará-lo como uma verdadeira obra de engenharia.

# 2. Comentar com minhas palavras o segundo trecho do livro Software Engineering at Google, Oreilly.

Trecho:
"Programming Over Time
We propose that “software engineering” encompasses not just the act of writing code, but all of the tools and processes an organization uses to build and maintain that code over time. What practices can a software organization introduce that will best keep its code valuable over the long term? How can engineers make a codebase more sustainable and the software engineering discipline itself more rigorous? We don’t have fundamental answers to these questions, but we hope that Google’s collective experience over the past two decades illuminates possible paths toward finding those answers. One key insight we share in this book is that software engineering can be thought of as “programming integrated over time.” What practices can we introduce to our code to make it sustainable—able to react to necessary change—over its life cycle, from conception to introduction to maintenance to deprecation?
The book emphasizes three fundamental principles that we feel software organizations should keep in mind when designing, architecting, and writing their code:
Time and Change
How code will need to adapt over the length of its life
Scale and Growth
How an organization will need to adapt as it evolves
Trade-offs and Costs
How an organization makes decisions, based on the lessons of Time and Change and Scale and Growth"

Comentário:
Nesse trecho, os autores ampliam a ideia de engenharia de software: não é só escrever código, mas também tudo que envolve manter esse código útil e funcional com o passar do tempo. Eles falam que a verdadeira engenharia de software está ligada às ferramentas, processos e decisões que ajudam o código a continuar sendo valioso, mesmo depois de anos.
Eles levantam algumas perguntas importantes, como: que práticas ajudam a manter um sistema saudável no longo prazo? Como deixar o código mais sustentável e a engenharia de software mais sólida? O livro não traz uma fórmula mágica, mas a proposta é compartilhar o que o Google aprendeu ao longo de mais de 20 anos lidando com sistemas grandes e complexos.
Uma ideia central que eles destacam é que engenharia de software é como "programação integrada ao tempo" — ou seja, não basta o código funcionar hoje, ele precisa ser pensado para evoluir, mudar e se adaptar ao longo da sua vida útil, desde a criação até o fim do seu uso.
O livro então se apoia em três princípios que eles consideram fundamentais para quem trabalha com software:
#### Tempo e Mudança: 
- Como o código vai precisar mudar ao longo da sua vida.
#### Escala e Crescimento:
- Como a organização e os times precisam se adaptar conforme os projetos e a empresa crescem.
#### Decisões e Custos:
- Como escolher entre diferentes caminhos, sempre levando em conta os impactos do tempo e do crescimento.
Esses princípios servem como uma base para pensar não só no código que estamos escrevendo agora, mas no que ele vai precisar ser daqui a meses ou anos.

# 3. Listar e explicar 3 exemplos de tradeoffs:
#### 1. Velocidade de Desenvolvimento vs. Qualidade do Código
- Escolher copiar e colar código ao invés de criar uma função reutilizável, só para "entregar logo".
#### 2. Desempenho vs. Legibilidade
- Substituir um loop simples por uma versão com caching e manipulação bit a bit para ganhar milissegundos em performance.
#### 3. Customização vs. Padronização
- Criar um sistema próprio de autenticação em vez de usar OAuth ou bibliotecas já testadas.

# 4. Classes UML:
<img width="1568" height="950" alt="image" src="https://github.com/user-attachments/assets/c1d25106-592c-42c5-bebf-b0028b5a093c" />

# 5. JAVA:

* Código com duas Classes - Veículo e Estacionamento

a) Veículo:

```java
        import java.util.ArrayList;
        import java.util.List;

        class Veiculo {
            private String placa;
            private String modelo;
            private String cor;

            public Veiculo(String placa, String modelo, String cor) {
                this.placa = placa;
                this.modelo = modelo;
                this.cor = cor;
            }

        public String getPlaca() {
            return placa;
        }
    
        @Override
        public String toString() {
            return modelo + " (" + cor + ") - Placa: " + placa;
        }
        }
```


 b) Estacinamento:
```java
        import java.util.ArrayList;
        import java.util.List;
 
        class Estacionamento {
            private int vagas;
            private List<Veiculo> veiculos;

        public Estacionamento(int vagas) {
            this.vagas = vagas;
            this.veiculos = new ArrayList<>();
        }
    
        public boolean adicionarVeiculo(Veiculo v) {
            if (veiculos.size() < vagas) {
                veiculos.add(v);
                System.out.println("✅ Veículo entrou: " + v);
                return true;
            }
            System.out.println("❌ Estacionamento lotado! Não foi possível adicionar " + v);
            return false;
        }
    
        public boolean removerVeiculo(String placa) {
            for (Veiculo v : veiculos) {
                if (v.getPlaca().equalsIgnoreCase(placa)) {
                    veiculos.remove(v);
                    System.out.println("🚗 Veículo saiu: " + v);
                    return true;
                }
            }
        System.out.println("⚠️ Veículo com placa " + placa + " não encontrado.");
        return false;
        }
    
        public boolean veiculoNoEstacionamento(String placa) {
            for (Veiculo v : veiculos) {
                if (v.getPlaca().equalsIgnoreCase(placa)) {
                    System.out.println("🔎 Veículo encontrado no estacionamento: " + v);
                    return true;
                }
            }
            System.out.println("🔎 Veículo com placa " + placa + " não está no estacionamento.");
            return false;
        }
    
        public void listarVeiculos() {
            System.out.println("📋 Veículos no estacionamento:");
            for (Veiculo v : veiculos) {
                System.out.println(" - " + v);
            }
            if (veiculos.isEmpty()) {
                System.out.println("Nenhum veículo estacionado.");
            }
        }
    }
```
# 6. Testes:
```java
        public class TesteEstacionamento {
            public static void main(String[] args) {
                Estacionamento est = new Estacionamento(2);
        
                Veiculo v1 = new Veiculo("ABC-1234", "Civic", "Preto");
                Veiculo v2 = new Veiculo("XYZ-9876", "Corolla", "Prata");
                Veiculo v3 = new Veiculo("JKL-5555", "Onix", "Branco");
        
                // Teste 1: Carro entrou
                est.adicionarVeiculo(v1);
        
                // Teste 2: Outro carro entrou
                est.adicionarVeiculo(v2);
        
                // Teste 3: Estacionamento cheio (tentando adicionar terceiro carro)
                est.adicionarVeiculo(v3);
        
                // Teste 4: Verificar se carro está no estacionamento
                est.veiculoNoEstacionamento("ABC-1234");
                est.veiculoNoEstacionamento("ZZZ-0000");
        
                // Teste 5: Listar todos os carros
                est.listarVeiculos();
        
                // Teste 6: Remover carro existente
                est.removerVeiculo("ABC-1234");
        
                // Teste 7: Tentar remover carro que não está
                est.removerVeiculo("ZZZ-0000");
        
                // Teste 8: Listar de novo
                est.listarVeiculos();
            }
        }
```
## Saída esperada do teste:

        ✅ Veículo entrou: Civic (Preto) - Placa: ABC-1234
        ✅ Veículo entrou: Corolla (Prata) - Placa: XYZ-9876
        ❌ Estacionamento lotado! Não foi possível adicionar Onix (Branco) - Placa: JKL-5555
        🔎 Veículo encontrado no estacionamento: Civic (Preto) - Placa: ABC-1234
        🔎 Veículo com placa ZZZ-0000 não está no estacionamento.
        📋 Veículos no estacionamento:
         - Civic (Preto) - Placa: ABC-1234
         - Corolla (Prata) - Placa: XYZ-9876
        🚗 Veículo saiu: Civic (Preto) - Placa: ABC-1234
        ⚠️ Veículo com placa ZZZ-0000 não encontrado.
        📋 Veículos no estacionamento:
         - Corolla (Prata) - Placa: XYZ-9876

# 7. SQLite:

* Código com duas classes - Carro e Estacionamento:

a) Carro: 

```java
public class Carro {
    private String placa;
    private String modelo;
    private String cor;

    public Carro(String placa, String modelo, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return placa + " | " + modelo + " | " + cor;
    }
}

```

b) Estacionamento:

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Estacionamento {

    private Connection connect() {
        Connection conn = null;
        try {
            // Cria (ou abre) o arquivo estacionamento.db
            conn = DriverManager.getConnection("jdbc:sqlite:estacionamento.db");
        } catch (SQLException e) {
            System.out.println("Erro na conexão: " + e.getMessage());
        }
        return conn;
    }

    
    
    public void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS veiculos ("
                   + "placa TEXT PRIMARY KEY, "
                   + "modelo TEXT NOT NULL, "
                   + "cor TEXT NOT NULL"
                   + ");";

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public void adicionarCarro(Carro carro) {
        String sql = "INSERT INTO veiculos (placa, modelo, cor) VALUES (?, ?, ?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, carro.getPlaca());
            pstmt.setString(2, carro.getModelo());
            pstmt.setString(3, carro.getCor());
            pstmt.executeUpdate();
            System.out.println("Carro adicionado: " + carro);
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar carro: " + e.getMessage());
        }
    }

    public void listarCarros() {
        String sql = "SELECT * FROM veiculos";

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("=== Carros no Estacionamento ===");
            while (rs.next()) {
                System.out.println(
                        rs.getString("placa") + " | " +
                        rs.getString("modelo") + " | " +
                        rs.getString("cor"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar carros: " + e.getMessage());
        }
    }

    public void buscarCarro(String placa) {
        String sql = "SELECT * FROM veiculos WHERE placa = ?";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, placa);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("Carro encontrado: " +
                        rs.getString("placa") + " | " +
                        rs.getString("modelo") + " | " +
                        rs.getString("cor"));
            } else {
                System.out.println("Carro com placa " + placa + " não encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar carro: " + e.getMessage());
        }
    }

    public void removerCarro(String placa) {
        String sql = "DELETE FROM veiculos WHERE placa = ?";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, placa);
            int afetados = pstmt.executeUpdate();

            if (afetados > 0) {
                System.out.println("Carro removido: " + placa);
            } else {
                System.out.println("Nenhum carro encontrado com placa " + placa);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao remover carro: " + e.getMessage());
        }
    }
}

```

c) Testes na classe Main:

```java
public class Main {
    public static void main(String[] args) {
        Estacionamento est = new Estacionamento();

        est.criarTabela();

        Carro c1 = new Carro("ABC-1234", "Civic", "Preto");
        Carro c2 = new Carro("XYZ-9876", "Corolla", "Prata");

        est.adicionarCarro(c1);
        est.adicionarCarro(c2);

        est.listarCarros();

        est.buscarCarro("ABC-1234");
        est.buscarCarro("ZZZ-0000");

        est.removerCarro("XYZ-9876");

        est.listarCarros();
    }
}

```

d) Saída esperada no console:

```java
Carro adicionado: ABC-1234 | Civic | Preto
Carro adicionado: XYZ-9876 | Corolla | Prata

=== Carros no Estacionamento ===
ABC-1234 | Civic | Preto
XYZ-9876 | Corolla | Prata

Carro encontrado: ABC-1234 | Civic | Preto
Carro com placa ZZZ-0000 não encontrado.

Carro removido: XYZ-9876

=== Carros no Estacionamento ===
ABC-1234 | Civic | Preto

```
    
