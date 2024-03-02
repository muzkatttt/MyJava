public class Receipt<T extends Number> {

    String numberReceipt;
    Double hourlyRate004; // часовая тарифная ставка
    Double officeHours; // отработанные часы
    Double qualification025; // надбавка за класс квалификации
    Double longShoulder151; // доплата за длинное плечо

    Double heavyWeight152; // доплата за проведение поездов повышенного веса и длины
    //Double nightHours023; // ночные часы
    Double summ;

    public Receipt(String numberReceipt, Double hourlyRate004, Double officeHours, Double qualification025,
                   Double longShoulder151, Double heavyWeight152) {
        this.hourlyRate004 = hourlyRate004;
        this.officeHours = officeHours;
        this.qualification025 = qualification025;
        this.longShoulder151 = longShoulder151;
        this.heavyWeight152 = heavyWeight152;
    }

    public String getNumberReceipt() {
        return numberReceipt;
    }

    public Double getSumm() {
        return summ;
    }

    public Double getHourlyRate004() {
        return hourlyRate004;
    }

    public Double getOfficeHours() {
        return officeHours;
    }

    public Double getQualification025() {
        return qualification025;
    }

    public Double getLongShoulder151() {
        return longShoulder151;
    }

    public Double getHeavyWeight152() {
        return heavyWeight152;
    }

    public Double raschetTarif(Double hourlyRate004, Double officeHours){
        return hourlyRate004 * officeHours;
    }

    public Double raschet151(Double tarif, Double longShoulder151) {
        return (tarif * longShoulder151) / 100;
    }

    public Double raschet152(Double tarif, Double heavyWeight152){
        return (tarif * heavyWeight152) / 100;
    }

    public Double raschetBonus011(Double tarif){
        return tarif * 0.27; // премия основная 27%
    }

    public Double reschet025(Double tarif, Double qualification025){
        // расчет доплаты за квалификацию работника
        return (tarif * qualification025) / 100;
    }

    public Double summaPoMarshrutu() {
        Double tarif = raschetTarif(hourlyRate004, officeHours);
        Double doplata152 = raschet152(tarif, heavyWeight152);
        Double doplata151 = raschet151(tarif, longShoulder151);
        Double bonus011 = raschetBonus011(tarif);
        Double doplata025 = reschet025(tarif, qualification025);
        summ =  tarif + doplata025 + doplata151 + doplata152 + bonus011;
        return summ;
    }

//    public T summaPoMarshrutu() {
//        T tarif = (T) raschetTarif((Double) hourlyRate004, (Double) officeHours);
//        T doplata152 = (T) raschet152((Double) tarif, (Double) heavyWeight152);
//        T doplata151 = (T) raschet151((Double) tarif, (Double) longShoulder151);
//        T bonus011 = (T) raschetBonus011((Double) tarif);
//        T doplata025 = (T) reschet025((Double) tarif, (Double) qualification025);
//        Double sum =  (T)tarif + (T)doplata025 + doplata151 + doplata152 + bonus011;
//        return summ;
//    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Оплата по маршруту{");
        sb.append("numberReceipt=").append(numberReceipt);
        sb.append(", hourlyRate004=").append(hourlyRate004);
        sb.append(", officeHours=").append(officeHours);
        sb.append(", qualification025=").append(qualification025);
        sb.append(", longShoulder151=").append(longShoulder151);
        sb.append(", heavyWeight152=").append(heavyWeight152);
        sb.append(", summ=").append(summaPoMarshrutu());
        sb.append('}');
        sb.append("\n");
        return sb.toString();
    }
}
