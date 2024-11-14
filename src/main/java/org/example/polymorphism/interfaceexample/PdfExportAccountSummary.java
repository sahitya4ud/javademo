package org.example.polymorphism.interfaceexample;

public class PdfExportAccountSummary implements ExportAccountSummary{
    @Override
    public String export(AccountSummary accountSummary) {
        System.out.println("Export to pdf is done"+i);
        return "Data exported to pdf is done";
    }

}
