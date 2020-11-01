package com.example.industrialpark;

import java.util.ArrayList;

public class indParkData {
    private static String[] indParkName = {
            "Batamindo Industrial Park",
            "Jakarta Industrial Estate Pulogadung",
            "Kawasan Industri Terpadu Indonesia China",
            "Bekasi International Industrial Estate",
            "MM2100 Industrial Town BFIE",
            "MM2100 Industrial Town MMID",
            "Kawasan Industri Jababeka",
            "East Jakarta Industrial Park",
            "Greenland International Industrial Center (GIIC)",
            "Karawang International Industrial City"

    };

    private static int[] indParkImg = {
            R.drawable.batamindo,
            R.drawable.pulogadung,
            R.drawable.kitic,
            R.drawable.biie,
            R.drawable.befa,
            R.drawable.mm2100,
            R.drawable.jababeka,
            R.drawable.ejip,
            R.drawable.giic,
            R.drawable.kiic
    };

    private static String[] indParkLocation = {
            "Kota Batam, Kepulauan Riau",
            "Kota Administrasi Jakarta Timur, DKI Jakarta",
            "Kab. Bekasi, Jawa Barat",
            "Kab. Bekasi, Jawa Barat",
            "Kab. Bekasi, Jawa Barat",
            "Kab. Bekasi, Jawa Barat",
            "Kab. Bekasi, Jawa Barat",
            "Kab. Bekasi, Jawa Barat",
            "Kab. Bekasi, Jawa Barat",
            "Kab. Karawang, Jawa Barat"
    };

    private static String[] indParkWide = {
            "320,00 Ha",
            "500,00 Ha",
            "205,00 Ha",
            "200,00 Ha",
            "1.700,00 Ha",
            "805,00 Ha",
            "2.267,00 Ha",
            "320,00 Ha",
            "1.000,00 Ha",
            "1.347,00 Ha"

    };

    private static String[] indParkDeveloper = {
            "PT. Batamindo Investment Cakrawala",
            "PT. Jakarta Industrial Estate Pulogadung",
            "PT. Kawasan Industri Terpadu Indonesia China",
            "PT. Hyundai Inti Development",
            "PT. Bekasi Fajar Industrial Estate",
            "PT. Megalopolis Manunggal Ind. Dev.",
            "PT. Jababeka Infrastruktur",
            "PT. East Jakarta Industrial Park",
            "PT. Puradelta Lestari, Tbk",
            "PT. Maligi Permata Industrial Estate"
    };

    private static String[] indParkWebsite = {
            "http://batamindoindustrial.com/",
            "https://jiep.co.id/id/",
            "N/A",
            "http://www.hyundaicorp.com/",
            "https://befa.id/",
            "http://mm2100.co.id/",
            "https://www.jababeka.com/",
            "https://www.ejip.co.id/",
            "http://kota-deltamas.com/properties/greenland-international-industrial-center-giic/",
            "http://www.kiic.co.id/"
    };

