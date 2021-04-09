module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires jid3lib;

    exports pl.Abramczyk.mp3player.main to javafx.graphics;
    opens pl.Abramczyk.mp3player.controller to javafx.fxml;
    opens pl.Abramczyk.mp3player.mp3 to javafx.base;
}