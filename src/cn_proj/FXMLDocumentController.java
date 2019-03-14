/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn_proj;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation.Status;
import javafx.animation.ParallelTransition;
import javafx.animation.PauseTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 *
 * @author Dell
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button startButton;
    @FXML
    private Rectangle rect_1;
    @FXML
    private Rectangle rect_2;
    @FXML
    private Rectangle rect_3;
    @FXML
    private Rectangle rect_4;
    @FXML
    private Rectangle rect_6;
    @FXML
    private Rectangle rect_7;
    @FXML
    private Rectangle rect_8;
    @FXML
    private Rectangle rect_9;
    @FXML
    private Rectangle rect_10;
    @FXML
    private Rectangle rect_11;
    @FXML
    private Rectangle rect_12;
    @FXML
    private Rectangle rect_13;
    @FXML
    private Rectangle rect_14;
    @FXML
    private Rectangle rect_15;
    @FXML
    private Rectangle rect_16;
    @FXML
    private Rectangle rect_17;
    @FXML
    private Rectangle rect_18;
    @FXML
    private Rectangle rect_19;
    @FXML
    private Rectangle rect_20;
    @FXML
    private Rectangle rect_21;
    @FXML
    private Rectangle rect_22;
    @FXML
    private Rectangle rect_23;
    @FXML
    private Rectangle rect_24;
    @FXML
    private Rectangle rect_25;
    @FXML
    private Rectangle rect_5;
    @FXML
    private Rectangle windowMove;
    @FXML
    private Rectangle rect_1_opp;
    @FXML
    private Rectangle rect_2_opp;
    @FXML
    private Rectangle rect_3_opp;
    @FXML
    private Rectangle rect_4_opp;
    @FXML
    private Rectangle rect_6_opp;
    @FXML
    private Rectangle rect_7_opp;
    @FXML
    private Rectangle rect_8_opp;
    @FXML
    private Rectangle rect_9_opp;
    @FXML
    private Rectangle rect_10_opp;
    @FXML
    private Rectangle rect_11_opp;
    @FXML
    private Rectangle rect_12_opp;
    @FXML
    private Rectangle rect_13_opp;
    @FXML
    private Rectangle rect_14_opp;
    @FXML
    private Rectangle rect_15_opp;
    @FXML
    private Rectangle rect_16_opp;
    @FXML
    private Rectangle rect_17_opp;
    @FXML
    private Rectangle rect_18_opp;
    @FXML
    private Rectangle rect_19_opp;
    @FXML
    private Rectangle rect_20_opp;
    @FXML
    private Rectangle rect_21_opp;
    @FXML
    private Rectangle rect_22_opp;
    @FXML
    private Rectangle rect_23_opp;
    @FXML
    private Rectangle rect_24_opp;
    @FXML
    private Rectangle rect_25_opp;
    @FXML
    private RadioButton choice_goBackN;
    @FXML
    private ToggleGroup choice;
    @FXML
    private RadioButton choice_selectiveRepeat;
    @FXML
    private TextField timeout;
    @FXML
    private TextField endToend;
    @FXML
    private Rectangle rect_5_opp;
    
    public boolean isStop;
    public double windowX;
    public double windowY;
    public Rectangle rect[];
    ParallelTransition ptt[];
    TranslateTransition trans[];
    public Rectangle rect_opp[];
    public Label run_label[];
