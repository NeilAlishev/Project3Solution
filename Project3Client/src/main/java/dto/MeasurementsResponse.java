package dto;

import java.util.List;

/**
 * @author Neil Alishev
 */
public class MeasurementsResponse {
    List<MeasurementDTO> measurements;

    public List<MeasurementDTO> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<MeasurementDTO> measurements) {
        this.measurements = measurements;
    }
}
