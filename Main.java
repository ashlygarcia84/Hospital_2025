// Importamos las clases necesarias para crear una interfaz gráfica
import javax.swing.JFrame;  // Clase para crear una ventana
import javax.swing.JLabel;  // Clase para mostrar texto en la ventana

public class Main {
    public static void main(String[] args) {
        
        // Crear una ventana con JFrame
        JFrame miVentana = new JFrame(); // Se crea un nuevo objeto ventana
        miVentana.setTitle("Hospital SCL"); // Se establece el título de la ventana
        miVentana.setSize(1000, 800); // Se define el tamaño de la ventana en píxeles (ancho x alto)
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Se cierra la aplicación al cerrar la ventana
        miVentana.setLayout(null); // Se desactiva el administrador de diseño para posicionar manualmente los elementos

        // Crear un texto con JLabel
        JLabel etiqueta = new JLabel("Bienvenido al Hospital SCL"); // Se crea una etiqueta de texto
        etiqueta.setBounds(50, 50, 300, 30); // Se posiciona la etiqueta dentro de la ventana (x, y, ancho, alto)
        miVentana.add(etiqueta); // Se añade la etiqueta a la ventana

        // Mostrar la ventana
        miVentana.setVisible(true); // Se hace visible la ventana en pantalla
    }
}
