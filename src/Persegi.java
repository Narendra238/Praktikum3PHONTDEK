public class Persegi {
    private double sisi;
    public Persegi(){//Konstraktor
        this.sisi = 0;
        System.out.println("1. Objek Persegi");
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public double HitungLuas(){
        return sisi*sisi;
    }
    public double HitungKeliling(){
        return 4*sisi;
    }
}
