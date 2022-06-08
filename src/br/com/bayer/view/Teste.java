package br.com.bayer.view;

import br.com.bayer.dao.impl.DAOFactory;
import br.com.bayer.entity.*;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;

public class Teste {
    public static void main(String[] args) throws ParseException {
        cadastrarRegiao();
        cadastrarEstado();
        cadastrarCidade();
        cadastrarBairro();
        cadastrarRua();
        cadastrarResidencia();
        cadastrarPessoa();
        cadastrarTelefone();
        cadastrarEmail();
        cadastrarPeso();
        cadastrarAltura();
        cadastrarDoenca();
        cadastrarDiagnostico();
    }

    public static void cadastrarDiagnostico()
    {
        LocalDate data = LocalDate.of(2022,06,5);
        java.sql.Date dtSintomas = java.sql.Date.valueOf(data);

        LocalDate data2 = LocalDate.of(2022,06,7);
        java.sql.Date dtEntrada = java.sql.Date.valueOf(data);
        Diagnostico diagnostico = new Diagnostico(1, "336677",dtSintomas, "Parecetamol e Injeção",
                1, dtEntrada, null);
        DAOFactory.getDiagnosticoDao().insert(diagnostico);
    }

    public static void cadastrarDoenca()
    {
        Doenca doenca = new Doenca(1,"Dengue", "Febre, dor de cabeça e etc.", 1);
        DAOFactory.getDoencaDao().insert(doenca);
    }

    public static void cadastrarPeso()
    {
        Date data = new Date();
        java.sql.Date dt = new java.sql.Date(data.getTime());
        Peso peso = new Peso(1, 80.3,dt , 1);
        DAOFactory.getPesoDao().insert(peso);
    }

    public static void cadastrarEmail()
    {
        Email email = new Email(1, "pessoal","natagrecu34@gmail.com", 1);
        DAOFactory.getEmailDao().insert(email);
    }

    public static void cadastrarTelefone()
    {
        Telefone telefone = new Telefone(1, "973767605", 11, 55, 1);
        DAOFactory.getTelefoneDao().insert(telefone);
    }

    public static void cadastrarAltura()
    {
        Date data = new Date();
        java.sql.Date dt = new java.sql.Date(data.getTime());
        Altura altura = new Altura(1, 1.80, dt, 1);
        DAOFactory.getAlturaDao().insert(altura);
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
