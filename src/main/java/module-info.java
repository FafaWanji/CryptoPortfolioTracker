module de.fafawanji.cryptoportfoliotracker {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires cryptoprice;

    opens de.fafawanji.cryptoportfoliotracker to javafx.fxml;
    exports de.fafawanji.cryptoportfoliotracker;
}