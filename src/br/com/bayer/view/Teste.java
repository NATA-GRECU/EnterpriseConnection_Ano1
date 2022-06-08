package br.com.bayer.view;

import br.com.bayer.dao.impl.DAOFactory;
import br.com.bayer.entity.*;

import java.text.ParseException;
import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) throws ParseException {
        cadastrarRegiao();
        cadastrarEstado();
        cadastrarCidade();
        cadastrarBairro();
        cadastrarRua();
        cadastrarResidencia();
        cadastrarPessoa();
    }

    public static void cadastrarRegiao()
    {
        Regiao regiao = new Regiao(1, "Sudeste");
        DAOFactory.getRegiaoDao().insert(regiao);
    }

    public static void cadastrarEstado()
    {
        Estado estado = new Estado(1, "São Paulo", "SP",1);
        DAOFactory.getEstadoDao().insert(estado);
    }

    public static void cadastrarCidade()
    {
        Cidade cidade = new Cidade(1, "Santo André", 1);
        DAOFactory.getCidadeDao().insert(cidade);
    }

    public static void cadastrarBairro()
    {
        Bairro bairro = new Bairro(1,"Jardim Guarará", 1,1);
        DAOFactory.getBairroDao().insert(bairro);
    }

    public static void cadastrarRua()
    {
        Rua rua = new Rua(1,"Rua Saracanta","09170790", 1);
        DAOFactory.getRuaDao().insert(rua);
    }

    public static void cadastrarResidencia()
    {
        Residencia residencia = new Residencia(1,247,"",1);
        DAOFactory.getResidenciaDao().insert(residencia);
    }

    public static void cadastrarPessoa()
    {
        LocalDate data = LocalDate.of(2002,03,27);
        java.sql.Date dt = java.sql.Date.valueOf(data);
        Pessoa pessoa = new Pessoa(1,"Natã Grecu", dt, "M", 20, "43612132100", "782347659",
                1);

        DAOFactory.getPessoaDao().insert(pessoa);
    }
}
