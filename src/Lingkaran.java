public class Lingkaran {
    public double phi = 3.14;
    public double jarijari;
    public Lingkaran (){//Konstraktor
        this.jarijari =0;
        System.out.println("3. Objek Lingkaran");
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi= 3.14;
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
    public double HitungLuas(){
        return phi*jarijari*jarijari;
    }
    public double HitungKeliling(){
        return 2 * phi * jarijari;
    }
}
