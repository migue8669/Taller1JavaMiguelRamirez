package entidad;

public enum Mensaje {
	 
    MENSAJE_PETICION_SEGUIMIENTO("Introduzca la nota de seguimiento"),
    
    MENSAJE_PETICION_PARCIAL("Introduzca la nota del parcial"),
   
    MENSAJE_EXAMEN_FINAL("Introduzca la nota del éxamen final"),

    MENSAJE_FINAL_MEJOR45("Excelente tu rendimiento ha sido el mejor"),

    MENSAJE_FINAL_REGULAR39("Tu rendimiento es aceptable, pero finalizaste bien"),

    MENSAJE_FINAL_MAL29("Te sugerimos comprometerte más con el estudio"),

    MENSAJE_FINAL_MAL19("Malas noticias, no cumpliste con el minimo para avanzar"),
    
    MENSAJE_FINAL_MAL09("Nuevamente vuelve a iniciar tus estudios y dedícate");




    private String mensajes;
    
    private Mensaje(String s) 
    {
       this.mensajes=s;
    }

    public String getMensajes()
     {
        return mensajes;
     }

    public void setMensajes(String mensajes) {
        this.mensajes = mensajes;
    }
}
