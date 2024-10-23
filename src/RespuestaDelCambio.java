import com.google.gson.annotations.SerializedName;

public class RespuestaDelCambio {
    @SerializedName("conversion_rate") // Esto asegura que se mapea correctamente al JSON
    public double tasaDeConversion;
}
