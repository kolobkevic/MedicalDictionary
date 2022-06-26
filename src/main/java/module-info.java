module com.kolobkevic.medical_dictionary {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.kolobkevic.medical_dictionary to javafx.fxml;
    exports com.kolobkevic.medical_dictionary;
}