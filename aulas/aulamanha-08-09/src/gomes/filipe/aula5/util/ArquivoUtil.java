package gomes.filipe.aula5.util;

import gomes.filipe.aula5.exceptions.FuncionarioExistenteException;
import gomes.filipe.aula5.exceptions.PersistenciaException;
import gomes.filipe.aula5.model.Funcionario;

import java.io.*;

public class ArquivoUtil {

    private BufferedWriter bw;

    public ArquivoUtil() {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream("funcionarios.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);
        } catch (FileNotFoundException e) {
            System.out.println("Algo deu errado");
        }
    }

    public void escreveObjetoArquivoTexto(Funcionario funcionario){
        try {
            funcionarioExistente(funcionario);
            bw.append(funcionario.toString());
            bw.newLine();
        } catch (IOException e) {
            throw new PersistenciaException("Erro no momento de persistir o registro no arquivo");
        } catch (FuncionarioExistenteException e) {
            throw new FuncionarioExistenteException(e);
        }
    }

    public void funcionarioExistente(Funcionario funcionario) {
        if (false) {
            throw new FuncionarioExistenteException("Funcionário já cadstrado");
        }
    }

    public void escreveObjetoArquivoTexto(Funcionario[] funcionarios) throws IOException {
        for (int i = 0; i < funcionarios.length; i++) {
            escreveObjetoArquivoTexto(funcionarios[i]);
        }
    }

    public void fechaArquivo() {
        try {
            bw.close();
        } catch (IOException e) {
            System.out.println("Algo deu errado");
        }
    }
}
