//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}
public static int calcularDuracionJornada(int cantidadMaterias, int duracionMateriaMin) {
    if (cantidadMaterias <= 0) return 0;
    int duracionMaterias = cantidadMaterias * duracionMateriaMin;
    int duracionRecreos = (cantidadMaterias - 1) * 15;
    return duracionMaterias + duracionRecreos;
}


public static double calcularCostoViaje(
        double distCiudad1, double distCiudad2, double distCiudad3,
        double consumoLitrosPorKm, double precioLitro, double peajePorCiudad) {

    double distanciaTotal = distCiudad1 + distCiudad2 + distCiudad3;
    double costoCombustible = distanciaTotal * consumoLitrosPorKm * precioLitro;
    double costoPeajes = 3 * peajePorCiudad;

    return costoCombustible + costoPeajes;
}
66