    private static String[] indParkDesc = {
            "Batamindo Industrial Park didirikan pada tahun 1990 di area dengan luas 320 Ha. 95 % (300 Ha) telah terbangun dan diisi oleh 74 tenant.Fasilitas yang tersedia di dalam area inudstri ini adalah Management Office, Banks, Kantor Pos, Restoran/Kantin, Masjid, Gereja, Pura, Keamanan/Pemadam kebakaran 24 jam, Pusat Olahraga, Pelayanan Sampah, Fasilitas Komersil dan 24 jam Klinik. Sementara prasarana dan sarana yang tersedia adalah listrik sebesar 130 MW, kapasitas air sebesar 10.000M3/hari, kapasitas air limbah sebesar 10.000M3/hari. Fasilitas telekomunikasi yang tersedia adalah IDD,Faksimil, jaringan internet up to 100 Mbps.",
            "PT Jakarta Industrial Estate Pulogadung adalah perusahaan pengembang dan pengelola kawasan industri yang berkantor pusat di Pulogadung, Jakarta Timur. Perusahaan ini didirikan pada tahun 1973 dengan kepemilikan saham 50% Pemerintah Indonesia dan 50% Pemerintah Provinsi DKI Jakarta. Pulogadung merupakan pilihan utama, karena lokasinya yang strategis serta mempunyai akses yang memadai bagi transportasi dan distribusi ke seluruh wilayah Jakarta. Pada saat itu Pulogadung masih berupa tanah yang tidak produktif yang sebagian besar terdiri dari rawa-rawa. Melalui Surat Keputusan Gubernur Propinsi KDKI Jakarta No. Ib.3/2/35/1969 ditetapkanlah lahan seluas 500 HA sebagai lokasi kawasan industri dengan nama Kawasan Industri Pulogadung.",
            "Kawasan Industri Terpadu Indonesia China (KITIC) adalah terletak di Pusat Industri Internasional Greenland (GIIC), Kota Deltamas, kawasan industri timur di Jakarta. Kawasan Industri Terpadu Indonesia (KITIC) disetujui oleh Kementerian Perdagangan Tiongkok, diinvestasikan oleh Guangxi State Farms Group (GSFG), dan merupakan ekonomi Tiongkok pertama dan zona perdagangan mengintegrasikan produksi, pergudangan dan perdagangan di Indonesia. KITIC didirikan oleh gabungan kerjasama antara Guangxi State Farm Group dan PT Sentrabumi Palapa Utama, Gresik, Indonesia.",
            "Nama resminya Bekasi International Industrial Estate (BIIE). Nama populernya 'kawasan industri Hyundai'. Bisa begitu karena pemilik kawasan industri yang mulai beroperasi pada 1991 ini adalah PT Hyundai Inti Development, perusahaan patungan antara Hyundai Corporation (Korea Selatan) dengan PT Lippo Cikarang Tbk. Perusahaan patungan ini dibentuk setahun sebelumnya. Bekasi International Industrial Estate merupakan satu dari 4 kawasan industri yanga ada di kawasan Lippo Cikarang. BIIE menempati areal seluas 200 hektar. Gerbang masuknya tak jauh di seberang Hotel Sahid Lippo Cikarang, di samping SPBU Shell. Tercatat ada 104 perusahaan, dari 8 negara, yang memiliki pabrik di kawasan industri Hyundai ini. 26 perusahaan di antaranya adalah perusahaan asal Korea Selatan.",
            "PT. Bekasi Fajar Industrial Estate Tbk. (BeFa) adalah pengembang dan operator terkemuka untuk kawasan industri kelas dunia di Indonesia. Perusahaan ini didirikan pada tanggal 24 Agustus 1989, sebagai salah satu pengembang dan manajemen perusahaan-perusahaan di kawasan industri pertama di Indonesia. Seiring berjalannya waktu, produk andalan BeFa Kota Industri MM2100 yang berlokasi di Jabodetabek, memiliki reputasi sebagai pusat riset, inovasi, dan manufaktur mutakhir bagi perusahaan-perusahaan domestik dan internasional terkemuka. Pada tanggal 10 April 2012, berbekal rekam jejak yang unggul dalam kualitas dan inovasi, BeFa masuk bursa (go public). Sahamnya kini diperdagangkan di Bursa Efek Indonesia (BEI: BEST).",
            "MM2100 Industrial Town merupakan kawasan industri seluas 805 hektar yang dikembangkan oleh PT. Megalopolis Manunggal Industrial Development atau MMID. Hingga informasi terakhir diturunkan pada 2010, 175 perusahaan, mayoritas adalah anak perusahaan milik Jepang, membuka aktivitas industrinya di kawasan ini. Kawasan industri ini dibuka pada 1990. Pada tahun yang sama PT MMID resmi beroperasi setelah kesepakatan patungan antara Marubeni Corporation (Jepang) dan Manunggal Group (Indonesia). Tidak dijelaskan kapan pengembangan fase dimulai, disebutkan ada 3 fase pengembangan: fase 1 seluas 240 hektar, fase 2 seluas 120 hektar dan fase 3 seluas 445 hektar, sudah termasuk jalan dan fasilitas umum dan penghias.",
            "Kawasan Industri Jababeka terletak di Kota Jababeka, sebuah kota mandiri dengan luas 5.600 Ha, yang merupakan pengembangan andalan PT Jababeka Tbk, yang terdiri dari kawasan industri, perumahan dan komersial. Mencakup sekitar 1.700 hektar luas lahan, Kawasan Industri Jababeka telah menjadi lokasi paling bergengsi di Indonesia untuk bidang manufaktur, industri, dan teknologi. Sejak didirikan pada tahun 1989, Jababeka telah diakui sebagai kawasan industri paling sukses di Indonesia dalam hal menarik perusahaan multinasional (MNC), perusahaan lokal terkemuka dan UKM. Bersama-sama dengan kampus The President University, kawasan industri Jababeka memberikan suasana ideal dan lingkungan kerja bagi komunitas industri modern yang sekarang terdiri dari 1.000.000 karyawan yang bekerja untuk lebih dari 1.650 perusahaan dari 30 negara termasuk Amerika Serikat, Jepang, Korea. , Inggris, Belanda, Australia, Singapura, Malaysia, Taiwan, dll.",
            "Sejak 1990, kawasan industri swasta telah berkembang pesat di Republik Indonesia. Sesuai dengan data dari Asosiasi Kawasan Industri Indonesia (HKI), pada tahun 2015, ada 23 (dua puluh tiga) taman industri di Kabupaten Bekasi Provinsi Jawa Barat. Jumlah ini meningkat pesat selama 25 tahun terakhir, dimulai dari berdirinya PT. East Jakarta Industrial Park (EJIP) pada tahun 1990. Sebagai Kawasan industri swasta pertama dengan investasi asing dari Jepang, EJIP telah menunjukkan kegiatan utama dan model peran taman industri di wilayah Bekasi, yang menyediakan fasilitas lengkap untuk mendukung kebutuhan pelanggan, dengan Misi: “menjadi taman industri terkemuka di Asia, terus melangkah maju dalam memberikan kepuasan pelanggan, dan mengatasi perubahan, menciptakan nilai baru, memberikan layanan berkualitas tinggi, berkontribusi dan tumbuh bersama dengan penyewa, pemegang saham, dan karyawan, selaras dengan masyarakat lokal dan Republik Indonesia. Operasi selama 25 tahun adalah momen bagi semua pemangku kepentingan EJIP untuk merefleksikan dan mengingat Misi yang begitu besar, untuk mengukir tonggak sejarah yang hebat dengan mengimplementasikan Misi EJIP dan bersama-sama untuk menciptakan nilai-nilai yang hebat, dan untuk melanjutkan tujuan baru seperti, “BE A LEADER AND KEEP THE SPIRIT OF NEW VISION”.",
            "Kota industri ini meliputi area seluas 1.500 hektar, terletak di Kota Deltamas, Cikarang, Bekasi. Dikelola oleh PT. Puradelta Lestari, Tbk, proyek ini didukung penuh oleh Sojitz Corporation Jepang, bekerja sama dengan Sinar Mas Land. GIIC dirancang untuk menjadi kawasan industri yang ramah lingkungan dan bangga akan banyak aspek industri hijau dalam pembangunan. Layanan termasuk fasilitas seperti akses langsung ke jalan tol, instalasi pengolahan air dan air limbah (IPAL), pembangkit listrik dan pasokan gas. Untuk keperluan bisnis dan administrasi, perkebunan ini terletak dekat dengan kantor pemerintah kabupaten Bekasi, cabang bank dan ATM, kantor polisi dan kamp brigade seluler, dan menawarkan keamanan 24 jam, listrik, dan telekomunikasi. Untuk mobilitas keluar-masuk yang mudah, GIIC Kota Deltamas menyediakan layanan bis antar-jemput. Bagi mereka yang ingin bekerja dan beristirahat di sekitar perkebunan, disediakan asrama, juga 15 blok perumahan dan 15 klaster komersial. Ini disesuaikan dengan fasilitas penidikan dari playgroup ke universitas. Untuk kesehatan dan relaksasi, ada klinik layanan, berbagai toko, restoran, taman hijau dan hutan kota yang terbuka untuk umum.",
            "Karawang International Industrial City (KIIC) adalah sebuah kawasan industri yang terletak di Karawang, Jawa Barat, sekitar 30 kilometer dari Jakarta. KIIC merupakan joint venture antara Sinar Mas Land dan ITOCHU Corporation asal Jepang. Kawasan seluas sekitar 1.400 hektar ini ditempati oleh sejumlah perusahaan lokal dan multinasional. KIIC adalah kawasan industri pertama di Indonesia yang menerima sertifikat ISO 9001:2000, ISO 14001:2004 untuk Sistem Manajemen Kualitas & Lingkungan pada tahun 2002, dan sertifikat OHSAS 18002:2007 untuk Sistem Manajemen Kesehatan & Keselamatan. Terdapat juga hotel, gerai ritel, restoran, taman bermain, bank, dan pemadam kebakaran di dalam kawasan ini. KIIC memiliki akses langsung ke Jalan Tol Jakarta-Cikampek melalui Gerbang Tol Karawang Timur KM 54."
    };

    static ArrayList<indPark> geListData() {
        ArrayList<indPark> list = new ArrayList<>();
        for (int position = 0; position < indParkName.length; position++){
            indPark indpark = new indPark();
            indpark.setName(indParkName[position]);
            indpark.setLocation(indParkLocation[position]);
            indpark.setDeveloper(indParkDeveloper[position]);
            indpark.setPhoto(indParkImg[position]);
            indpark.setWeb(indParkWebsite[position]);
            indpark.setWide(indParkWide[position]);
            indpark.setDesc(indParkDesc[position]);
            list.add(indpark);
        }
        return list;
    }
}
