package vetor;

import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno) {
        garanteEspaco();
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    public void adiciona(int posicao, Aluno aluno) {
        garanteEspaco();
        if (!posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição inválida!");
        }
        for (int i = totalDeAlunos-1; i >= posicao; i-=1) {
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        totalDeAlunos++;
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= totalDeAlunos;
    }

    public Aluno pega(int posicao) {
        boolean existe = posicaoOcupada(posicao);
        if (!existe) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        return alunos[posicao];
    }

    public boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeAlunos;
    }

    public void remove(int posicao) {
        for (int i = posicao; i < totalDeAlunos; i++) {
            this.alunos[i] = this.alunos[i+1];
        }
        totalDeAlunos--;
    }

    public boolean contem(Aluno aluno){
        for (int i = 0; i < totalDeAlunos; i++) {
            if (aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }

    public int tamanho() { // Devolve a quantidade de alunos
        return totalDeAlunos;
    }

    private void garanteEspaco() {
        if(totalDeAlunos == alunos.length) {
            Aluno[] novoArray = new Aluno[alunos.length*2];
            for(int i = 0; i < alunos.length; i++) {
                novoArray[i] = alunos[i];
            }
            this.alunos= novoArray;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(alunos);
    }
}
