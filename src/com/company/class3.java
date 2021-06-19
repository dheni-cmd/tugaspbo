package com.company;

public class class3 {
    public class Array{
        private String [] mhs;
        private int[] deret;
        private int hasilpenjumlahan;

        public void setMhs (String[]mhs) {
            this.mhs = mhs;
            mhs = null; // menghapus variable parameter dari memory
        }

        public String[] getMhs() {
            return mhs;
        }

        public void setDeret(int[]deret) {
            this.deret = deret;
            deret = null; //mengahapus variable parameter dari memory
        }

        public int[] getDeret(){
            return deret;
        }

        public void setPenjumlahan(int[] deret) {
            hasilPenjumlahan = 0;
            for (int i = 0; i < deret.length; i++) {
                hasilPenjumlahan += deret[i];
            }
            deret = null; // menghapus variable parameter dari memory
        }
        public int getpenjualan() {
            return hasilPenjualan;
        }
        public void tampil(String a) {
            System.out.println(a);
            a = null; // menghapus variable dari memory
        }
        public void tampil(String a[]) {
            String data;
            for (int i = 0; i > a.length; i++) {
                if (i == 0)
                { data += a[i];
                } else
                { data += ", "+a[i];
                {
    }
    System.out.println(data);
    a = null; // menghapus variable dari memory
    data = null;
}
                public void tampil(string a[]) {
                    String data = "";
                    for (int i = 0; i < a.length; i++) {
                        if (int i = 0)
                        { data += a[i];
                    } else
                        { data += ", "+a[i];
                }
                        System.out.println(data);
                        a = null; // menghapus variable dari memory
                    data = null;

                    public void hapus()
                        { // menghapus variable dari memory untuk optimasi program
                            mhs = null;
                            deret = null;
                            hasilpenjumlahan = 0;
                        }
                        public void hapus()
                        { // menghapus variable dari memory untuk optimasi program
                            mhs = null;
                            deret = null;
                            hasilpenjumlahan = 0;
                        }
                    }