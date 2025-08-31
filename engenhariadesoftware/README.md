# Bertoti

# 1. Comentar com minhas palavras o primeiro trecho do livro Software Engineering at Google, Oreilly.

Trecho:
"What precisely do we mean by software engineering? What distinguishes “software engineering” from “programming” or “computer science”? And why would Google have a unique perspective to add to the corpus of previous software engineering literature written over the past 50 years? The terms “programming” and “software engineering” have been used interchangeably for quite some time in our industry, although each term has a different emphasis and different implications. University students tend to study computer science and get jobs writing code as “programmers.” “Software engineering,” however, sounds more serious, as if it implies the application of some theoretical knowledge to build something real and precise. Mechanical engineers, civil engineers, aeronautical engineers, and those in other engineering disciplines all practice engineering. They all work in the real world and use the application of their theoretical knowledge to create something real. Software engineers also create “something real,” though it is less tangible than the things other engineers create. Unlike those more established engineering professions, current software engineering theory or practice is not nearly as rigorous. Aeronautical engineers must follow rigid guidelines and practices, because errors in their calculations can cause real damage; programming, on the whole, has traditionally not followed such rigorous practices. But, as software becomes more integrated into our lives, we must adopt and rely on more rigorous engineering methods. We hope this book helps others see a path toward more reliable software practices."

Comentário:
No começo do livro Software Engineering at Google, os autores falam sobre o que realmente significa "engenharia de software" e como isso se diferencia de apenas "programar" ou estudar "ciência da computação". Muitas vezes essas palavras são usadas como se fossem a mesma coisa, mas na verdade elas têm focos diferentes. Programar é basicamente escrever código, enquanto engenharia de software envolve aplicar conhecimento técnico de forma mais estruturada, como acontece em outras engenharias, tipo a civil ou a mecânica.
Eles comentam também que, apesar do nome “engenharia de software” dar essa ideia de algo mais sério e técnico, na prática ainda falta muito rigor em comparação com outras áreas da engenharia. Por exemplo, um erro em um projeto de engenharia aeronáutica pode causar um acidente grave, então tudo precisa ser extremamente bem calculado. Já no software, historicamente, a gente não tem seguido esse mesmo nível de exigência.
Mas isso está mudando, porque hoje o software está cada vez mais presente e essencial no nosso dia a dia. Por isso, os autores defendem que é preciso adotar práticas mais confiáveis e bem estruturadas no desenvolvimento de software. A ideia do livro é justamente mostrar, com base na experiência do Google, como trilhar esse caminho para uma engenharia de software mais madura e responsável.

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

