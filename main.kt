fun main() {

    val farel : Human = Human("Farel Habil Kusuma")
    val andi : Human = Human("Andi")

    farel.email = "farel.2000@students.amikom.ac.id"
    farel.address = "Condongcatur, sleman, Yogyakarta"

    andi.email = "andi@gmail.com"
    andi.address = "Kotagede,Yogyakarta"

    farel.talk()
    andi.talk()

    farel.introduce()
}