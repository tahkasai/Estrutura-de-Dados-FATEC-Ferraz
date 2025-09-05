public class Turma{
    private Aluno alunos[];
    private String semestre;
    private int capacidade;
    private int tamanho;

    public Turma(String semestre, int capacidade) {
        this.semestre = semestre;
        this.capacidade = capacidade;
    }

    public Turma(Aluno[] alunos, String semestre, int capacidade, int tamanho) {
        if(capacidade<=0){
            System.out.println("Capacidade inváida");
        }else{
            this.alunos = alunos;
            this.semestre = semestre;
            this.capacidade = capacidade;
            this.tamanho = tamanho;
        }
    }

    public boolean inserir (Aluno aluno){
        if(tamanho == alunos.length){
            return false; // que o vetor esta cheio
        } else{
            alunos [tamanho++] = aluno;
            return true; // aluno inserido no vetor
        }
    }

    public Aluno[] listar(){
        Aluno[] copia = new Aluno[tamanho];
        for(int i=0; i<tamanho; i++){
            copia[i] = alunos[i];
        }
        return copia;
    }

    public boolean remover(int ra){
        for (int i=0; i<tamanho;i++){
            if(alunos[i].getRa()==ra){
                alunos[i] = alunos[tamanho-1];
                alunos[tamanho-1] = null;
                tamanho--;
                return true;
            }
        }
        return false;
    }

    public Aluno localizarRA(int ra){
        for (int i=0;i<tamanho;i++){
            if(alunos[i].getRa() == ra){
                return alunos[i];
            }
        }
        return null;
    }

    public int capacidadeTurma(){
        return alunos.length - tamanho;
    }
    
}