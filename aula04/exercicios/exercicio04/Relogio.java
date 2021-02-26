package exercicios.exercicio04;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void getHoraAtual() {
        System.out.printf("%02d : %02d : %02d", hora, minuto, segundo);
    }
    
    public void setHora(int hora) {
        if (hora>=0 && hora<24) {
            this.hora = hora;
        } else {
            System.out.println("Horas configurada para 00, pois o valor das horas não era entre 0 e 23");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto>=0 && minuto<60) {
            this.minuto = minuto;
        } else {
            System.out.println("Minutos configurados para 00, pois o valor de minutos não era entre 0 e 59");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo>=0 && segundo<60) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundos configurados para 00, pois o valor de segundos não era entre 0 e 59");
        }
    }
}
