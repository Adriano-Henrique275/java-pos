public class App {
    public int converteCartaParaInt(String caracterer) {
        ValuesString values = new ValuesString();

        return values.getValuesNumber(caracterer.toUpperCase());
    }
}
