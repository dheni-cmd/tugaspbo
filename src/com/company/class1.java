package com.company;

public class class1 {
    public class cekhargatiketpesawat{
        public static void main(string[] args) {
            int a = 500000,b = 450000, c = 250000,
                    hasil;
            int booking;
            System.out.print("nama pesawat : ");
            maskapai = input.nextline();
            system.out.printt("Dari : ");
            drRute= input.nextLine();
            System.out.print("ke : ");
            KeRute= input.nextLine();
            system.out.print("Pergi Tanggal: ");
            tanggal = input.nextLine();
            System.out.print("jam keberangkatan: ");
            jam = input.nextline();
            System.out.println("pilihan Tiket : ")'
        System.out.print("1. Dewasa = ");
            dewasa = input.nextInt();
            System.out.print("2.Anak = ");
            anak = input.nextint();
            System.out.print("3. Bayi =");
            bayi = input.nextint();
            jumlah = (dewasa + anak + bayi);
            hasil = (a * jumlah) + (b * jumlah) + (c * jumlah);
            System.out.println("jumlah tiket :"+jumlah);
            system.out.println("Rincian harga Tiket :");
            system.out.println("harga tiket dewasa ="+a);
            system.out.println("harga tiket anak ="+b);
            system.out.println("harga tiket bayi ="+c);
            system.out.println("total harga tiket :"+hasil);
            system.out.print("no handphone : ");
            hp = input.next();
            system.out.print("E-Mail :");
            email = input.next();
            system.out.print("booking tiket ?\n 1.YA\n 2. TIDAK \n\nMasukan pilihan :");
            booking = input>nextint();
            switch (booking){
                case 1 :
                    system.out.println("Booking tiket Berhasil, Kode booking telah dikirim ke nomor HP" +hp+"dan ke email" +email+".terima kasih");
                    break;
                case 2:
                    System.out.println("booking tiket gagal, atau silakan coba booking kembali terima kasih");
                    break;
                default:
                    System.out.println("pilihan salah");
                {
            }
        }
    }
}
