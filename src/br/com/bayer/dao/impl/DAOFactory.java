package br.com.bayer.dao.impl;

public abstract class DAOFactory {

    public static AlturaDaoImpl getAlturaDao(){return new AlturaDaoImpl();}

    public static BairroDaoImpl getBairroDao(){return new BairroDaoImpl();}

    public static CidadeDaoImpl getCidadeDao(){return new CidadeDaoImpl();}

    public static DiagnosticoDaoImpl getDiagnosticoDao(){return new DiagnosticoDaoImpl();}

    public static DoencaDaoImpl getDoencaDao(){return new DoencaDaoImpl();}

    public static EmailDaoImpl getEmailDao(){return new EmailDaoImpl();}

    public static EstadoDaoImpl getEstadoDao(){return new EstadoDaoImpl();}

    public static PesoDaoImpl getPesoDao(){return new PesoDaoImpl();}

    public static PessoaDaoImpl getPessoaDao(){return new PessoaDaoImpl();}

    public static RegiaoDaoImpl getRegiaoDao(){return new RegiaoDaoImpl();}

    public static ResidenciaDaoImpl getResidenciaDao(){return new ResidenciaDaoImpl();}

    public static RuaDaoImpl getRuaDao(){return new RuaDaoImpl();}

    public static TelefoneDaoImpl getTelefoneDao(){return new TelefoneDaoImpl();}

}
