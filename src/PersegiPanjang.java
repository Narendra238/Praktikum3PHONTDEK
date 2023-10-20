public class PersegiPanjang {
    public double panjang;
    public double lebar;
    public PersegiPanjang(){//Konstraktor
        this.lebar = 0;
        this.panjang = 0;
        System.out.println("2. Objek Persegi Panjang");
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double HitungLuas(){
        return panjang*lebar;
    }
    public double HitungKeliling(){
        return 2*(panjang+lebar);
    }
}
