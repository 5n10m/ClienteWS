/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientews;

/**
 *
 * @author david.molins.goma
 */
public class ClienteWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ConsultaLibres: "+ Integer.toString(consultaLibres(1, 6102015)));
        System.out.println("ConsultaLibres1: "+ Integer.toString(consultaLibres_1(1, 6102015)));
        System.out.println("reservaHabitacion: "+ Integer.toString(reservaHabitacion(1, 6102015)));
        System.out.println("reservaPlaza: "+ Integer.toString(reservaPlaza(1, 6102015)));
    }

    private static int consultaLibres(int idHotel, int fecha) {
        hotel.HotelWS_Service service = new hotel.HotelWS_Service();
        hotel.HotelWS port = service.getHotelWSPort();
        return port.consultaLibres(idHotel, fecha);
    }

    private static int reservaHabitacion(int idHotel, int fecha) {
        hotel.HotelWS_Service service = new hotel.HotelWS_Service();
        hotel.HotelWS port = service.getHotelWSPort();
        return port.reservaHabitacion(idHotel, fecha);
    }

    private static int consultaLibres_1(int idVuelo, int fecha) {
        vuelo.VueloWS_Service service = new vuelo.VueloWS_Service();
        vuelo.VueloWS port = service.getVueloWSPort();
        return port.consultaLibres(idVuelo, fecha);
    }

    private static int reservaPlaza(int idVuelo, int fecha) {
        vuelo.VueloWS_Service service = new vuelo.VueloWS_Service();
        vuelo.VueloWS port = service.getVueloWSPort();
        return port.reservaPlaza(idVuelo, fecha);
    }
    
}
