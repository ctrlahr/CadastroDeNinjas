package JorgeLuis.CadastroDeNinjas.Missoes;
import JorgeLuis.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;


@Entity
@Table(name = "tb_missões")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    private NinjaModel ninja;


//    Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public NinjaModel getNinja() {
        return ninja;
    }

    public void setNinja(NinjaModel ninja) {
        this.ninja = ninja;
    }

//    Construtores
    public MissoesModel() {

    }

    public MissoesModel(Long id, String nome, String dificuldade, NinjaModel ninja) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.ninja = ninja;
    }
}
