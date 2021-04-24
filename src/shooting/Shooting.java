package shooting;

import java.awt.*;

public class Shooting {

    public static ShootingFrame shootingFrame;
    public static boolean loop;
    public static void main(String[] args){
        shootingFrame = new ShootingFrame();
        loop = true;

        Graphics gra = shootingFrame.panel.image.getGraphics();
        //fpsの制御
        long startTime;
        long fpsTime =0;
        int fps = 30;
        int FPS =0;
        int fpsCount =0;
        while(loop){
            if((System.currentTimeMillis()-fpsTime)>= fpsTime){
                fpsTime = System.currentTimeMillis();
                FPS = fpsCount;
                fpsCount =0;
                System.out.println(FPS);
            }
            fpsCount++;

            startTime = System.currentTimeMillis();
            gra.setColor(Color.white);
            gra.fillRect(0,0,800,800);

            gra.setColor(Color.BLACK);
            gra.fillRect(100,100,100,100);

            gra.setColor(Color.BLACK);
            gra.setFont(new Font("SansSerif",Font.PLAIN,20));
            gra.drawString(FPS + "FPS",0,700);

            shootingFrame.panel.draw();

            try {
                Thread.sleep((1000 / fps )- (System.currentTimeMillis() - startTime));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(System.currentTimeMillis()-startTime);

        }
    }
}
