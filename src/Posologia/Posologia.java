package Posologia;

import java.util.ArrayList;
import java.util.List;

public class Posologia {
     private String medico, tratamento, medicamento, dosagem, data, hora;
     private int id;
     
       protected static List<Posologia> listaPosologia = new ArrayList <>();
       

    public Posologia() {
    }

    public Posologia(String medico, String tratamento, String medicamento, String dosagem, String data, String hora) {
        this.medico = medico;
        this.tratamento = tratamento;
        this.medicamento = medicamento;
        this.dosagem = dosagem;
        this.data = data;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
       public static List<Posologia> getListPosologia() {
        return listaPosologia;
    }

    public static void setListaPosologia(List<Posologia> listaPosologia) {
        Posologia.listaPosologia = listaPosologia;
    }

    public void addposologia(){
       listaPosologia.add(this);
   }
}
