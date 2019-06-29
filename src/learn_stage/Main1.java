package learn_stage;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main1 extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage)throws Exception{
        primaryStage.setTitle("javafx");
        primaryStage.getIcons().add(new Image("https://gss0.baidu.com/-4o3dSag_xI4khGko9WTAnF6hhy/zhidao/pic/item/fcfaaf51f3deb48f30a15c6efe1f3a292cf578b2.jpg"));
        primaryStage.setIconified(true);
       primaryStage.setMaximized(true);
         primaryStage.close();
         //primaryStage.setResizable(false);

       primaryStage.setWidth(500);
       primaryStage.setHeight(500);

        primaryStage.setMaxHeight(1000);
       primaryStage.setMaxWidth(1000);
       primaryStage.setMinHeight(300);
       primaryStage.setMinWidth(300);

        //System.out.println("宽度=" + primaryStage.getWidth());

        primaryStage.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("当前高度="+ newValue.doubleValue());
            }
        });
        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("当前宽度="+ newValue.doubleValue());
            }
        });
       // primaryStage.setFullScreen(true);
        primaryStage.setScene(new Scene(new Group()));

        primaryStage.show();



    }


}


