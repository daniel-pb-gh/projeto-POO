package com.POO.projeto.model;

import java.time.ZonedDateTime;

public class Hospeagem {
    ZonedDateTime dataHoraEntradaPrevista;
    ZonedDateTime dataHoraEntradaReal;
    ZonedDateTime dataHoraSaidaPrevista;
    ZonedDateTime dataHoraSaidaReal;

    public ZonedDateTime getDataHoraEntradaPrevista() {
        return dataHoraEntradaPrevista;
    }

    public ZonedDateTime getDataHoraEntradaReal() {
        return dataHoraEntradaReal;
    }

    public ZonedDateTime getDataHoraSaidaPrevista() {
        return dataHoraSaidaPrevista;
    }

    public ZonedDateTime getDataHoraSaidaReal() {
        return dataHoraSaidaReal;
    }

    public void setDataHoraEntradaPrevista(ZonedDateTime dataHoraEntradaPrevista) {
        this.dataHoraEntradaPrevista = dataHoraEntradaPrevista;
    }

    public void setDataHoraEntradaReal(ZonedDateTime dataHoraEntradaReal) {
        this.dataHoraEntradaReal = dataHoraEntradaReal;
    }

    public void setDataHoraSaidaPrevista(ZonedDateTime dataHoraSaidaPrevista) {
        this.dataHoraSaidaPrevista = dataHoraSaidaPrevista;
    }

    public void setDataHoraSaidaReal(ZonedDateTime dataHoraSaidaReal) {
        this.dataHoraSaidaReal = dataHoraSaidaReal;
    }
}
