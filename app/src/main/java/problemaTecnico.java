public class problema_Tecnico {
    private String problema;
    private String tecnicoNecesario;

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public void setTecnicoNecesario(String tecnicoNecesario) {
        this.tecnicoNecesario = tecnicoNecesario;
    }

    public String getProblema() {
        return problema;
    }

    public String getTecnicoNecesario() {
        return tecnicoNecesario;
    }

    public problema_Tecnico(String problema, String tecnicoNecesario) {
        this.problema = problema;
        this.tecnicoNecesario = tecnicoNecesario;
    }
}
