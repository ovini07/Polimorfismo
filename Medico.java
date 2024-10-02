package polimorfismo;

public class Medico extends ProfissionalSaude {
    private String crm;

    public Medico(String nome, String especialidade, int valorConsulta, String crm) {
        super(nome, especialidade, valorConsulta);
        this.crm = crm;
    }

    @Override
    public void agendarConsulta() {
       System.out.println("Consulta com o Médico " + nome + " (CRM: " + crm + ") agendada.");
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

}
