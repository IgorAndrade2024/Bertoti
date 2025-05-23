TEXTO 1:

What precisely do we mean by software engineering? What distinguishes “software engineering” from “programming” or “computer science”? And why would Google have a unique perspective to add to the corpus of previous software engineering literature written over the past 50 years? The terms “programming” and “software engineering” have been used interchangeably for quite some time in our industry, although each term has a different emphasis and different implications. University students tend to study computer science and get jobs writing code as “programmers.” “Software engineering,” however, sounds more serious, as if it implies the application of some theoretical knowledge to build something real and precise. Mechanical engineers, civil engineers, aeronautical engineers, and those in other engineering disciplines all practice engineering. They all work in the real world and use the application of their theoretical knowledge to create something real. Software engineers also create “something real,” though it is less tangible than the things other engineers create. Unlike those more established engineering professions, current software engineering theory or practice is not nearly as rigorous. Aeronautical engineers must follow rigid guidelines and practices, because errors in their calculations can cause real damage; programming, on the whole, has traditionally not followed such rigorous practices. But, as software becomes more integrated into our lives, we must adopt and rely on more rigorous engineering methods. We hope this book helps others see a path toward more reliable software practices.

COMENTÁRIO:

Engenharia de software é uma área mais rigorosas com suas regras.

TEXTO 2:

Programming Over Time We propose that “software engineering” encompasses not just the act of writing code, but all of the tools and processes an organization uses to build and maintain that code over time. What practices can a software organization introduce that will best keep its code valuable over the long term? How can engineers make a codebase more sustainable and the software engineering discipline itself more rigorous? We don’t have fundamental answers to these questions, but we hope that Google’s collective experience over the past two decades illuminates possible paths toward finding those answers. One key insight we share in this book is that software engineering can be thought of as “programming integrated over time.” What practices can we introduce to our code to make it sustainable—able to react to necessary change—over its life cycle, from conception to introduction to maintenance to deprecation? The book emphasizes three fundamental principles that we feel software organizations should keep in mind when designing, architecting, and writing their code: Time and Change How code will need to adapt over the length of its life Scale and Growth How an organization will need to adapt as it evolves Trade-offs and Costs How an organization makes decisions, based on the lessons of Time and Change and Scale and Growth

COMENTÁRIO:

A área de programação foca mais em criar cógos que solucionem o problema da forma mais fácil, ja na engenharia o foco vai alem do próprio código.

EXEMPLOS DE TRADEOFFS:
  - Na linguagem "c" abrimos mão de facilidade na hora de programar para ter mais velocidade de processamento.
  - Na linguagem "python" abrimos mão de velocidade de processamento para ter mais facilidade na hora de programar.
  - Dedicar tempo a hobbies e atividades de lazer pode significar menos tempo para estudar e se preparar para um novo cargo. 

COMENTÁRIO DO SLIDE 57:

Em vez de apresentar partes do produto é melhor apresentar uma ideia geral e ir melhorando com o tempo.

CÓDIGO JAVA:
  - CLASSE ALUNO:

package attbertoti;

public class Aluno {
    private String nome;
    private String classe;
    private String nota;

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public String getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Aluno(String nome, String classe, String nota) {
        this.nome = nome;
        this.classe = classe;
        this.nota = nota;
    }    
}

  - CLASSE CLASSE:

package attbertoti;

import java.util.LinkedList;
import java.util.List;

public class Classe {
    private List<Aluno> Turma = new LinkedList<Aluno>();
    
    public void addAluno(Aluno aluno) {
        Turma.add(aluno);
    }
    
    public Aluno buscarClasse(String classe) {
        for(Aluno aluno:Turma) {
            if(aluno.getClasse().equals(classe)) {
                return aluno;
            }
        }
        return null;
    }
    
    public List<Aluno> buscarNota(String nota) {
        List<Aluno> encontrados = new LinkedList<Aluno>();
        for(Aluno aluno:Turma) {
            if(aluno.getNota().equals(nota)) {
                encontrados.add(aluno);
            }
        }
        return null;
    }
    
    public List<Aluno> getTurma() {
        return Turma;
    }
}

  -CLASSE TESTE:

package attbertoti;

public class Teste {

    public static void main(String[] args) {
        
        Classe classe = new Classe();
        classe.addAluno(new Aluno("Igor", "1A", "A"));
        classe.addAluno(new Aluno("Toneli", "2B", "A+"));
        classe.addAluno(new Aluno("Gabriel", "1A", "C-"));
        classe.addAluno(new Aluno("João", "2B", "B+"));
        classe.addAluno(new Aluno("Guilherme", "1A", "A"));
        
        Aluno aluno = classe.buscarClasse("1A");   
    }    
}