//    public double rectOppX[];
//    public double rectOppY[];
//    public class myTrans implements Runnable {
//        public final double xx;
//        public final double yy;
//        public final int etoe;
//        public final Rectangle rec;
//        myTrans(double x,double y,Rectangle n,int endtoend){
//            xx=x;
//            yy=y;
//            rec=n;
//            etoe=endtoend;
//        }
//        public void run() {
//            TranslateTransition trans= new TranslateTransition();
//            trans.setDuration(Duration.seconds(etoe));
//            trans.setToX(xx);
//            trans.setToY(yy);
//            trans.setAutoReverse(true);
//            trans.setCycleCount(2);
//            trans.setNode(rec);
//            trans.play();
//        }
//    }
    @FXML
    private AnchorPane rootPane;
    @FXML
    private Label run_1;
    @FXML
    private Label run_2;
    @FXML
    private Label run_3;
    @FXML
    private Label run_4;
    @FXML
    private Label run_5;
    @FXML
    private Label run_6;
    @FXML
    private Label run_7;
    @FXML
    private Label run_8;
    @FXML
    private Label run_9;
    @FXML
    private Label run_10;
    @FXML
    private Label run_11;
    @FXML
    private Label run_12;
    @FXML
    private Label run_13;
    @FXML
    private Label run_14;
    @FXML
    private Label run_15;
    @FXML
    private Label run_16;
    @FXML
    private Label run_17;
    @FXML
    private Label run_18;
    @FXML
    private Label run_19;
    @FXML
    private Label run_20;
    @FXML
    private Label run_21;
    @FXML
    private Label run_22;
    @FXML
    private Label run_23;
    @FXML
    private Label run_24;
    @FXML
    private Label run_25;
    private ImageView goo;
    private ImageView stopp;
    private Label key9;
    @FXML
    private Label key1;
    @FXML
    private Rectangle key2;
    private Label key7;
    @FXML
    private Rectangle key4;
    private Rectangle key6;
    @FXML
    private Label key3;
    @FXML
    private Label key5;
    private Rectangle key8;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        TranslateTransition trans[];
        showKeys();
        Image image = new Image(getClass().getResourceAsStream("go.png"));
        goo= new ImageView(image);
        goo.setFitHeight(15);
        goo.setFitWidth(15);
        startButton.setGraphic(goo);
        stopp= new ImageView(new Image(getClass().getResourceAsStream("stop.png")));
        stopp.setFitHeight(15);
        stopp.setFitWidth(15);
        
        isStop=false;
        this.windowX= this.windowMove.getLayoutX();
        this.windowY= this.windowMove.getLayoutY();
