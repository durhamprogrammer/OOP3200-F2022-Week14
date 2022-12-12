module ca.durhamcollege.oop3200f2022week14 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.durhamcollege.oop3200f2022week14 to javafx.fxml;
    exports ca.durhamcollege.oop3200f2022week14;
    exports ca.durhamcollege.oop3200f2022week14.core;
    opens  ca.durhamcollege.oop3200f2022week14.core to javafx.fxml;
    exports ca.durhamcollege.oop3200f2022week14.objects;
    opens  ca.durhamcollege.oop3200f2022week14.objects to javafx.fxml;
    exports ca.durhamcollege.oop3200f2022week14.Controllers;
    opens  ca.durhamcollege.oop3200f2022week14.Controllers to javafx.fxml;
    exports ca.durhamcollege.oop3200f2022week14.Managers;
    opens  ca.durhamcollege.oop3200f2022week14.Managers to javafx.fxml;
}