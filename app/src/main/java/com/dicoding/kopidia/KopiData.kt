package com.dicoding.kopidia

object KopiData {

    private val kopiNames = arrayOf("Espresso",
        "Cappuccino",
        "Afrogatto",
        "Americano",
        "Gayo Aceh",
        "Latte",
        "Luwak",
        "Mochaccino",
        "Red Eye",
        "Toraja")

    private val kopiDetails = arrayOf( "Jenis kopi ini akan sering kamu temui jika sedang berada di kedai kopi. Kopi ini merupakan kopi hitam yang aromanya sangat kuat dan pekat. Kopi ini dihasilkan dari ekstrak biji kopi yang telah digiling. Secangkir espresso ini bisa kamu nikmati dengan menekan bubuk kopinya di dalam portafilter.",
        "Kopi ini merupakan campuran dari kopi espresso yang ditambahkan dengan air panas lagi. Awal mula terbentuk kopi Americano adalah saat warga Amerika ingin menikmati espresso yang tidak terlalu kental dan pekat sehingga mereka menambahkan air panas ke dalam espresso. Rasanya tetap pahit tanpa ada tambahan gila dan krimer.",
        "Jenis kopi ini juga sering berada di menu kedai kopi. Untuk menikmati kopi affogatto ini kamu akan diberikan es krim dan satu shot espresso, lalu espresso dituangkan ke atas es krim. Dengan begitu kamu akan merasakan rasa pahitnya espresso dan manisnya es krim yang nikmat.",
        "Kopi ini merupakan campuran dari kopi espresso yang ditambahkan dengan air panas lagi. Awal mula terbentuk kopi Americano adalah saat warga Amerika ingin menikmati espresso yang tidak terlalu kental dan pekat sehingga mereka menambahkan air panas ke dalam espresso. Rasanya tetap pahit tanpa ada tambahan gila dan krimer.",
        "Saat kamu berada di kedai kopi, kamu akan melihat kopi ini pada buku menu. Salah satu kopi yang berasal dari Aceh dan hanya tumbuh di dataran tinggi. Rasa Kopi Gayo Aceh ini unik, enak dan tidak terlalu pahit baunya pun harum, ini menjadikan Kopi Gayo Aceh kopi terbaik di Indonesia.",
        "Sekilas terlihat sama dengan cappuccino, namun perlu diingat jika latte dengan cappucino itu jenis kopi yang berbeda. Komposisi kopi dan susu pada latte yaitu 3:1 dan lapisan busa susunya pun lebih tipis. Cocok untuk kamu yang ingin mencoba kopi dengan rasa yang manis.",
        "Kopi yang memiliki rasa yang khas dan keasaman yang pas menjadikannya kopi termahal yang dimiliki Indonesia. Kopi yang dihasilkan dari kotoran luwak (Musang) ini menjadi incaran pecinta kopi. Prosesnya yang membuat kopi ini mahal. Kopi luwak terbaik adalah biji kopi yang dimakan oleh luwak liar dan dikeluarkan dalam bentuk kotoran lalu di olah.",
        "Moccachino merupakan jenis kopi campuran espresso, susu dan coklat. Penambahan coklat pada kopi ini membuat kopi lebih manis dan nikmat. Untuk menambah kenikmatan pada kopi Moccachino kamu juga bisa menambahkan whipped cream dan marshmellow.",
        "Sudah terlihat dari namanya, jenis kopi ini adalah campuran dari espresso dengan kopi hitam. Rasanya yang sangat pahit ini membuat yang minum jadi lebih melek dan segar.",
        "Kopi Toraja berasa dari Sulawesi Selatan. Kopi Toraja juga dianggap sebagai minuman premium. Jenis kopi ini memiliki rasa yang khas karena memiliki sentuhan kayu manis dan kapulaga."
    )

    private val kopiImages = intArrayOf(R.drawable.espresso,
        R.drawable.cappuccino,
        R.drawable.afrogatto,
        R.drawable.americano,
        R.drawable.gayo,
        R.drawable.latte,
        R.drawable.luwak,
        R.drawable.mochachino,
        R.drawable.red_eye,
        R.drawable.toraja
        )

    val listData: ArrayList<Kopi>
        get() {
            val list = arrayListOf<Kopi>()
            for (position in kopiNames.indices) {
                val kopi = Kopi()
                kopi.name = kopiNames[position]
                kopi.detail = kopiDetails[position]
                kopi.photo = kopiImages[position]
                list.add(kopi)
            }
            return list
        }

}