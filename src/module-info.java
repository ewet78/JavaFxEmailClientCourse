module JavaFxEmailClientCourse {
    requires javafx.swt;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.swing;
    requires javafx.web;
    requires activation;
    requires java.mail;
    requires java.desktop;

    opens com.ewelina;
    opens com.ewelina.view;
    opens com.ewelina.controller;
    opens com.ewelina.model;

}