//        rectOppX = new double[25];
//        rectOppY = new double[25];
        rect = new Rectangle [25];
        rect_opp = new Rectangle [25];
        run_label = new Label [25];
        ptt = new ParallelTransition[5];
        for(int i=0;i<5;i++)
            ptt[i]=new ParallelTransition();
        rect[0] = rect_1;   rect[5] = rect_6;   rect[10] = rect_11; rect[15] = rect_16; rect[20] = rect_21;
        rect[1] = rect_2;   rect[6] = rect_7;   rect[11] = rect_12; rect[16] = rect_17; rect[21] = rect_22;
        rect[2] = rect_3;   rect[7] = rect_8;   rect[12] = rect_13; rect[17] = rect_18; rect[22] = rect_23;
        rect[3] = rect_4;   rect[8] = rect_9;   rect[13] = rect_14; rect[18] = rect_19; rect[23] = rect_24;
        rect[4] = rect_5;   rect[9] = rect_10;  rect[14] = rect_15; rect[19] = rect_20; rect[24] = rect_25;

        rect_opp[0] = rect_1_opp;   rect_opp[5] = rect_6_opp;   rect_opp[10] = rect_11_opp; rect_opp[15] = rect_16_opp; rect_opp[20] = rect_21_opp;
        rect_opp[1] = rect_2_opp;   rect_opp[6] = rect_7_opp;   rect_opp[11] = rect_12_opp; rect_opp[16] = rect_17_opp; rect_opp[21] = rect_22_opp;
        rect_opp[2] = rect_3_opp;   rect_opp[7] = rect_8_opp;   rect_opp[12] = rect_13_opp; rect_opp[17] = rect_18_opp; rect_opp[22] = rect_23_opp;
        rect_opp[3] = rect_4_opp;   rect_opp[8] = rect_9_opp;   rect_opp[13] = rect_14_opp; rect_opp[18] = rect_19_opp; rect_opp[23] = rect_24_opp;
        rect_opp[4] = rect_5_opp;   rect_opp[9] = rect_10_opp;  rect_opp[14] = rect_15_opp; rect_opp[19] = rect_20_opp; rect_opp[24] = rect_25_opp;        
        
        run_label[0] = run_1;   run_label[5] = run_6;   run_label[10] = run_11; run_label[15] = run_16; run_label[20] = run_21;
        run_label[1] = run_2;   run_label[6] = run_7;   run_label[11] = run_12; run_label[16] = run_17; run_label[21] = run_22;
        run_label[2] = run_3;   run_label[7] = run_8;   run_label[12] = run_13; run_label[17] = run_18; run_label[22] = run_23;
        run_label[3] = run_4;   run_label[8] = run_9;   run_label[13] = run_14; run_label[18] = run_19; run_label[23] = run_24;
        run_label[4] = run_5;   run_label[9] = run_10;  run_label[14] = run_15; run_label[19] = run_20; run_label[24] = run_25;
        for(int i=0;i<25;i++)
            run_label[i].setVisible(false);
    }    

    public void showKeys(){
        key1.setVisible(true);
        key2.setVisible(true);
        key3.setVisible(true);
        key4.setVisible(true);
        key5.setVisible(true);
    }
    
    public void hideKeys(){
        key1.setVisible(false);
        key2.setVisible(false);
        key3.setVisible(false);
        key4.setVisible(false);
        key5.setVisible(false);
    }    
    
    public ParallelTransition success(int i,int endtoend,boolean isGBN){
        trans[i].setDuration(Duration.seconds(endtoend/2));
    //                            trans[i].setToX(rect_opp[i].getLayoutX());
        trans[i].setToY((rect_opp[i].getLayoutY())-125);
        trans[i].setAutoReverse(true);
        trans[i].setCycleCount(2);
        trans[i].setNode(rect[i]);
        run_label[i].setVisible(true);
        //                        trans[i].play();
        trans[i+1].setDuration(Duration.seconds(endtoend/2));
    //                            trans[i+1].setToX(rect_opp[i+1].getLayoutX());
        trans[i+1].setToY((rect_opp[i+1].getLayoutY())-125);
        trans[i+1].setAutoReverse(true);
        trans[i+1].setCycleCount(2);
        trans[i+1].setNode(rect[i+1]);
        trans[i+1].setDelay(Duration.millis(100));
        if(!isGBN)
            run_label[i+1].setVisible(true);
            
        trans[i+2].setDuration(Duration.seconds(endtoend/2));
    //                            trans[i+2].setToX(rect_opp[i+2].getLayoutX());
        trans[i+2].setToY((rect_opp[i+2].getLayoutY())-125);
        trans[i+2].setAutoReverse(true);
        trans[i+2].setCycleCount(2);
        trans[i+2].setNode(rect[i+2]);
        trans[i+2].setDelay(Duration.millis(200));
        if(!isGBN)
            run_label[i+2].setVisible(true);        
        
        trans[i+3].setDuration(Duration.seconds(endtoend/2));
    //                            trans[i+3].setToX(rect_opp[i+3].getLayoutX());
        trans[i+3].setToY((rect_opp[i+3].getLayoutY())-125);
        trans[i+3].setAutoReverse(true);
        trans[i+3].setCycleCount(2);
        trans[i+3].setNode(rect[i+3]);
        trans[i+3].setDelay(Duration.millis(300));
        if(!isGBN)
            run_label[i+3].setVisible(true);
        
        if(i+4<25){    
            trans[i+4].setDuration(Duration.seconds(endtoend/2));
    //                            trans[i+4].setToX(rect_opp[i+4].getLayoutX());
            trans[i+4].setToY((rect_opp[i+4].getLayoutY())-125);
            trans[i+4].setAutoReverse(true);
            trans[i+4].setCycleCount(2);
            trans[i+4].setNode(rect[i+4]);
            trans[i+4].setDelay(Duration.millis(400));
            if(!isGBN)
                run_label[i+4].setVisible(true);
        }
        ParallelTransition pt = new ParallelTransition(
            trans[i],new PauseTransition(Duration.millis(3000)), // wait a second
            trans[i+1],new PauseTransition(Duration.millis(3000)),
            trans[i+2],new PauseTransition(Duration.millis(3000)),       
            trans[i+3],new PauseTransition(Duration.millis(3000)),
            trans[i+4]
        );
//        seqTransition.play();
        pt.play();
        
        trans[i].setOnFinished((ActionEvent event) -> {
            double curr= this.windowMove.getLayoutX();
            if(i<20)
                this.windowMove.setLayoutX(curr+29);
            rect_opp[i].setFill(Color.YELLOW);
            run_label[i].setVisible(false);
        });
        trans[i+1].setOnFinished((ActionEvent event) -> {
            double curr= this.windowMove.getLayoutX();
            if(i<20)
                this.windowMove.setLayoutX(curr+29);
            rect_opp[i+1].setFill(Color.YELLOW);
            run_label[i+1].setVisible(false);
        });
        trans[i+2].setOnFinished((ActionEvent event) -> {
            double curr= this.windowMove.getLayoutX();
            if(i<20)
                this.windowMove.setLayoutX(curr+29);
            rect_opp[i+2].setFill(Color.YELLOW);
            run_label[i+2].setVisible(false);
        });
        trans[i+3].setOnFinished((ActionEvent event) -> {
            double curr= this.windowMove.getLayoutX();
            if(i<20)
                this.windowMove.setLayoutX(curr+29);
            rect_opp[i+3].setFill(Color.YELLOW);
            run_label[i+3].setVisible(false);
        });
        trans[i+4].setOnFinished((ActionEvent event) -> {
            double curr= this.windowMove.getLayoutX();
            if(i<20)
                this.windowMove.setLayoutX(curr+29);
            rect_opp[i+4].setFill(Color.YELLOW);
            run_label[i+4].setVisible(false);
        });        

        return pt;
    }
    public ParallelTransition failure(int i,int endtoend,int timeoutt,boolean isGBN){
        trans[i].setDuration(Duration.seconds(endtoend/2));
    //                            trans[i].setToX(rect_opp[i].getLayoutX());
        trans[i].setToY((rect_opp[i].getLayoutY())-125);
        trans[i].setAutoReverse(true);
        trans[i].setCycleCount(2);
        trans[i].setNode(rect[i]);
        run_label[i].setVisible(true);
        //                        trans[i].play();
        trans[i+1].setDuration(Duration.seconds(endtoend/2));
    //                            trans[i+1].setToX(rect_opp[i+1].getLayoutX());
        trans[i+1].setToY((rect_opp[i+1].getLayoutY())-125);
        trans[i+1].setAutoReverse(true);
        trans[i+1].setCycleCount(2);
        trans[i+1].setNode(rect[i+1]);
        trans[i+1].setDelay(Duration.millis(100));
        if(!isGBN)
            run_label[i+1].setVisible(true);
            
        trans[i+2].setDuration(Duration.seconds(endtoend/2));
    //                            trans[i+2].setToX(rect_opp[i+2].getLayoutX());
        trans[i+2].setToY((rect_opp[i+2].getLayoutY())-125);
        trans[i+2].setAutoReverse(true);
        trans[i+2].setCycleCount(2);
        trans[i+2].setNode(rect[i+2]);
        trans[i+2].setDelay(Duration.millis(200));
        if(!isGBN)
            run_label[i+2].setVisible(true);        
        
        trans[i+3].setDuration(Duration.seconds(endtoend/2));
    //                            trans[i+3].setToX(rect_opp[i+3].getLayoutX());
        trans[i+3].setToY((rect_opp[i+3].getLayoutY())-125);
        trans[i+3].setAutoReverse(true);
        trans[i+3].setCycleCount(2);
        trans[i+3].setNode(rect[i+3]);
        trans[i+3].setDelay(Duration.millis(300));
        if(!isGBN)
            run_label[i+3].setVisible(true);
        
        if(i+4<25){    
            trans[i+4].setDuration(Duration.seconds(endtoend/2));
    //                            trans[i+4].setToX(rect_opp[i+4].getLayoutX());
            trans[i+4].setToY((rect_opp[i+4].getLayoutY())-125);
            trans[i+4].setAutoReverse(true);
            trans[i+4].setCycleCount(2);
            trans[i+4].setNode(rect[i+4]);
            trans[i+4].setDelay(Duration.millis(400));
            if(!isGBN)
                run_label[i+4].setVisible(true);
        }
        ParallelTransition pt = new ParallelTransition(
            trans[i],new PauseTransition(Duration.millis(3000)), // wait a second
            trans[i+1],new PauseTransition(Duration.millis(3000)),
            trans[i+2],new PauseTransition(Duration.millis(3000)),       
            trans[i+3],new PauseTransition(Duration.millis(3000)),
            trans[i+4]
        );
        ParallelTransition ptt = new ParallelTransition();
        int val= endtoend/timeoutt;
        if(endtoend%timeoutt != 0)
            val=val+1;
        double a=0.2;
        for(int j=1;j<=val-1;j++){
            Rectangle rectTmp;
            rectTmp= new Rectangle(rect[i].getWidth(), rect[i].getHeight(), rect[i].getFill());
            rectTmp.setLayoutX(rect[i].getLayoutX());
            rectTmp.setLayoutY(rect[i].getLayoutY());
            this.rootPane.getChildren().add(rectTmp);
            TranslateTransition trans2= new TranslateTransition();
            trans2.setDuration(Duration.seconds(endtoend/2));
            trans2.setToY(rect_opp[i].getLayoutY()-125);
            trans2.setAutoReverse(true);
            trans2.setCycleCount(2);
            trans2.setNode(rectTmp);            
            if(isGBN)
                trans2.setDelay(Duration.seconds(0.6+(j*timeoutt)));           //add 600ms here if needed
            else
                trans2.setDelay(Duration.seconds(0.6+(j*timeoutt)+a));           
            ptt.getChildren().add(trans2);
        }
        a=0.3;
        for(int j=1;j<=val-1;j++){
            Rectangle rectTmp;
            rectTmp= new Rectangle(rect[i+1].getWidth(), rect[i+1].getHeight(), rect[i+1].getFill());
            rectTmp.setLayoutX(rect[i+1].getLayoutX());
            rectTmp.setLayoutY(rect[i+1].getLayoutY());
            this.rootPane.getChildren().add(rectTmp);
            TranslateTransition trans2= new TranslateTransition();
            trans2.setDuration(Duration.seconds(endtoend/2));
            trans2.setToY(rect_opp[i+1].getLayoutY()-125);
            trans2.setAutoReverse(true);
            trans2.setCycleCount(2);
            trans2.setNode(rectTmp);            
            if(isGBN)
                trans2.setDelay(Duration.seconds(0.6+(j*timeoutt)));           //add 600ms here if needed
            else
                trans2.setDelay(Duration.seconds(0.6+(j*timeoutt+a)));           
            ptt.getChildren().add(trans2);
        }
        a=0.4;
        for(int j=1;j<=val-1;j++){
            Rectangle rectTmp;
            rectTmp= new Rectangle(rect[i+2].getWidth(), rect[i+2].getHeight(), rect[i+2].getFill());
            rectTmp.setLayoutX(rect[i+2].getLayoutX());
            rectTmp.setLayoutY(rect[i+2].getLayoutY());
            this.rootPane.getChildren().add(rectTmp);
            TranslateTransition trans2= new TranslateTransition();
            trans2.setDuration(Duration.seconds(endtoend/2));
            trans2.setToY(rect_opp[i+2].getLayoutY()-125);
            trans2.setAutoReverse(true);
            trans2.setCycleCount(2);
            trans2.setNode(rectTmp);            
            if(isGBN)
                trans2.setDelay(Duration.seconds(0.6+(j*timeoutt)));           //add 600ms here if needed
            else
                trans2.setDelay(Duration.seconds(0.6+(j*timeoutt)+a));           
            ptt.getChildren().add(trans2);
        }
        a=0.5;
        for(int j=1;j<=val-1;j++){
            Rectangle rectTmp;
            rectTmp= new Rectangle(rect[i+3].getWidth(), rect[i+3].getHeight(), rect[i+3].getFill());
            rectTmp.setLayoutX(rect[i+3].getLayoutX());
            rectTmp.setLayoutY(rect[i+3].getLayoutY());
            this.rootPane.getChildren().add(rectTmp);
            TranslateTransition trans2= new TranslateTransition();
            trans2.setDuration(Duration.seconds(endtoend/2));
            trans2.setToY(rect_opp[i+3].getLayoutY()-125);
            trans2.setAutoReverse(true);
            trans2.setCycleCount(2);
            trans2.setNode(rectTmp);            
            if(isGBN)
                trans2.setDelay(Duration.seconds(0.6+(j*timeoutt)));           //add 600ms here if needed
            else
                trans2.setDelay(Duration.seconds(0.6+(j*timeoutt)+a));           
            ptt.getChildren().add(trans2);
        }
        a=0.6;
        for(int j=1;j<=val-1;j++){
            Rectangle rectTmp;
            rectTmp= new Rectangle(rect[i+4].getWidth(), rect[i+4].getHeight(), rect[i+4].getFill());
            rectTmp.setLayoutX(rect[i+4].getLayoutX());
            rectTmp.setLayoutY(rect[i+4].getLayoutY());
            this.rootPane.getChildren().add(rectTmp);
            TranslateTransition trans2= new TranslateTransition();
            trans2.setDuration(Duration.seconds(endtoend/2));
            trans2.setToY(rect_opp[i+4].getLayoutY()-125);
            trans2.setAutoReverse(true);
            trans2.setCycleCount(2);
            trans2.setNode(rectTmp);
            if(isGBN)
                trans2.setDelay(Duration.seconds(0.6+(j*timeoutt)));           //add 600ms here if needed
            else
                trans2.setDelay(Duration.seconds(0.6+(j*timeoutt)+a));
            ptt.getChildren().add(trans2);
        }        
        pt.play();
        ptt.play();
        
        trans[i].setOnFinished((ActionEvent event) -> {
            double curr= this.windowMove.getLayoutX();
            if(i<20)
                this.windowMove.setLayoutX(curr+29);
            rect_opp[i].setFill(Color.YELLOW);
            run_label[i].setVisible(false);
        });
        trans[i+1].setOnFinished((ActionEvent event) -> {
            double curr= this.windowMove.getLayoutX();
            if(i<20)
                this.windowMove.setLayoutX(curr+29);
            rect_opp[i+1].setFill(Color.YELLOW);
            run_label[i+1].setVisible(false);
        });
        trans[i+2].setOnFinished((ActionEvent event) -> {
            double curr= this.windowMove.getLayoutX();
            if(i<20)
                this.windowMove.setLayoutX(curr+29);
            rect_opp[i+2].setFill(Color.YELLOW);
            run_label[i+2].setVisible(false);
        });
        trans[i+3].setOnFinished((ActionEvent event) -> {
            double curr= this.windowMove.getLayoutX();
            if(i<20)
                this.windowMove.setLayoutX(curr+29);
            rect_opp[i+3].setFill(Color.YELLOW);
            run_label[i+3].setVisible(false);
        });
        trans[i+4].setOnFinished((ActionEvent event) -> {
            double curr= this.windowMove.getLayoutX();
            if(i<20)
                this.windowMove.setLayoutX(curr+29);
            rect_opp[i+4].setFill(Color.YELLOW);
            run_label[i+4].setVisible(false);
        });        

        return pt;
    }
    public void toggleText(){
        if(this.startButton.getText().equalsIgnoreCase("Start"))
            this.startButton.setText("Reset");
        else if(this.startButton.getText().equalsIgnoreCase("Reset"))
            this.startButton.setText("Start");
    }
    public boolean isInt(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch(Exception e){
            return false;
        }
            
    }
    @FXML
    private void startAction(ActionEvent event) throws InterruptedException {
//        String packetStatus[]= new String[25];
        if(isInt(timeout.getText()) && isInt(endToend.getText())){
        
        boolean running = false;
        if(ptt[0]!=null)
        for(int i=0;i<5;i++)
            if(ptt[i].getStatus().equals(Status.RUNNING))
                running=true;
        
        int timeoutt;
        int endtoend;
        timeoutt= Integer.parseInt(this.timeout.getText());
        endtoend= Integer.parseInt(this.endToend.getText());
        
        if(!running){
            hideKeys();
            startButton.setGraphic(stopp);
            toggleText();
            if(!this.startButton.getText().equalsIgnoreCase("Reset")){
                this.timeout.setText("");
                this.endToend.setText("");
            }

            trans= new TranslateTransition[25];
            for(int i=0;i<25;i++){
                trans[i]=new TranslateTransition();
            }

            if(isStop==false){
                isStop=true;
                if(this.choice_goBackN.isSelected()){  //Go Back N code.

                            boolean timeoutWillOccur;
                            if(timeoutt<endtoend) 
                                timeoutWillOccur=true;   //packet no sucess resend packet
                            else
                                timeoutWillOccur=false;   //packet success

                            if(!timeoutWillOccur){   //success packet
                                ptt[0]=success(0,endtoend,true);
                                ptt[0].setOnFinished((ActionEvent eventt) -> {
                                    ptt[1]=success(5,endtoend,true);
                                    ptt[1].setOnFinished((ActionEvent eventtt) -> {
                                        ptt[2]=success(10,endtoend,true);
                                            ptt[2].setOnFinished((ActionEvent eventttt) -> { 
                                                ptt[3]=success(15,endtoend,true);                                        
                                                    ptt[3].setOnFinished((ActionEvent eventtttt) -> { 
                                                        ptt[4]=success(20,endtoend,true);                                        
                                                    });
                                            });
                                });
                                });        

//                            ptt[4].setOnFinished((ActionEvent eventtttt) -> {
//                                this.windowMove.setLayoutX(this.windowX);
//                            });
                            }
                            else{   //unsuccess packet ... resend
                                ptt[0]=failure(0,endtoend,timeoutt,true);
                                ptt[0].setOnFinished((ActionEvent eventt) -> {
                                    ptt[1]=failure(5,endtoend,timeoutt,true);
                                    ptt[1].setOnFinished((ActionEvent eventtt) -> {
                                        ptt[2]=failure(10,endtoend,timeoutt,true);
                                            ptt[2].setOnFinished((ActionEvent eventttt) -> { 
                                                ptt[3]=failure(15,endtoend,timeoutt,true);                                        
                                                    ptt[3].setOnFinished((ActionEvent eventtttt) -> { 
                                                        ptt[4]=failure(20,endtoend,timeoutt,true);                                        
                                                    });
                                            });
                                });
                                });        

//                            ptt[4].setOnFinished((ActionEvent eventtttt) -> {
//                                this.windowMove.setLayoutX(this.windowX);
//                            });                        


                            }

                }
                else{                 //Selective repeat code
                    boolean timeoutWillOccur;
                    if(timeoutt<endtoend) 
                        timeoutWillOccur=true;   //packet no sucess resend packet
                    else
                        timeoutWillOccur=false;   //packet success

                    if(!timeoutWillOccur){                        //success packet
                        ptt[0]=success(0,endtoend,false);
                        ptt[0].setOnFinished((ActionEvent eventt) -> {
                            ptt[1]=success(5,endtoend,false);
                            ptt[1].setOnFinished((ActionEvent eventtt) -> {
                                ptt[2]=success(10,endtoend,false);
                                    ptt[2].setOnFinished((ActionEvent eventttt) -> { 
                                        ptt[3]=success(15,endtoend,false);                                        
                                            ptt[3].setOnFinished((ActionEvent eventtttt) -> { 
                                                ptt[4]=success(20,endtoend,false);                                        
                                            });
                                    });
                        });
                        });        

//                    ptt[4].setOnFinished((ActionEvent eventtttt) -> { 
//                        this.windowMove.setLayoutX(this.windowX);
//                    });
                    }
                    else{   //unsuccess packet ... resend
                        ptt[0]=failure(0,endtoend,timeoutt,false);
                        ptt[0].setOnFinished((ActionEvent eventt) -> {
                            ptt[1]=failure(5,endtoend,timeoutt,false);
                            ptt[1].setOnFinished((ActionEvent eventtt) -> {
                                ptt[2]=failure(10,endtoend,timeoutt,false);
                                    ptt[2].setOnFinished((ActionEvent eventttt) -> { 
                                        ptt[3]=failure(15,endtoend,timeoutt,false);                                        
                                            ptt[3].setOnFinished((ActionEvent eventtttt) -> { 
                                                ptt[4]=failure(20,endtoend,timeoutt,false);                                        
                                            });
                                    });
                        });
                        });        

//                    ptt[4].setOnFinished((ActionEvent eventtttt) -> {
//                        this.windowMove.setLayoutX(this.windowX);
//                    });                        


                    }
                }
            }
            else{
                showKeys();
                startButton.setGraphic(goo);
                isStop=false;
                for(int i=0;i<25;i++){
                    this.run_label[i].setVisible(false);
                    this.rect_opp[i].setFill(Color.LIGHTBLUE);
//                    this.rect[i].setFill(Color.DEEPSKYBLUE);
                }
                this.windowMove.setLayoutX(this.windowX);
                ptt = new ParallelTransition[5];

            }
        }
        else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Simulation already Running.");
            alert.setContentText("Please wait for current simulations to end.");

            alert.showAndWait();            
        }
        }else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Invalid Input");
            alert.setContentText("Only Numeric data is accepted in fields");

            alert.showAndWait();
        }
    }

    
}
