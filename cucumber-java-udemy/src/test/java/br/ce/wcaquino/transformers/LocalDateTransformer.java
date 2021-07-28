package br.ce.wcaquino.transformers;

import cucumber.api.Transformer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTransformer extends Transformer<LocalDate> {

    @Override
    public LocalDate transform(String s) {
        return LocalDate.parse(s, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

}
