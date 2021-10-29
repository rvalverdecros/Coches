class coche (var marca:String, var modelo: String, var velomac: Int, var color:String, var gasolina: Int) {
    init {
        require(marca.trim().isNotEmpty()) {"La marca no es valida"}
    }
    init {
        require(velomac in 10..250 ) {"La velocidad no es valida"}
    }
    var encendido: Boolean = false
    var marcha = 1
    var varvel = 5
    var para = false

    fun encender(){
        var encendido= true
        println("Encendemos el coche!")
    }

    fun apagar(){
        var encendido= false
        println("Apagamos el coche!")
    }

    fun iniciar(){
        encendido = true
        if (encendido == true){
            println("Vamos con la marcha $marcha")
        }else{
            println("El motor esta apagado")
        }
    }
    fun acelerar(){
        println("Vamos a $velomac")

        var res: String
        do {
            println("¿Quieres acelerar? (S/N)")
            res = readLine()!!.toString().uppercase()
        } while (res != "S" && res != "N")
        if (res == "S") {
            velomac += varvel
            println("Vamos a velocidad $velomac")
        }else{
            println("Seguimos a la misma velocidad")
        }
        }

    fun parar(){
        velomac = 0
        if (velomac == 0){
            para = true
        }
    }
    fun cammarcha(){
        val mar : Int
        println("¿A que marcha quieres cambiar?")
        mar = readLine()!!.toInt()
        when (mar){
            1 -> gasolina -= 5
            2 -> gasolina -= 4
            3 -> gasolina -= 3
            4 -> gasolina -= 2
            5 -> gasolina -= 1
            else -> println("No existe esa marcha!!!")
        }
        println("Tienes actualmente $gasolina de gasolina")
    }
    fun frenar(){
        println("Vas a $velomac de velocidad")
        println("Tienes un total de $gasolina de gasolina")
    }

    override fun toString(): String {
        return ("Tu coche es un $marca $modelo, la velocidad max del coche es $velomac y el color del coche es $color")
    }
}
fun main() {
val uno= coche("opel","corsa", 50, "blanco", 30)
    uno.encender()
    uno.iniciar()
    uno.acelerar()
    uno.cammarcha()
    uno.frenar()
    uno.parar()
    uno.apagar()
}

