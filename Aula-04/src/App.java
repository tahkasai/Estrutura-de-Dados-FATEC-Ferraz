import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Turma turma = new Turma("3SEM_ADS", 0);
        Scanner sc = new Scanner(System.in);
        int opcao=0;

        do{
            try {
                System.out.println("\n[1] Inserir \n[2] Buscar \n[3] Remover \n[4] Listar \n[5] Capacidade da Turma\n[0] Sair");
                System.out.print("Opção: ");
                opcao = Integer.parseInt(sc.nextLine()); // força a entrada de dados a ser inteiro

                switch (opcao) {
                    case 1:
                        System.out.print("RA: ");
                        int ra = Integer.parseInt(sc.nextLine());

                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        boolean status = turma.inserir(new Aluno(ra,nome));

                        // ternario
                        // condicação_logica ? true:false;
                        System.out.println(status?"Inserido com sucesso":"Falha no sistema");
                        break;

                    case 2:
                        System.out.print("RA: ");
                        ra = Integer.parseInt(sc.nextLine());

                        Aluno a = turma.localizarRA(ra);
                        System.out.println(a!=null ?a:"Não encontrado");
                        break;

                    case 3:
                        System.out.print("RA: ");
                        ra = Integer.parseInt(sc.nextLine());
                        System.out.print(turma.remover(ra)?"Removida":"Não localizado");
                        break;

                    case 4:
                        for(Aluno al: turma.listar()){
                            System.out.println(al.getRa()+"|"+al.getNome());
                        }
                        System.out.println("Vagas livres: "+turma.capacidadeTurma());
                        break;

                    case 0:
                        System.out.println("Encerrado!");
                    default:
                        System.out.println("Opção inválida");
                        break;
                }

            } catch (Exception e){

            }
        } while(opcao!=0);
    }
}