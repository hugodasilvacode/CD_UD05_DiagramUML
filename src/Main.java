public class Main {
    public static void main(String[] args) {

        //TODO: Crear los siguientes pasos para comprobar el funcionamiento del programa 
        // Crear una veterinaria
        Veterinaria veterinaria = new Veterinaria();

        // Crear dos clientes
        Cliente cliente1 = new Cliente("Hugo","C/Galeras 28 4F", "698157203");
        Cliente cliente2 = new Cliente("Jose","C/Pardinhas 36", "655645297");

        // Agregar clientes a la veterinaria
        veterinaria.agregarCliente(cliente1);
        veterinaria.agregarCliente(cliente2);

        // Crear dos animales
        Animal animal1 = new Animal("Luis", "gato", "comun", cliente1);
        Animal animal2 = new Animal("Areta", "perro", "galgo", cliente2);

        // Agregar animales a la veterinaria
        veterinaria.agregarAnimal(animal1);
        veterinaria.agregarAnimal(animal2);

        //Crear un veterinario 
        Veterinario veterinario = new Veterinario();

        // Crear una consulta
        Consulta consulta = new Consulta("22/04/2024", "revision", "todo ok", "ninguno", veterinario);

        // Asignar la consulta a un animal
        animal1.agregarConsulta(consulta);

        //Imprimir todas las consultas de los animales de la clínica 
        veterinaria.imprimirConsultas();
    }

}